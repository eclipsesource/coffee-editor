/**
 * Copyright (c) 2021 EclipseSource and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 * 
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */
package org.eclipse.emfcloud.coffee.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emfcloud.coffee.CoffeePackage;
import org.eclipse.emfcloud.coffee.Decision;
import org.eclipse.emfcloud.coffee.Flow;
import org.eclipse.emfcloud.coffee.Merge;
import org.eclipse.emfcloud.coffee.Node;
import org.eclipse.emfcloud.coffee.Workflow;
import org.eclipse.emfcloud.coffee.util.CoffeeValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int countIncomingFlows() {
		return incomingFlows().size();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int countOutgoingFlows() {
		return outgoingFlows().size();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public List<Flow> incomingFlows() {
		List<Flow> flows = new ArrayList<Flow>();
		Workflow workflow = (Workflow) this.eContainer();
		for(Flow flow : workflow.getFlows()) {
			if(flow.getTarget() == this) flows.add(flow);
		}
		return flows;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public List<Flow> outgoingFlows() {
		List<Flow> flows = new ArrayList<Flow>();
		Workflow workflow = (Workflow) this.eContainer();
		for(Flow flow : workflow.getFlows()) {
			if(flow.getSource() == this) flows.add(flow);
		}
		return flows;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeePackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean hasCycle(DiagnosticChain chain, Map<?, ?> context) {
		boolean hasCycle = false;
		hasCycle = hasCycleRec(this, this, new ArrayList<Node>(), (Workflow) this.eContainer());
		if (!hasCycle) {
			hasCycle = checkPreviousDecisionNode(this, new ArrayList<Node>());
		}
		if (hasCycle) {
			if (chain != null) {
				chain.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CoffeeValidator.DIAGNOSTIC_SOURCE,
						 CoffeeValidator.NODE__HAS_CYCLE,
						 "Cycle detected",
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean hasCycleRec(Node goal, Node current,
			List<Node> visited, Workflow workflow) {
		if(current.outgoingFlows().size()==0) return false;
		if(current instanceof Decision) return decisionHasCycle(goal, current, visited, workflow);
		return nodeHasCycle(goal, current, visited, workflow);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean decisionHasCycle(Node goal, Node current,
			List<Node> visited, Workflow workflow) {
		for (Flow flow : current.outgoingFlows()) {
			if(!(hasCycleRec(this, flow.getTarget(), copyVisited(visited), workflow))) return false;
		}
		return true;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean nodeHasCycle(Node goal, Node current,
		List<Node> visited, Workflow workflow) {
		for (Flow flow : current.outgoingFlows()) {
			if(flow.getTarget() == goal) return true;
			else {
				if(!visited.contains(flow.getTarget())) {
					visited.add(flow.getTarget());
					return hasCycleRec(goal, flow.getTarget(), visited, workflow);
				}
			}
		}
		return false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean checkPreviousDecisionNode(Node current, List<Node> visited) {
		for (Flow flow: current.incomingFlows()) {
			Node source = flow.getSource();
			if(source instanceof Merge) return false;
			if(source instanceof Decision) {
				return source.hasCycleRec(source, source,
						new ArrayList<Node>(), (Workflow) source.eContainer());
			}
			if(!visited.contains(current)) {
				visited.add(current);
				return checkPreviousDecisionNode(source, visited);
			}
		}
		return false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<Node> copyVisited(List<Node> visited) {
		List<Node> copy = new ArrayList<Node>();
		for(Node node: visited) {
			copy.add(node);
		}
		return copy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CoffeePackage.NODE___HAS_CYCLE__DIAGNOSTICCHAIN_MAP:
				return hasCycle((DiagnosticChain)arguments.get(0), (Map<?, ?>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //NodeImpl
