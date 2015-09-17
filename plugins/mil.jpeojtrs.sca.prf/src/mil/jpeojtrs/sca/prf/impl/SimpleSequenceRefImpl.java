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

import mil.jpeojtrs.sca.prf.PrfFactory;
import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.prf.SimpleSequence;
import mil.jpeojtrs.sca.prf.SimpleSequenceRef;
import mil.jpeojtrs.sca.prf.Values;
import mil.jpeojtrs.sca.util.AnyUtils;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.jacorb.JacorbUtil;
import org.omg.CORBA.Any;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Sequence Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.SimpleSequenceRefImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleSequenceRefImpl extends AbstractPropertyRefImpl<SimpleSequence> implements SimpleSequenceRef {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected Values values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleSequenceRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrfPackage.Literals.SIMPLE_SEQUENCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 *  @since 3.0
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated NOT
	 */
	@Override
	public void setProperty(SimpleSequence newProperty) {
		super.setProperty(newProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Values getValues() {
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetValues(Values newValues, NotificationChain msgs) {
		Values oldValues = values;
		values = newValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE_SEQUENCE_REF__VALUES, oldValues, values);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValues(Values newValues) {
		if (newValues != values) {
			NotificationChain msgs = null;
			if (values != null)
				msgs = ((InternalEObject) values).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrfPackage.SIMPLE_SEQUENCE_REF__VALUES, null, msgs);
			if (newValues != null) {
				if (newValues.eContainer() != null) {
					Values realNewValues = PrfFactory.eINSTANCE.createValues();
					realNewValues.getValue().addAll(newValues.getValue());
					newValues = realNewValues;
				}
				msgs = ((InternalEObject) newValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrfPackage.SIMPLE_SEQUENCE_REF__VALUES, null, msgs);
			}
			msgs = basicSetValues(newValues, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE_SEQUENCE_REF__VALUES, newValues, newValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PrfPackage.SIMPLE_SEQUENCE_REF__VALUES:
			return basicSetValues(null, msgs);
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
		case PrfPackage.SIMPLE_SEQUENCE_REF__VALUES:
			return getValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PrfPackage.SIMPLE_SEQUENCE_REF__VALUES:
			setValues((Values) newValue);
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
		case PrfPackage.SIMPLE_SEQUENCE_REF__VALUES:
			setValues((Values) null);
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
		case PrfPackage.SIMPLE_SEQUENCE_REF__VALUES:
			return values != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Any toAny() {
		// END GENERATED CODE
		if (getValues() != null) {
			return AnyUtils.toAnySequence(getValues().getValue().toArray(), getProperty().getType().getLiteral(), getProperty().isComplex());
		} else {
			return JacorbUtil.init().create_any();
		}
		// BEGIN GENERATED CODE
	}

	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		if (getValues() != null && getValues().getValue() != null) {
			result.append(getValues().getValue().toString());
		}
		result.append(')');
		return result.toString();
	}

} //SimpleSequenceRefImpl
