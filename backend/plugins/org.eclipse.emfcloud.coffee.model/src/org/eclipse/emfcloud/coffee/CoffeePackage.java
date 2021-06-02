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
package org.eclipse.emfcloud.coffee;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emfcloud.coffee.CoffeeFactory
 * @model kind="package"
 * @generated
 */
public interface CoffeePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "coffee";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emfcloud/coffee/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emfcloud.coffee.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoffeePackage eINSTANCE = org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.impl.ComponentImpl
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CHILDREN = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PARENT = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.impl.MachineImpl
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__CHILDREN = COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAME = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__WORKFLOWS = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.impl.ControlUnitImpl <em>Control Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.impl.ControlUnitImpl
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getControlUnit()
	 * @generated
	 */
	int CONTROL_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CHILDREN = COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__PROCESSOR = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__DIMENSION = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ram</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__RAM = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__DISPLAY = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__USER_DESCRIPTION = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Control Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Control Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.impl.BrewingUnitImpl <em>Brewing Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.impl.BrewingUnitImpl
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getBrewingUnit()
	 * @generated
	 */
	int BREWING_UNIT = 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREWING_UNIT__CHILDREN = COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREWING_UNIT__PARENT = COMPONENT__PARENT;

	/**
	 * The number of structural features of the '<em>Brewing Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREWING_UNIT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Brewing Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREWING_UNIT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.impl.DipTrayImpl <em>Dip Tray</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.impl.DipTrayImpl
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getDipTray()
	 * @generated
	 */
	int DIP_TRAY = 4;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIP_TRAY__CHILDREN = COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIP_TRAY__PARENT = COMPONENT__PARENT;

	/**
	 * The number of structural features of the '<em>Dip Tray</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIP_TRAY_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dip Tray</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIP_TRAY_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.impl.WaterTankImpl <em>Water Tank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.impl.WaterTankImpl
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getWaterTank()
	 * @generated
	 */
	int WATER_TANK = 5;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_TANK__CHILDREN = COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_TANK__PARENT = COMPONENT__PARENT;

	/**
	 * The number of structural features of the '<em>Water Tank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_TANK_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Water Tank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_TANK_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.impl.ProcessorImpl
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 6;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__VENDOR = 0;

	/**
	 * The feature id for the '<em><b>Clock Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__CLOCK_SPEED = 1;

	/**
	 * The feature id for the '<em><b>Number Of Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NUMBER_OF_CORES = 2;

	/**
	 * The feature id for the '<em><b>Socketconnector Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__SOCKETCONNECTOR_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Thermal Design Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__THERMAL_DESIGN_POWER = 4;

	/**
	 * The feature id for the '<em><b>Manufactoring Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__MANUFACTORING_PROCESS = 5;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.impl.DimensionImpl
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 7;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__HEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__LENGTH = 2;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.impl.RAMImpl <em>RAM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.impl.RAMImpl
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getRAM()
	 * @generated
	 */
	int RAM = 8;

	/**
	 * The feature id for the '<em><b>Clock Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM__CLOCK_SPEED = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM__TYPE = 2;

	/**
	 * The number of structural features of the '<em>RAM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>RAM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.impl.DisplayImpl <em>Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.impl.DisplayImpl
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getDisplay()
	 * @generated
	 */
	int DISPLAY = 9;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__HEIGHT = 1;

	/**
	 * The number of structural features of the '<em>Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.impl.WorkflowImpl
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NODES = 1;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__FLOWS = 2;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.impl.NodeImpl
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 11;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Has Cycle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_CYCLE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.impl.TaskImpl
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DURATION = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has Cycle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___HAS_CYCLE__DIAGNOSTICCHAIN_MAP = NODE___HAS_CYCLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has At Most One Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___HAS_AT_MOST_ONE_INCOMING__DIAGNOSTICCHAIN_MAP = NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Has At Most One Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___HAS_AT_MOST_ONE_OUTGOING__DIAGNOSTICCHAIN_MAP = NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___IS_USED__DIAGNOSTICCHAIN_MAP = NODE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = NODE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.impl.AutomaticTaskImpl <em>Automatic Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.impl.AutomaticTaskImpl
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getAutomaticTask()
	 * @generated
	 */
	int AUTOMATIC_TASK = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_TASK__DURATION = TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_TASK__COMPONENT = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Automatic Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Cycle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_TASK___HAS_CYCLE__DIAGNOSTICCHAIN_MAP = TASK___HAS_CYCLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has At Most One Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_TASK___HAS_AT_MOST_ONE_INCOMING__DIAGNOSTICCHAIN_MAP = TASK___HAS_AT_MOST_ONE_INCOMING__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has At Most One Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_TASK___HAS_AT_MOST_ONE_OUTGOING__DIAGNOSTICCHAIN_MAP = TASK___HAS_AT_MOST_ONE_OUTGOING__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_TASK___IS_USED__DIAGNOSTICCHAIN_MAP = TASK___IS_USED__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Automatic Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.impl.ManualTaskImpl <em>Manual Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.impl.ManualTaskImpl
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getManualTask()
	 * @generated
	 */
	int MANUAL_TASK = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__DURATION = TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__ACTOR = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Manual Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Cycle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK___HAS_CYCLE__DIAGNOSTICCHAIN_MAP = TASK___HAS_CYCLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has At Most One Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK___HAS_AT_MOST_ONE_INCOMING__DIAGNOSTICCHAIN_MAP = TASK___HAS_AT_MOST_ONE_INCOMING__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has At Most One Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK___HAS_AT_MOST_ONE_OUTGOING__DIAGNOSTICCHAIN_MAP = TASK___HAS_AT_MOST_ONE_OUTGOING__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK___IS_USED__DIAGNOSTICCHAIN_MAP = TASK___IS_USED__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Manual Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.impl.ForkImpl <em>Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.impl.ForkImpl
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getFork()
	 * @generated
	 */
	int FORK = 15;

	/**
	 * The number of structural features of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has Cycle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK___HAS_CYCLE__DIAGNOSTICCHAIN_MAP = NODE___HAS_CYCLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.impl.JoinImpl
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 16;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has Cycle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___HAS_CYCLE__DIAGNOSTICCHAIN_MAP = NODE___HAS_CYCLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.impl.DecisionImpl
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 17;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has Cycle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION___HAS_CYCLE__DIAGNOSTICCHAIN_MAP = NODE___HAS_CYCLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION___HAS_ONE_INCOMING__DIAGNOSTICCHAIN_MAP = NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Has Two Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION___HAS_TWO_OUTGOING__DIAGNOSTICCHAIN_MAP = NODE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_OPERATION_COUNT = NODE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.impl.MergeImpl <em>Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.impl.MergeImpl
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getMerge()
	 * @generated
	 */
	int MERGE = 18;

	/**
	 * The number of structural features of the '<em>Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has Cycle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE___HAS_CYCLE__DIAGNOSTICCHAIN_MAP = NODE___HAS_CYCLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has Two Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE___HAS_TWO_INCOMING__DIAGNOSTICCHAIN_MAP = NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Has One Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE___HAS_ONE_OUTGOING__DIAGNOSTICCHAIN_MAP = NODE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_OPERATION_COUNT = NODE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.impl.FlowImpl
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 19;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.impl.WeightedFlowImpl <em>Weighted Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.impl.WeightedFlowImpl
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getWeightedFlow()
	 * @generated
	 */
	int WEIGHTED_FLOW = 20;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTED_FLOW__SOURCE = FLOW__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTED_FLOW__TARGET = FLOW__TARGET;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTED_FLOW__PROBABILITY = FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Weighted Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTED_FLOW_FEATURE_COUNT = FLOW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Weighted Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTED_FLOW_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.SocketConnectorType <em>Socket Connector Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.SocketConnectorType
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getSocketConnectorType()
	 * @generated
	 */
	int SOCKET_CONNECTOR_TYPE = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.ManufactoringProcess <em>Manufactoring Process</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.ManufactoringProcess
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getManufactoringProcess()
	 * @generated
	 */
	int MANUFACTORING_PROCESS = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.RamType <em>Ram Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.RamType
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getRamType()
	 * @generated
	 */
	int RAM_TYPE = 23;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.coffee.Probability <em>Probability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.coffee.Probability
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getProbability()
	 * @generated
	 */
	int PROBABILITY = 24;


	/**
	 * The meta object id for the '<em>Task Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getTaskName()
	 * @generated
	 */
	int TASK_NAME = 25;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.coffee.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.eclipse.emfcloud.coffee.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emfcloud.coffee.Component#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.emfcloud.coffee.Component#getChildren()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Children();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emfcloud.coffee.Component#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.emfcloud.coffee.Component#getParent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Parent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.coffee.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see org.eclipse.emfcloud.coffee.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.coffee.Machine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emfcloud.coffee.Machine#getName()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emfcloud.coffee.Machine#getWorkflows <em>Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workflows</em>'.
	 * @see org.eclipse.emfcloud.coffee.Machine#getWorkflows()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Workflows();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.coffee.ControlUnit <em>Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Unit</em>'.
	 * @see org.eclipse.emfcloud.coffee.ControlUnit
	 * @generated
	 */
	EClass getControlUnit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emfcloud.coffee.ControlUnit#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processor</em>'.
	 * @see org.eclipse.emfcloud.coffee.ControlUnit#getProcessor()
	 * @see #getControlUnit()
	 * @generated
	 */
	EReference getControlUnit_Processor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emfcloud.coffee.ControlUnit#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimension</em>'.
	 * @see org.eclipse.emfcloud.coffee.ControlUnit#getDimension()
	 * @see #getControlUnit()
	 * @generated
	 */
	EReference getControlUnit_Dimension();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emfcloud.coffee.ControlUnit#getRam <em>Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ram</em>'.
	 * @see org.eclipse.emfcloud.coffee.ControlUnit#getRam()
	 * @see #getControlUnit()
	 * @generated
	 */
	EReference getControlUnit_Ram();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emfcloud.coffee.ControlUnit#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display</em>'.
	 * @see org.eclipse.emfcloud.coffee.ControlUnit#getDisplay()
	 * @see #getControlUnit()
	 * @generated
	 */
	EReference getControlUnit_Display();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.coffee.ControlUnit#getUserDescription <em>User Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Description</em>'.
	 * @see org.eclipse.emfcloud.coffee.ControlUnit#getUserDescription()
	 * @see #getControlUnit()
	 * @generated
	 */
	EAttribute getControlUnit_UserDescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.coffee.BrewingUnit <em>Brewing Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brewing Unit</em>'.
	 * @see org.eclipse.emfcloud.coffee.BrewingUnit
	 * @generated
	 */
	EClass getBrewingUnit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.coffee.DipTray <em>Dip Tray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dip Tray</em>'.
	 * @see org.eclipse.emfcloud.coffee.DipTray
	 * @generated
	 */
	EClass getDipTray();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.coffee.WaterTank <em>Water Tank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Water Tank</em>'.
	 * @see org.eclipse.emfcloud.coffee.WaterTank
	 * @generated
	 */
	EClass getWaterTank();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.coffee.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see org.eclipse.emfcloud.coffee.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.coffee.Processor#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.eclipse.emfcloud.coffee.Processor#getVendor()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.coffee.Processor#getClockSpeed <em>Clock Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock Speed</em>'.
	 * @see org.eclipse.emfcloud.coffee.Processor#getClockSpeed()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_ClockSpeed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.coffee.Processor#getNumberOfCores <em>Number Of Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Cores</em>'.
	 * @see org.eclipse.emfcloud.coffee.Processor#getNumberOfCores()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_NumberOfCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.coffee.Processor#getSocketconnectorType <em>Socketconnector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Socketconnector Type</em>'.
	 * @see org.eclipse.emfcloud.coffee.Processor#getSocketconnectorType()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_SocketconnectorType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.coffee.Processor#getThermalDesignPower <em>Thermal Design Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thermal Design Power</em>'.
	 * @see org.eclipse.emfcloud.coffee.Processor#getThermalDesignPower()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_ThermalDesignPower();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.coffee.Processor#getManufactoringProcess <em>Manufactoring Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufactoring Process</em>'.
	 * @see org.eclipse.emfcloud.coffee.Processor#getManufactoringProcess()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_ManufactoringProcess();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.coffee.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see org.eclipse.emfcloud.coffee.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.coffee.Dimension#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.emfcloud.coffee.Dimension#getWidth()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.coffee.Dimension#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.emfcloud.coffee.Dimension#getHeight()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.coffee.Dimension#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.emfcloud.coffee.Dimension#getLength()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Length();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.coffee.RAM <em>RAM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RAM</em>'.
	 * @see org.eclipse.emfcloud.coffee.RAM
	 * @generated
	 */
	EClass getRAM();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.coffee.RAM#getClockSpeed <em>Clock Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock Speed</em>'.
	 * @see org.eclipse.emfcloud.coffee.RAM#getClockSpeed()
	 * @see #getRAM()
	 * @generated
	 */
	EAttribute getRAM_ClockSpeed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.coffee.RAM#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.emfcloud.coffee.RAM#getSize()
	 * @see #getRAM()
	 * @generated
	 */
	EAttribute getRAM_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.coffee.RAM#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emfcloud.coffee.RAM#getType()
	 * @see #getRAM()
	 * @generated
	 */
	EAttribute getRAM_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.coffee.Display <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display</em>'.
	 * @see org.eclipse.emfcloud.coffee.Display
	 * @generated
	 */
	EClass getDisplay();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.coffee.Display#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.emfcloud.coffee.Display#getWidth()
	 * @see #getDisplay()
	 * @generated
	 */
	EAttribute getDisplay_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.coffee.Display#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.emfcloud.coffee.Display#getHeight()
	 * @see #getDisplay()
	 * @generated
	 */
	EAttribute getDisplay_Height();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.coffee.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see org.eclipse.emfcloud.coffee.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.coffee.Workflow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emfcloud.coffee.Workflow#getName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emfcloud.coffee.Workflow#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.eclipse.emfcloud.coffee.Workflow#getNodes()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emfcloud.coffee.Workflow#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flows</em>'.
	 * @see org.eclipse.emfcloud.coffee.Workflow#getFlows()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Flows();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.coffee.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.eclipse.emfcloud.coffee.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the '{@link org.eclipse.emfcloud.coffee.Node#hasCycle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Cycle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Cycle</em>' operation.
	 * @see org.eclipse.emfcloud.coffee.Node#hasCycle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNode__HasCycle__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.coffee.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.eclipse.emfcloud.coffee.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.coffee.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emfcloud.coffee.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.coffee.Task#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.eclipse.emfcloud.coffee.Task#getDuration()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Duration();

	/**
	 * Returns the meta object for the '{@link org.eclipse.emfcloud.coffee.Task#hasAtMostOneIncoming(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has At Most One Incoming</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has At Most One Incoming</em>' operation.
	 * @see org.eclipse.emfcloud.coffee.Task#hasAtMostOneIncoming(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTask__HasAtMostOneIncoming__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.emfcloud.coffee.Task#hasAtMostOneOutgoing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has At Most One Outgoing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has At Most One Outgoing</em>' operation.
	 * @see org.eclipse.emfcloud.coffee.Task#hasAtMostOneOutgoing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTask__HasAtMostOneOutgoing__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.emfcloud.coffee.Task#isUsed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Is Used</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Used</em>' operation.
	 * @see org.eclipse.emfcloud.coffee.Task#isUsed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTask__IsUsed__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.coffee.AutomaticTask <em>Automatic Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automatic Task</em>'.
	 * @see org.eclipse.emfcloud.coffee.AutomaticTask
	 * @generated
	 */
	EClass getAutomaticTask();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emfcloud.coffee.AutomaticTask#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see org.eclipse.emfcloud.coffee.AutomaticTask#getComponent()
	 * @see #getAutomaticTask()
	 * @generated
	 */
	EReference getAutomaticTask_Component();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.coffee.ManualTask <em>Manual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manual Task</em>'.
	 * @see org.eclipse.emfcloud.coffee.ManualTask
	 * @generated
	 */
	EClass getManualTask();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.coffee.ManualTask#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actor</em>'.
	 * @see org.eclipse.emfcloud.coffee.ManualTask#getActor()
	 * @see #getManualTask()
	 * @generated
	 */
	EAttribute getManualTask_Actor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.coffee.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork</em>'.
	 * @see org.eclipse.emfcloud.coffee.Fork
	 * @generated
	 */
	EClass getFork();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.coffee.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see org.eclipse.emfcloud.coffee.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.coffee.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see org.eclipse.emfcloud.coffee.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the '{@link org.eclipse.emfcloud.coffee.Decision#hasOneIncoming(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has One Incoming</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has One Incoming</em>' operation.
	 * @see org.eclipse.emfcloud.coffee.Decision#hasOneIncoming(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDecision__HasOneIncoming__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.emfcloud.coffee.Decision#hasTwoOutgoing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Two Outgoing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Two Outgoing</em>' operation.
	 * @see org.eclipse.emfcloud.coffee.Decision#hasTwoOutgoing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDecision__HasTwoOutgoing__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.coffee.Merge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge</em>'.
	 * @see org.eclipse.emfcloud.coffee.Merge
	 * @generated
	 */
	EClass getMerge();

	/**
	 * Returns the meta object for the '{@link org.eclipse.emfcloud.coffee.Merge#hasTwoIncoming(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Two Incoming</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Two Incoming</em>' operation.
	 * @see org.eclipse.emfcloud.coffee.Merge#hasTwoIncoming(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMerge__HasTwoIncoming__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.emfcloud.coffee.Merge#hasOneOutgoing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has One Outgoing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has One Outgoing</em>' operation.
	 * @see org.eclipse.emfcloud.coffee.Merge#hasOneOutgoing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMerge__HasOneOutgoing__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.coffee.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see org.eclipse.emfcloud.coffee.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emfcloud.coffee.Flow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.emfcloud.coffee.Flow#getSource()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emfcloud.coffee.Flow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.emfcloud.coffee.Flow#getTarget()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.coffee.WeightedFlow <em>Weighted Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weighted Flow</em>'.
	 * @see org.eclipse.emfcloud.coffee.WeightedFlow
	 * @generated
	 */
	EClass getWeightedFlow();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.coffee.WeightedFlow#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see org.eclipse.emfcloud.coffee.WeightedFlow#getProbability()
	 * @see #getWeightedFlow()
	 * @generated
	 */
	EAttribute getWeightedFlow_Probability();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emfcloud.coffee.SocketConnectorType <em>Socket Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Socket Connector Type</em>'.
	 * @see org.eclipse.emfcloud.coffee.SocketConnectorType
	 * @generated
	 */
	EEnum getSocketConnectorType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emfcloud.coffee.ManufactoringProcess <em>Manufactoring Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Manufactoring Process</em>'.
	 * @see org.eclipse.emfcloud.coffee.ManufactoringProcess
	 * @generated
	 */
	EEnum getManufactoringProcess();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emfcloud.coffee.RamType <em>Ram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ram Type</em>'.
	 * @see org.eclipse.emfcloud.coffee.RamType
	 * @generated
	 */
	EEnum getRamType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emfcloud.coffee.Probability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Probability</em>'.
	 * @see org.eclipse.emfcloud.coffee.Probability
	 * @generated
	 */
	EEnum getProbability();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Task Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Task Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="maxLength='20' minLength='1' pattern='[a-zA-Z0-9%2520\\-%20]+'"
	 * @generated
	 */
	EDataType getTaskName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoffeeFactory getCoffeeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.impl.ComponentImpl
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CHILDREN = eINSTANCE.getComponent_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PARENT = eINSTANCE.getComponent_Parent();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.impl.MachineImpl
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__NAME = eINSTANCE.getMachine_Name();

		/**
		 * The meta object literal for the '<em><b>Workflows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__WORKFLOWS = eINSTANCE.getMachine_Workflows();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.impl.ControlUnitImpl <em>Control Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.impl.ControlUnitImpl
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getControlUnit()
		 * @generated
		 */
		EClass CONTROL_UNIT = eINSTANCE.getControlUnit();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_UNIT__PROCESSOR = eINSTANCE.getControlUnit_Processor();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_UNIT__DIMENSION = eINSTANCE.getControlUnit_Dimension();

		/**
		 * The meta object literal for the '<em><b>Ram</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_UNIT__RAM = eINSTANCE.getControlUnit_Ram();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_UNIT__DISPLAY = eINSTANCE.getControlUnit_Display();

		/**
		 * The meta object literal for the '<em><b>User Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_UNIT__USER_DESCRIPTION = eINSTANCE.getControlUnit_UserDescription();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.impl.BrewingUnitImpl <em>Brewing Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.impl.BrewingUnitImpl
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getBrewingUnit()
		 * @generated
		 */
		EClass BREWING_UNIT = eINSTANCE.getBrewingUnit();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.impl.DipTrayImpl <em>Dip Tray</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.impl.DipTrayImpl
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getDipTray()
		 * @generated
		 */
		EClass DIP_TRAY = eINSTANCE.getDipTray();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.impl.WaterTankImpl <em>Water Tank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.impl.WaterTankImpl
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getWaterTank()
		 * @generated
		 */
		EClass WATER_TANK = eINSTANCE.getWaterTank();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.impl.ProcessorImpl
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__VENDOR = eINSTANCE.getProcessor_Vendor();

		/**
		 * The meta object literal for the '<em><b>Clock Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__CLOCK_SPEED = eINSTANCE.getProcessor_ClockSpeed();

		/**
		 * The meta object literal for the '<em><b>Number Of Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__NUMBER_OF_CORES = eINSTANCE.getProcessor_NumberOfCores();

		/**
		 * The meta object literal for the '<em><b>Socketconnector Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__SOCKETCONNECTOR_TYPE = eINSTANCE.getProcessor_SocketconnectorType();

		/**
		 * The meta object literal for the '<em><b>Thermal Design Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__THERMAL_DESIGN_POWER = eINSTANCE.getProcessor_ThermalDesignPower();

		/**
		 * The meta object literal for the '<em><b>Manufactoring Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__MANUFACTORING_PROCESS = eINSTANCE.getProcessor_ManufactoringProcess();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.impl.DimensionImpl
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__WIDTH = eINSTANCE.getDimension_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__HEIGHT = eINSTANCE.getDimension_Height();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__LENGTH = eINSTANCE.getDimension_Length();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.impl.RAMImpl <em>RAM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.impl.RAMImpl
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getRAM()
		 * @generated
		 */
		EClass RAM = eINSTANCE.getRAM();

		/**
		 * The meta object literal for the '<em><b>Clock Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAM__CLOCK_SPEED = eINSTANCE.getRAM_ClockSpeed();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAM__SIZE = eINSTANCE.getRAM_Size();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAM__TYPE = eINSTANCE.getRAM_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.impl.DisplayImpl <em>Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.impl.DisplayImpl
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getDisplay()
		 * @generated
		 */
		EClass DISPLAY = eINSTANCE.getDisplay();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY__WIDTH = eINSTANCE.getDisplay_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY__HEIGHT = eINSTANCE.getDisplay_Height();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.impl.WorkflowImpl
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__NAME = eINSTANCE.getWorkflow_Name();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__NODES = eINSTANCE.getWorkflow_Nodes();

		/**
		 * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__FLOWS = eINSTANCE.getWorkflow_Flows();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.impl.NodeImpl
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Has Cycle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___HAS_CYCLE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNode__HasCycle__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.impl.TaskImpl
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DURATION = eINSTANCE.getTask_Duration();

		/**
		 * The meta object literal for the '<em><b>Has At Most One Incoming</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___HAS_AT_MOST_ONE_INCOMING__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTask__HasAtMostOneIncoming__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Has At Most One Outgoing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___HAS_AT_MOST_ONE_OUTGOING__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTask__HasAtMostOneOutgoing__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Is Used</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___IS_USED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTask__IsUsed__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.impl.AutomaticTaskImpl <em>Automatic Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.impl.AutomaticTaskImpl
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getAutomaticTask()
		 * @generated
		 */
		EClass AUTOMATIC_TASK = eINSTANCE.getAutomaticTask();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATIC_TASK__COMPONENT = eINSTANCE.getAutomaticTask_Component();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.impl.ManualTaskImpl <em>Manual Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.impl.ManualTaskImpl
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getManualTask()
		 * @generated
		 */
		EClass MANUAL_TASK = eINSTANCE.getManualTask();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANUAL_TASK__ACTOR = eINSTANCE.getManualTask_Actor();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.impl.ForkImpl <em>Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.impl.ForkImpl
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getFork()
		 * @generated
		 */
		EClass FORK = eINSTANCE.getFork();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.impl.JoinImpl
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.impl.DecisionImpl
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '<em><b>Has One Incoming</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION___HAS_ONE_INCOMING__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDecision__HasOneIncoming__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Has Two Outgoing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION___HAS_TWO_OUTGOING__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDecision__HasTwoOutgoing__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.impl.MergeImpl <em>Merge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.impl.MergeImpl
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getMerge()
		 * @generated
		 */
		EClass MERGE = eINSTANCE.getMerge();

		/**
		 * The meta object literal for the '<em><b>Has Two Incoming</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MERGE___HAS_TWO_INCOMING__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMerge__HasTwoIncoming__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Has One Outgoing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MERGE___HAS_ONE_OUTGOING__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMerge__HasOneOutgoing__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.impl.FlowImpl
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SOURCE = eINSTANCE.getFlow_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__TARGET = eINSTANCE.getFlow_Target();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.impl.WeightedFlowImpl <em>Weighted Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.impl.WeightedFlowImpl
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getWeightedFlow()
		 * @generated
		 */
		EClass WEIGHTED_FLOW = eINSTANCE.getWeightedFlow();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEIGHTED_FLOW__PROBABILITY = eINSTANCE.getWeightedFlow_Probability();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.SocketConnectorType <em>Socket Connector Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.SocketConnectorType
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getSocketConnectorType()
		 * @generated
		 */
		EEnum SOCKET_CONNECTOR_TYPE = eINSTANCE.getSocketConnectorType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.ManufactoringProcess <em>Manufactoring Process</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.ManufactoringProcess
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getManufactoringProcess()
		 * @generated
		 */
		EEnum MANUFACTORING_PROCESS = eINSTANCE.getManufactoringProcess();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.RamType <em>Ram Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.RamType
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getRamType()
		 * @generated
		 */
		EEnum RAM_TYPE = eINSTANCE.getRamType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.coffee.Probability <em>Probability</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.coffee.Probability
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getProbability()
		 * @generated
		 */
		EEnum PROBABILITY = eINSTANCE.getProbability();

		/**
		 * The meta object literal for the '<em>Task Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.emfcloud.coffee.impl.CoffeePackageImpl#getTaskName()
		 * @generated
		 */
		EDataType TASK_NAME = eINSTANCE.getTaskName();

	}

} //CoffeePackage
