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
package mil.jpeojtrs.sca.prf.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.prf.PropertyContainer;
import mil.jpeojtrs.sca.prf.SimpleRef;
import mil.jpeojtrs.sca.prf.SimpleSequenceRef;
import mil.jpeojtrs.sca.prf.Struct;
import mil.jpeojtrs.sca.prf.StructRef;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.jacorb.JacorbUtil;
import org.omg.CORBA.Any;

import CF.DataType;
import CF.PropertiesHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.StructRefImpl#getSimpleRef <em>Simple Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.StructRefImpl#getSimpleSequenceRef <em>Simple Sequence Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructRefImpl extends AbstractPropertyRefImpl<Struct> implements StructRef {
	/**
	 * The cached value of the '{@link #getSimpleRef() <em>Simple Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleRef()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleRef> simpleRef;

	/**
	 * The cached value of the '{@link #getSimpleSequenceRef() <em>Simple Sequence Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 4.1
	 * <!-- end-user-doc -->
	 * @see #getSimpleSequenceRef()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleSequenceRef> simpleSequenceRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrfPackage.Literals.STRUCT_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 *  @since 3.0
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setProperty(Struct newProperty) {
		super.setProperty(newProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleRef> getSimpleRef() {
		if (simpleRef == null) {
			simpleRef = new EObjectContainmentEList<SimpleRef>(SimpleRef.class, this, PrfPackage.STRUCT_REF__SIMPLE_REF);
		}
		return simpleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.1
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleSequenceRef> getSimpleSequenceRef() {
		if (simpleSequenceRef == null) {
			simpleSequenceRef = new EObjectContainmentEList<SimpleSequenceRef>(SimpleSequenceRef.class, this, PrfPackage.STRUCT_REF__SIMPLE_SEQUENCE_REF);
		}
		return simpleSequenceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public PropertyContainer getPropertyContainer() {
		// END GENERATED CODE
		return getProperty();
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PrfPackage.STRUCT_REF__SIMPLE_REF:
			return ((InternalEList< ? >) getSimpleRef()).basicRemove(otherEnd, msgs);
		case PrfPackage.STRUCT_REF__SIMPLE_SEQUENCE_REF:
			return ((InternalEList< ? >) getSimpleSequenceRef()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PrfPackage.STRUCT_REF__SIMPLE_REF:
			return getSimpleRef();
		case PrfPackage.STRUCT_REF__SIMPLE_SEQUENCE_REF:
			return getSimpleSequenceRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PrfPackage.STRUCT_REF__SIMPLE_REF:
			getSimpleRef().clear();
			getSimpleRef().addAll((Collection< ? extends SimpleRef>) newValue);
			return;
		case PrfPackage.STRUCT_REF__SIMPLE_SEQUENCE_REF:
			getSimpleSequenceRef().clear();
			getSimpleSequenceRef().addAll((Collection< ? extends SimpleSequenceRef>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PrfPackage.STRUCT_REF__SIMPLE_REF:
			getSimpleRef().clear();
			return;
		case PrfPackage.STRUCT_REF__SIMPLE_SEQUENCE_REF:
			getSimpleSequenceRef().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PrfPackage.STRUCT_REF__SIMPLE_REF:
			return simpleRef != null && !simpleRef.isEmpty();
		case PrfPackage.STRUCT_REF__SIMPLE_SEQUENCE_REF:
			return simpleSequenceRef != null && !simpleSequenceRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Any toAny() {
		Any retVal = JacorbUtil.init().create_any();
		List<DataType> fields = new ArrayList<DataType>(getSimpleRef().size());
		for (SimpleRef prop : getSimpleRef()) {
			fields.add(new DataType(prop.getRefID(), prop.toAny()));
		}
		PropertiesHelper.insert(retVal, fields.toArray(new DataType[fields.size()]));
		return retVal;
	}

} //StructRefImpl
