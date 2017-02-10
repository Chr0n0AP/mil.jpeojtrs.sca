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

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import mil.jpeojtrs.sca.prf.AbstractProperty;
import mil.jpeojtrs.sca.prf.Action;
import mil.jpeojtrs.sca.prf.Enumerations;
import mil.jpeojtrs.sca.prf.Kind;
import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.prf.PropertyConfigurationType;
import mil.jpeojtrs.sca.prf.PropertyValueType;
import mil.jpeojtrs.sca.prf.Range;
import mil.jpeojtrs.sca.prf.Simple;
import mil.jpeojtrs.sca.util.AnyUtils;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.CORBA.Any;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.SimpleImpl#getValue <em>Value</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.SimpleImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.SimpleImpl#getRange <em>Range</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.SimpleImpl#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.SimpleImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.SimpleImpl#getAction <em>Action</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.SimpleImpl#getType <em>Type</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.SimpleImpl#getComplex <em>Complex</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.SimpleImpl#getCommandline <em>Commandline</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.SimpleImpl#getOptional <em>Optional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleImpl extends AbstractPropertyImpl implements Simple {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;
	/**
	 * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String UNITS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected String units = UNITS_EDEFAULT;
	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected Range range;
	/**
	 * The cached value of the '{@link #getEnumerations() <em>Enumerations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerations()
	 * @generated
	 * @ordered
	 */
	protected Enumerations enumerations;
	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected EList<Kind> kind;
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyValueType TYPE_EDEFAULT = PropertyValueType.STRING;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PropertyValueType type = TYPE_EDEFAULT;
	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getComplex() <em>Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #getComplex()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean COMPLEX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getComplex() <em>Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #getComplex()
	 * @generated
	 * @ordered
	 */
	protected Boolean complex = COMPLEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommandline() <em>Commandline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @see #getCommandline()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean COMMANDLINE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCommandline() <em>Commandline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @see #getCommandline()
	 * @generated
	 * @ordered
	 */
	protected Boolean commandline = COMMANDLINE_EDEFAULT;
	/**
	 * The default value of the '{@link #getOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @see #getOptional()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean OPTIONAL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @see #getOptional()
	 * @generated
	 * @ordered
	 */
	protected Boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrfPackage.Literals.SIMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnits(String newUnits) {
		String oldUnits = units;
		units = newUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE__UNITS, oldUnits, units));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(Range newRange, NotificationChain msgs) {
		Range oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE__RANGE, oldRange, newRange);
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
	 * @generated
	 */
	@Override
	public void setRange(Range newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject) range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrfPackage.SIMPLE__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject) newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrfPackage.SIMPLE__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumerations getEnumerations() {
		return enumerations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumerations(Enumerations newEnumerations, NotificationChain msgs) {
		Enumerations oldEnumerations = enumerations;
		enumerations = newEnumerations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE__ENUMERATIONS, oldEnumerations, newEnumerations);
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
	 * @generated
	 */
	@Override
	public void setEnumerations(Enumerations newEnumerations) {
		if (newEnumerations != enumerations) {
			NotificationChain msgs = null;
			if (enumerations != null)
				msgs = ((InternalEObject) enumerations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrfPackage.SIMPLE__ENUMERATIONS, null, msgs);
			if (newEnumerations != null)
				msgs = ((InternalEObject) newEnumerations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrfPackage.SIMPLE__ENUMERATIONS, null, msgs);
			msgs = basicSetEnumerations(newEnumerations, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE__ENUMERATIONS, newEnumerations, newEnumerations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Kind> getKind() {
		if (kind == null) {
			kind = new EObjectContainmentEList<Kind>(Kind.class, this, PrfPackage.SIMPLE__KIND);
		}
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE__ACTION, oldAction, newAction);
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
	 * @generated
	 */
	@Override
	public void setAction(Action newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject) action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrfPackage.SIMPLE__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject) newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrfPackage.SIMPLE__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyValueType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(PropertyValueType newType) {
		PropertyValueType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		PropertyValueType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PrfPackage.SIMPLE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getComplex() {
		return complex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComplex(Boolean newComplex) {
		Boolean oldComplex = complex;
		complex = newComplex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE__COMPLEX, oldComplex, complex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getCommandline() {
		return commandline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandline(Boolean newCommandline) {
		Boolean oldCommandline = commandline;
		commandline = newCommandline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE__COMMANDLINE, oldCommandline, commandline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(Boolean newOptional) {
		Boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isComplex() {
		// END GENERATED CODE
		return (complex != null && complex);
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isCommandLine() {
		// END GENERATED CODE
		return (commandline != null && commandline) || isKind(PropertyConfigurationType.EXECPARAM);
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isOptional() {
		// END GENERATED CODE
		return (optional != null && optional);
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
		case PrfPackage.SIMPLE__RANGE:
			return basicSetRange(null, msgs);
		case PrfPackage.SIMPLE__ENUMERATIONS:
			return basicSetEnumerations(null, msgs);
		case PrfPackage.SIMPLE__KIND:
			return ((InternalEList< ? >) getKind()).basicRemove(otherEnd, msgs);
		case PrfPackage.SIMPLE__ACTION:
			return basicSetAction(null, msgs);
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
		case PrfPackage.SIMPLE__VALUE:
			return getValue();
		case PrfPackage.SIMPLE__UNITS:
			return getUnits();
		case PrfPackage.SIMPLE__RANGE:
			return getRange();
		case PrfPackage.SIMPLE__ENUMERATIONS:
			return getEnumerations();
		case PrfPackage.SIMPLE__KIND:
			return getKind();
		case PrfPackage.SIMPLE__ACTION:
			return getAction();
		case PrfPackage.SIMPLE__TYPE:
			return getType();
		case PrfPackage.SIMPLE__COMPLEX:
			return getComplex();
		case PrfPackage.SIMPLE__COMMANDLINE:
			return getCommandline();
		case PrfPackage.SIMPLE__OPTIONAL:
			return getOptional();
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
		case PrfPackage.SIMPLE__VALUE:
			setValue((String) newValue);
			return;
		case PrfPackage.SIMPLE__UNITS:
			setUnits((String) newValue);
			return;
		case PrfPackage.SIMPLE__RANGE:
			setRange((Range) newValue);
			return;
		case PrfPackage.SIMPLE__ENUMERATIONS:
			setEnumerations((Enumerations) newValue);
			return;
		case PrfPackage.SIMPLE__KIND:
			getKind().clear();
			getKind().addAll((Collection< ? extends Kind>) newValue);
			return;
		case PrfPackage.SIMPLE__ACTION:
			setAction((Action) newValue);
			return;
		case PrfPackage.SIMPLE__TYPE:
			setType((PropertyValueType) newValue);
			return;
		case PrfPackage.SIMPLE__COMPLEX:
			setComplex((Boolean) newValue);
			return;
		case PrfPackage.SIMPLE__COMMANDLINE:
			setCommandline((Boolean) newValue);
			return;
		case PrfPackage.SIMPLE__OPTIONAL:
			setOptional((Boolean) newValue);
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
		case PrfPackage.SIMPLE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case PrfPackage.SIMPLE__UNITS:
			setUnits(UNITS_EDEFAULT);
			return;
		case PrfPackage.SIMPLE__RANGE:
			setRange((Range) null);
			return;
		case PrfPackage.SIMPLE__ENUMERATIONS:
			setEnumerations((Enumerations) null);
			return;
		case PrfPackage.SIMPLE__KIND:
			getKind().clear();
			return;
		case PrfPackage.SIMPLE__ACTION:
			setAction((Action) null);
			return;
		case PrfPackage.SIMPLE__TYPE:
			unsetType();
			return;
		case PrfPackage.SIMPLE__COMPLEX:
			setComplex(COMPLEX_EDEFAULT);
			return;
		case PrfPackage.SIMPLE__COMMANDLINE:
			setCommandline(COMMANDLINE_EDEFAULT);
			return;
		case PrfPackage.SIMPLE__OPTIONAL:
			setOptional(OPTIONAL_EDEFAULT);
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
		case PrfPackage.SIMPLE__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case PrfPackage.SIMPLE__UNITS:
			return UNITS_EDEFAULT == null ? units != null : !UNITS_EDEFAULT.equals(units);
		case PrfPackage.SIMPLE__RANGE:
			return range != null;
		case PrfPackage.SIMPLE__ENUMERATIONS:
			return enumerations != null;
		case PrfPackage.SIMPLE__KIND:
			return kind != null && !kind.isEmpty();
		case PrfPackage.SIMPLE__ACTION:
			return action != null;
		case PrfPackage.SIMPLE__TYPE:
			return isSetType();
		case PrfPackage.SIMPLE__COMPLEX:
			return COMPLEX_EDEFAULT == null ? complex != null : !COMPLEX_EDEFAULT.equals(complex);
		case PrfPackage.SIMPLE__COMMANDLINE:
			return COMMANDLINE_EDEFAULT == null ? commandline != null : !COMMANDLINE_EDEFAULT.equals(commandline);
		case PrfPackage.SIMPLE__OPTIONAL:
			return OPTIONAL_EDEFAULT == null ? optional != null : !OPTIONAL_EDEFAULT.equals(optional);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", units: ");
		result.append(units);
		result.append(", type: ");
		if (typeESet)
			result.append(type);
		else
			result.append("<unset>");
		result.append(", complex: ");
		result.append(complex);
		result.append(", commandline: ");
		result.append(commandline);
		result.append(", optional: ");
		result.append(optional);
		result.append(')');
		return result.toString();
	}

	// END GENERATED CODE

	@Override
	public boolean isKind(PropertyConfigurationType... type) {
		if (type == null) {
			return false;
		}
		if (eContainer() instanceof AbstractProperty) {
			return ((AbstractProperty) eContainer()).isKind(type);
		}
		Set<PropertyConfigurationType> types = new HashSet<PropertyConfigurationType>(Arrays.asList(type));
		for (Kind k : getKind()) {
			if (types.contains(k.getType())) {
				return true;
			}
		}
		if (getKind().isEmpty() && types.contains(PropertyConfigurationType.CONFIGURE)) {
			return true;
		}
		return false;
	}

	@Override
	public Any toAny() {
		return AnyUtils.toAny(getValue(), getType().getLiteral(), isComplex());
	}

	// BEGIN GENERATED CODE

} //SimpleImpl
