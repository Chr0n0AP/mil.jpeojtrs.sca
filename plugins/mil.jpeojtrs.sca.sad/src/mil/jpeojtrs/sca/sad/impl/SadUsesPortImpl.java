/*******************************************************************************
 * This file is protected by Copyright. 
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under 
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
// BEGIN GENERATED CODE
package mil.jpeojtrs.sca.sad.impl;

import mil.jpeojtrs.sca.partitioning.impl.UsesPortImpl;
import mil.jpeojtrs.sca.sad.SadComponentInstantiationRef;
import mil.jpeojtrs.sca.sad.SadPackage;
import mil.jpeojtrs.sca.sad.SadUsesPort;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uses Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SadUsesPortImpl extends UsesPortImpl<SadComponentInstantiationRef> implements SadUsesPort {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SadUsesPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SadPackage.Literals.SAD_USES_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetComponentInstantiationRef(SadComponentInstantiationRef newComponentInstantiationRef, NotificationChain msgs) {
		return super.basicSetComponentInstantiationRef(newComponentInstantiationRef, msgs);
	}

} //SadUsesPortImpl
