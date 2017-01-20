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
package mil.jpeojtrs.sca.partitioning;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Used By Application</b></em>'.
 * @since 2.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.DeviceUsedByApplication#getUsesRefId <em>Uses Ref Id</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getDeviceUsedByApplication()
 * @model extendedMetaData="kind='elementOnly' name='deviceusedbyapplication' qualified='false'"
 * @generated
 */
public interface DeviceUsedByApplication extends EObject {
	/**
	 * Returns the value of the '<em><b>Uses Ref Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Ref Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Ref Id</em>' attribute.
	 * @see #setUsesRefId(String)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getDeviceUsedByApplication_UsesRefId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='usesrefid'"
	 * @generated
	 */
	String getUsesRefId();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.DeviceUsedByApplication#getUsesRefId <em>Uses Ref Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Ref Id</em>' attribute.
	 * @see #getUsesRefId()
	 * @generated
	 */
	void setUsesRefId(String value);

} // DeviceUsedByApplication
