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
import java.util.Map;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emfcloud.coffee.CoffeePackage;
import org.eclipse.emfcloud.coffee.Merge;
import org.eclipse.emfcloud.coffee.util.CoffeeValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merge</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MergeImpl extends NodeImpl implements Merge {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeePackage.Literals.MERGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean hasTwoIncoming(DiagnosticChain chain, Map<?, ?> context) {
		if (countIncomingFlows()!=2) {
			if (chain != null) {
				chain.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CoffeeValidator.DIAGNOSTIC_SOURCE,
						 CoffeeValidator.MERGE__HAS_TWO_INCOMING,
						 "Merge node must have exactly two incoming flows",
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
	public boolean hasOneOutgoing(DiagnosticChain chain, Map<?, ?> context) {
		if (countOutgoingFlows()!=1) {
			if (chain != null) {
				chain.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CoffeeValidator.DIAGNOSTIC_SOURCE,
						 CoffeeValidator.MERGE__HAS_ONE_OUTGOING,
						 "Merge node must have exactly one outgoing flows",
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CoffeePackage.MERGE___HAS_TWO_INCOMING__DIAGNOSTICCHAIN_MAP:
				return hasTwoIncoming((DiagnosticChain)arguments.get(0), (Map<?, ?>)arguments.get(1));
			case CoffeePackage.MERGE___HAS_ONE_OUTGOING__DIAGNOSTICCHAIN_MAP:
				return hasOneOutgoing((DiagnosticChain)arguments.get(0), (Map<?, ?>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //MergeImpl
