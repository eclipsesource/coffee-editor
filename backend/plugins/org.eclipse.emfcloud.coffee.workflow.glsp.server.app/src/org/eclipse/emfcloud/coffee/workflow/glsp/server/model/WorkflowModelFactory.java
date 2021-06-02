/*******************************************************************************
 * Copyright (c) 2019-2020 EclipseSource and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 ******************************************************************************/
package org.eclipse.emfcloud.coffee.workflow.glsp.server.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emfcloud.coffee.Flow;
import org.eclipse.emfcloud.coffee.Machine;
import org.eclipse.emfcloud.coffee.Node;
import org.eclipse.emfcloud.coffee.Task;
import org.eclipse.emfcloud.coffee.WeightedFlow;
import org.eclipse.emfcloud.coffee.Workflow;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.ModelServerClientProvider;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.util.WorkflowBuilder.ActivityNodeBuilder;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.util.WorkflowBuilder.TaskNodeBuilder;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.util.WorkflowBuilder.WeightedEdgeBuilder;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.wfgraph.ActivityNode;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.wfgraph.TaskNode;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.wfgraph.WeightedEdge;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.wfnotation.DiagramElement;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.wfnotation.Edge;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.wfnotation.Shape;
import org.eclipse.emfcloud.modelserver.client.ModelServerClient;
import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GEdge;
import org.eclipse.glsp.graph.GModelRoot;
import org.eclipse.glsp.graph.GNode;
import org.eclipse.glsp.graph.builder.impl.GEdgeBuilder;
import org.eclipse.glsp.graph.builder.impl.GGraphBuilder;
import org.eclipse.glsp.server.actions.ActionDispatcher;
import org.eclipse.glsp.server.features.core.model.ModelFactory;
import org.eclipse.glsp.server.features.core.model.RequestModelAction;
import org.eclipse.glsp.server.model.GModelState;
import org.eclipse.glsp.server.protocol.ClientSessionListener;
import org.eclipse.glsp.server.protocol.ClientSessionManager;
import org.eclipse.glsp.server.protocol.GLSPClient;
import org.eclipse.glsp.server.utils.ClientOptions;

import com.google.inject.Inject;

public class WorkflowModelFactory implements ModelFactory {
	private static Logger LOGGER = Logger.getLogger(WorkflowModelFactory.class);
	private static final String ROOT_ID = "sprotty";
	public static final String OPTION_WORKFLOW_INDEX = "workflowIndex";
	public static final int WORKFLOW_INDEX_DEFAULT = 0;

	@Inject
	private ModelServerClientProvider modelServerClientProvider;

	@Inject
	private ClientSessionManager clientSessionManager;

	@Inject
	private ActionDispatcher actionProcessor;

	@Inject
	private AdapterFactory adapterFactory;

	@Override
	public GModelRoot loadModel(RequestModelAction action, GModelState modelState) {
		// 1. Load models and create workflow facade
		Optional<String> sourceURI = ClientOptions.getValue(action.getOptions(), ClientOptions.SOURCE_URI);
		if (sourceURI.isEmpty()) {
			LOGGER.error("No source uri given to load model, return empty model.");
			return createEmptyRoot();
		}
		Optional<ModelServerClient> modelServerClient = modelServerClientProvider.get();
		if (modelServerClient.isEmpty()) {
			LOGGER.error("Connection to modelserver has not been initialized, return empty model");
			return createEmptyRoot();
		}

		WorkflowValidationResultChangeListener changeListener = new WorkflowValidationResultChangeListener(modelState, actionProcessor);
		WorkflowModelServerAccess modelAccess = new WorkflowModelServerAccess(sourceURI.get(), modelServerClient.get(),
				adapterFactory, changeListener);
		modelAccess.subscribe(new WorkflowModelServerSubscriptionListener(modelState, modelAccess, actionProcessor));
		this.clientSessionManager.addListener(new ClientSessionListener() {
			@Override
			public void sessionClosed(String clientId, GLSPClient client) {
				modelAccess.unsubscribe();
				clientSessionManager.removeListener(this);
			}
		});

		if (modelState instanceof WorkflowModelState) {
			((WorkflowModelState) modelState).setModelAccess(modelAccess);
		}

		WorkflowFacade workflowFacade = modelAccess.getWorkflowFacade();
		if (workflowFacade == null) {
			return createEmptyRoot();
		}

		// 2. Check if request model action can be fulfilled
		Optional<Integer> givenWorkflowIndex = ClientOptions.getIntValue(action.getOptions(), OPTION_WORKFLOW_INDEX);
		int workflowIndex = givenWorkflowIndex.orElse(WORKFLOW_INDEX_DEFAULT);
		if (givenWorkflowIndex.isEmpty()) {
			LOGGER.warn("No workflow index given to create model, use workflow with index: " + workflowIndex);
		}
		Optional<Machine> machine = workflowFacade.getMachine();
		if (machine.isEmpty() || workflowIndex < 0 || machine.get().getWorkflows().size() <= workflowIndex) {
			LOGGER.error("No workflow with index " + workflowIndex + " in " + machine + ", return empty model.");
			return createEmptyRoot();
		}

		// 3. Set current workflow
		workflowFacade.setCurrentWorkflowIndex(workflowIndex);
		MappedGModelRoot mappedGModelRoot = populate(workflowFacade, modelState);
		
		modelAccess.setNodeMapping(mappedGModelRoot.getMapping());
		modelAccess.initConstraintList();
		modelAccess.subscribeToValidation();

		return mappedGModelRoot.getRoot();
	}

