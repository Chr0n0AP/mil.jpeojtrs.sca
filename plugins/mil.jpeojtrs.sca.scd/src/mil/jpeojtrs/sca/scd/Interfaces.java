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
package mil.jpeojtrs.sca.scd;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interfaces</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.Interfaces#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.scd.ScdPackage#getInterfaces()
 * @model extendedMetaData="name='interfaces' kind='elementOnly'"
 * @generated
 */
public interface Interfaces extends EObject {

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.scd.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getInterfaces_Interface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='interface' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Interface> getInterface();

} // Interfaces
