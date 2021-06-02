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
package org.eclipse.emfcloud.coffee.workflow.glsp.server;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.handler.WorkflowOperationActionHandler;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.handler.WorkflowRequestMarkersActionHandler;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.handler.WorkflowSaveModelActionHandler;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.handler.operation.ApplyLabelEditOperationHandler;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.handler.operation.ChangeBoundsOperationHandler;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.handler.operation.ChangeRoutingPointsOperationHandler;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.handler.operation.CreateAutomatedTaskHandler;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.handler.operation.CreateDecisionNodeHandler;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.handler.operation.CreateFlowHandler;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.handler.operation.CreateManualTaskHandler;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.handler.operation.CreateMergeNodeHandler;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.handler.operation.CreateWeightedFlowHandler;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.handler.operation.DeleteOperationHandler;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.handler.operation.ReconnectFlowHandler;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.model.WorkflowModelFactory;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.model.WorkflowModelStateProvider;
import org.eclipse.emfcloud.modelserver.edit.CommandCodec;
import org.eclipse.glsp.graph.GraphExtension;
import org.eclipse.glsp.server.actions.ActionHandler;
import org.eclipse.glsp.server.actions.SaveModelActionHandler;
import org.eclipse.glsp.server.di.DefaultGLSPModule;
import org.eclipse.glsp.server.diagram.DiagramConfiguration;
import org.eclipse.glsp.server.features.commandpalette.CommandPaletteActionProvider;
import org.eclipse.glsp.server.features.contextmenu.ContextMenuItemProvider;
import org.eclipse.glsp.server.features.core.model.ModelFactory;
import org.eclipse.glsp.server.features.directediting.LabelEditValidator;
import org.eclipse.glsp.server.features.undoredo.UndoRedoActionHandler;
import org.eclipse.glsp.server.features.validation.RequestMarkersHandler;
import org.eclipse.glsp.server.layout.ILayoutEngine;
import org.eclipse.glsp.server.layout.ServerLayoutConfiguration;
import org.eclipse.glsp.server.model.ModelStateProvider;
import org.eclipse.glsp.server.operations.OperationActionHandler;
import org.eclipse.glsp.server.operations.OperationHandler;
import org.eclipse.glsp.server.operations.gmodel.ChangeRoutingPointsHandler;
import org.eclipse.glsp.server.operations.gmodel.CutOperationHandler;
import org.eclipse.glsp.server.operations.gmodel.LayoutOperationHandler;
import org.eclipse.glsp.server.operations.gmodel.PasteOperationHandler;
import org.eclipse.glsp.server.operations.gmodel.ReconnectEdgeOperationHandler;
import org.eclipse.glsp.server.protocol.GLSPServer;
import org.eclipse.glsp.server.utils.MultiBinding;

public class WorkflowGLSPModule extends DefaultGLSPModule {

	@Override
	protected Class<? extends ModelFactory> bindModelFactory() {
		return WorkflowModelFactory.class;
	}
	
	@Override
	protected Class<? extends ServerLayoutConfiguration> bindServerLayoutConfiguration() {
		return WorkflowServerLayoutConfiguration.class;
	}

	@Override
	protected Class<? extends ModelStateProvider> bindModelStateProvider() {
		return WorkflowModelStateProvider.class;
	}

	@Override
	@SuppressWarnings("rawtypes")
	protected Class<? extends GLSPServer> bindGLSPServer() {
		return WorkflowGLSPServer.class;
	}

	@Override
	protected void configureActionHandlers(MultiBinding<ActionHandler> bindings) {
		super.configureActionHandlers(bindings);
		bindings.rebind(OperationActionHandler.class, WorkflowOperationActionHandler.class);
		bindings.rebind(SaveModelActionHandler.class, WorkflowSaveModelActionHandler.class);
		bindings.rebind(RequestMarkersHandler.class, WorkflowRequestMarkersActionHandler.class);
		// TODO inject own undo/redo once incremental model server is ready
		bindings.remove(UndoRedoActionHandler.class);
	}

	@Override
	protected void configureOperationHandlers(MultiBinding<OperationHandler> bindings) {
		super.configureOperationHandlers(bindings);
		
		// model server-aware operation handlers
		bindings.rebind(org.eclipse.glsp.server.operations.gmodel.ChangeBoundsOperationHandler.class, ChangeBoundsOperationHandler.class);
		bindings.rebind(org.eclipse.glsp.server.features.directediting.ApplyLabelEditOperationHandler.class, ApplyLabelEditOperationHandler.class);
		bindings.rebind(org.eclipse.glsp.server.operations.gmodel.DeleteOperationHandler.class, DeleteOperationHandler.class);
		bindings.rebind(ChangeRoutingPointsHandler.class, ChangeRoutingPointsOperationHandler.class);
		bindings.rebind(ReconnectEdgeOperationHandler.class, ReconnectFlowHandler.class);
		
		// unsupported operation handlers
		bindings.remove(CutOperationHandler.class);
		bindings.remove(PasteOperationHandler.class);
		bindings.remove(LayoutOperationHandler.class);
		
		// custom workflow operation handlers
		bindings.add(CreateAutomatedTaskHandler.class);
		bindings.add(CreateManualTaskHandler.class);
		bindings.add(CreateDecisionNodeHandler.class);
		bindings.add(CreateMergeNodeHandler.class);
		bindings.add(CreateFlowHandler.class);
		bindings.add(CreateWeightedFlowHandler.class);
	}

	@Override
	protected Class<? extends GraphExtension> bindGraphExtension() {
		return WorkflowGraphExtension.class;
	}

	@Override
	protected void configureDiagramConfigurations(MultiBinding<DiagramConfiguration> bindings) {
		bindings.add(WorfklowDiagramNotationConfiguration.class);
	}

	@Override
	protected Class<? extends CommandPaletteActionProvider> bindCommandPaletteActionProvider() {
		return WorkflowCommandPaletteActionProvider.class;
	}

	@Override
	protected Class<? extends ContextMenuItemProvider> bindContextMenuItemProvider() {
		return WorkflowContextMenuItemProvider.class;
	}
	
	@Override
	protected Class<? extends LabelEditValidator> bindLabelEditValidator(){
		return WorkflowLabelEditValidator.class;
	}

	@Override
	protected Class<? extends ILayoutEngine> bindLayoutEngine() {
		return WorkflowLayoutEngine.class;
	}

	@Override
	public void configure() {
		super.configure();
		bind(AdapterFactory.class).toInstance(new ComposedAdapterFactory());
	}

}