	public static MappedGModelRoot populate(WorkflowFacade workflowFacade, GModelState modelState) {
		Workflow workflow = workflowFacade.getCurrentWorkflow();

		GModelRoot root = createEmptyRoot();
		modelState.setRoot(root);

		workflowFacade.initializeNotation(workflow);
		root.setId(workflowFacade.findDiagram(workflow).get().getGraphicId());
		Map<Node, GNode> nodeMapping = new HashMap<>();
		for (Node node : workflow.getNodes()) {
			workflowFacade.findDiagramElement(node, Shape.class) //
					.flatMap(shape -> toGNode(node, shape, modelState)) //
					.ifPresent(gnode -> {
						nodeMapping.put(node, gnode);
						root.getChildren().add(gnode);
					});
		}

		for (Flow flow : workflow.getFlows()) {
			workflowFacade.findDiagramElement(flow, Edge.class)
					.flatMap(edge -> toGEdge(flow, edge, nodeMapping, modelState)) //
					.ifPresent(root.getChildren()::add);
		}
		return new MappedGModelRoot(root, nodeMapping);
	}

	private static GModelRoot createEmptyRoot() {
		return new GGraphBuilder(DefaultTypes.GRAPH)//
				.id(ROOT_ID) //
				.build();
	}

	private static Optional<GEdge> toGEdge(Flow flow, Edge edge, Map<Node, GNode> nodeMapping, GModelState modelState) {
		GEdge gedge = flow instanceof WeightedFlow
				? createWeightedEdge((WeightedFlow) flow, edge, nodeMapping, modelState)
				: createEdge(flow, edge, nodeMapping, modelState);
		return Optional.ofNullable(gedge);
	}

	private static Optional<GNode> toGNode(Node node, DiagramElement shape, GModelState modelState) {
		GNode gnode = node instanceof Task //
				? createTaskNode((Task) node, (Shape) shape, modelState)
				: createActivityNode(node, (Shape) shape, modelState);
		return Optional.ofNullable(gnode);
	}

	private static WeightedEdge createWeightedEdge(WeightedFlow flow, Edge edge, Map<Node, GNode> nodeMapping,
			GModelState modelState) {
		WeightedEdgeBuilder builder = new WeightedEdgeBuilder() //
				.probability(flow.getProbability().getName()) //
				.source(nodeMapping.get(flow.getSource())) //
				.target(nodeMapping.get(flow.getTarget()));
		edge.getBendPoints().forEach(bendPoint -> builder.addRoutingPoint(bendPoint.getX(), bendPoint.getY()));
		builder.id(edge.getGraphicId());
		return builder.build();
	}

	private static GEdge createEdge(Flow flow, Edge edge, Map<Node, GNode> nodeMapping, GModelState modelState) {
		GEdgeBuilder builder = new GEdgeBuilder();
		builder.source(nodeMapping.get(flow.getSource()));
		builder.target(nodeMapping.get(flow.getTarget()));
		edge.getBendPoints().forEach(bendPoint -> builder.addRoutingPoint(bendPoint.getX(), bendPoint.getY()));
		builder.id(edge.getGraphicId());
		return builder.build();
	}

	private static TaskNode createTaskNode(Task task, Shape shape, GModelState modelState) {
		String type = CoffeeTypeUtil.toType(task);
		String nodeType = CoffeeTypeUtil.toNodeType(task);
		TaskNodeBuilder builder = new TaskNodeBuilder(type, task.getName(), nodeType, task.getDuration());
		if (shape.getPosition() != null) {
			builder.position(shape.getPosition().getX(), shape.getPosition().getY());
		}
		if (shape.getSize() != null) {
			builder.size(shape.getSize().getWidth(), shape.getSize().getHeight());
		}
		builder.id(shape.getGraphicId());

		return builder.build();
	}

	private static ActivityNode createActivityNode(Node node, Shape shape, GModelState modelState) {
		String type = CoffeeTypeUtil.toType(node);
		String nodeType = CoffeeTypeUtil.toNodeType(node);
		ActivityNodeBuilder builder = new ActivityNodeBuilder(type, nodeType);
		if (shape.getPosition() != null) {
			builder.position(shape.getPosition().getX(), shape.getPosition().getY());
		}
		if (shape.getSize() != null) {
			builder.size(shape.getSize().getWidth(), shape.getSize().getHeight());
		}
		builder.id(shape.getGraphicId());
		return builder.build();
	}

}

