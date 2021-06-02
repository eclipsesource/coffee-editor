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
package org.eclipse.emfcloud.coffee.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emfcloud.coffee.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emfcloud.coffee.CoffeePackage
 * @generated
 */
public class CoffeeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CoffeeValidator INSTANCE = new CoffeeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.emfcloud.coffee";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Cycle' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__HAS_CYCLE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has At Most One Incoming' of 'Task'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TASK__HAS_AT_MOST_ONE_INCOMING = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has At Most One Outgoing' of 'Task'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TASK__HAS_AT_MOST_ONE_OUTGOING = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Is Used' of 'Task'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TASK__IS_USED = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has One Incoming' of 'Decision'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DECISION__HAS_ONE_INCOMING = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Two Outgoing' of 'Decision'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DECISION__HAS_TWO_OUTGOING = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Two Incoming' of 'Merge'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MERGE__HAS_TWO_INCOMING = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has One Outgoing' of 'Merge'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MERGE__HAS_ONE_OUTGOING = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoffeeValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CoffeePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CoffeePackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case CoffeePackage.MACHINE:
				return validateMachine((Machine)value, diagnostics, context);
			case CoffeePackage.CONTROL_UNIT:
				return validateControlUnit((ControlUnit)value, diagnostics, context);
			case CoffeePackage.BREWING_UNIT:
				return validateBrewingUnit((BrewingUnit)value, diagnostics, context);
			case CoffeePackage.DIP_TRAY:
				return validateDipTray((DipTray)value, diagnostics, context);
			case CoffeePackage.WATER_TANK:
				return validateWaterTank((WaterTank)value, diagnostics, context);
			case CoffeePackage.PROCESSOR:
				return validateProcessor((Processor)value, diagnostics, context);
			case CoffeePackage.DIMENSION:
				return validateDimension((Dimension)value, diagnostics, context);
			case CoffeePackage.RAM:
				return validateRAM((RAM)value, diagnostics, context);
			case CoffeePackage.DISPLAY:
				return validateDisplay((Display)value, diagnostics, context);
			case CoffeePackage.WORKFLOW:
				return validateWorkflow((Workflow)value, diagnostics, context);
			case CoffeePackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case CoffeePackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case CoffeePackage.AUTOMATIC_TASK:
				return validateAutomaticTask((AutomaticTask)value, diagnostics, context);
			case CoffeePackage.MANUAL_TASK:
				return validateManualTask((ManualTask)value, diagnostics, context);
			case CoffeePackage.FORK:
				return validateFork((Fork)value, diagnostics, context);
			case CoffeePackage.JOIN:
				return validateJoin((Join)value, diagnostics, context);
			case CoffeePackage.DECISION:
				return validateDecision((Decision)value, diagnostics, context);
			case CoffeePackage.MERGE:
				return validateMerge((Merge)value, diagnostics, context);
			case CoffeePackage.FLOW:
				return validateFlow((Flow)value, diagnostics, context);
			case CoffeePackage.WEIGHTED_FLOW:
				return validateWeightedFlow((WeightedFlow)value, diagnostics, context);
			case CoffeePackage.SOCKET_CONNECTOR_TYPE:
				return validateSocketConnectorType((SocketConnectorType)value, diagnostics, context);
			case CoffeePackage.MANUFACTORING_PROCESS:
				return validateManufactoringProcess((ManufactoringProcess)value, diagnostics, context);
			case CoffeePackage.RAM_TYPE:
				return validateRamType((RamType)value, diagnostics, context);
			case CoffeePackage.PROBABILITY:
				return validateProbability((Probability)value, diagnostics, context);
			case CoffeePackage.TASK_NAME:
				return validateTaskName((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine(Machine machine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(machine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlUnit(ControlUnit controlUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBrewingUnit(BrewingUnit brewingUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(brewingUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDipTray(DipTray dipTray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dipTray, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWaterTank(WaterTank waterTank, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(waterTank, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessor(Processor processor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimension(Dimension dimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dimension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRAM(RAM ram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplay(Display display, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(display, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workflow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(node, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_hasCycle(node, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasCycle constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_hasCycle(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.hasCycle(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(task, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_hasCycle(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_hasAtMostOneIncoming(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_hasAtMostOneOutgoing(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_isUsed(task, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasAtMostOneIncoming constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_hasAtMostOneIncoming(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return task.hasAtMostOneIncoming(diagnostics, context);
	}

	/**
	 * Validates the hasAtMostOneOutgoing constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_hasAtMostOneOutgoing(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return task.hasAtMostOneOutgoing(diagnostics, context);
	}

	/**
	 * Validates the isUsed constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_isUsed(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return task.isUsed(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutomaticTask(AutomaticTask automaticTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(automaticTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(automaticTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(automaticTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(automaticTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(automaticTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(automaticTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(automaticTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(automaticTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(automaticTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_hasCycle(automaticTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_hasAtMostOneIncoming(automaticTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_hasAtMostOneOutgoing(automaticTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_isUsed(automaticTask, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManualTask(ManualTask manualTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manualTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_hasCycle(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_hasAtMostOneIncoming(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_hasAtMostOneOutgoing(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_isUsed(manualTask, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFork(Fork fork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fork, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_hasCycle(fork, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoin(Join join, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(join, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(join, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_hasCycle(join, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecision(Decision decision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(decision, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_hasCycle(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecision_hasOneIncoming(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecision_hasTwoOutgoing(decision, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasOneIncoming constraint of '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecision_hasOneIncoming(Decision decision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return decision.hasOneIncoming(diagnostics, context);
	}

	/**
	 * Validates the hasTwoOutgoing constraint of '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecision_hasTwoOutgoing(Decision decision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return decision.hasTwoOutgoing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMerge(Merge merge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(merge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(merge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(merge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(merge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(merge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(merge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(merge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(merge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(merge, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_hasCycle(merge, diagnostics, context);
		if (result || diagnostics != null) result &= validateMerge_hasTwoIncoming(merge, diagnostics, context);
		if (result || diagnostics != null) result &= validateMerge_hasOneOutgoing(merge, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasTwoIncoming constraint of '<em>Merge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMerge_hasTwoIncoming(Merge merge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return merge.hasTwoIncoming(diagnostics, context);
	}

	/**
	 * Validates the hasOneOutgoing constraint of '<em>Merge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMerge_hasOneOutgoing(Merge merge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return merge.hasOneOutgoing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlow(Flow flow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeightedFlow(WeightedFlow weightedFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weightedFlow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocketConnectorType(SocketConnectorType socketConnectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufactoringProcess(ManufactoringProcess manufactoringProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRamType(RamType ramType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProbability(Probability probability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskName(String taskName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTaskName_Pattern(taskName, diagnostics, context);
		if (result || diagnostics != null) result &= validateTaskName_MinLength(taskName, diagnostics, context);
		if (result || diagnostics != null) result &= validateTaskName_MaxLength(taskName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTaskName_Pattern
	 */
	public static final  PatternMatcher [][] TASK_NAME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z0-9%20\\- ]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Task Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskName_Pattern(String taskName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(CoffeePackage.Literals.TASK_NAME, taskName, TASK_NAME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Task Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskName_MinLength(String taskName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = taskName.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(CoffeePackage.Literals.TASK_NAME, taskName, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Task Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskName_MaxLength(String taskName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = taskName.length();
		boolean result = length <= 20;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(CoffeePackage.Literals.TASK_NAME, taskName, length, 20, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CoffeeValidator
