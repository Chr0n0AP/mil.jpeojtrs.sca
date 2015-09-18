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
package mil.jpeojtrs.sca.prf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Struct Property Configuration Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.prf.PrfPackage#getStructPropertyConfigurationType()
 * @model extendedMetaData="name='StructPropertyConfigurationType'"
 * @generated
 */
public enum StructPropertyConfigurationType implements Enumerator {
	/**
	 * The '<em><b>Configure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURE_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURE(0, "configure", "configure"),
	/**
	 * The '<em><b>Allocation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	ALLOCATION(1, "allocation", "allocation"),
	/**
	 * The '<em><b>Factoryparam</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACTORYPARAM_VALUE
	 * @generated
	 * @ordered
	 */
	FACTORYPARAM(2, "factoryparam", "factoryparam"),
	/**
	 * The '<em><b>Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_VALUE
	 * @generated
	 * @ordered
	 */
	TEST(3, "test", "test"),
	/**
	 * The '<em><b>Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT(4, "event", "event"),
	/**
	 * The '<em><b>Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE(5, "message", "message"),
	/**
	 * The '<em><b>Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @see #PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	PROPERTY(6, "property", "property");

	/**
	 * The '<em><b>Configure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Configure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIGURE
	 * @model name="configure"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURE_VALUE = 0;
	/**
	 * The '<em><b>Allocation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Allocation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALLOCATION
	 * @model name="allocation"
	 * @generated
	 * @ordered
	 */
	public static final int ALLOCATION_VALUE = 1;
	/**
	 * The '<em><b>Factoryparam</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Factoryparam</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FACTORYPARAM
	 * @model name="factoryparam"
	 * @generated
	 * @ordered
	 */
	public static final int FACTORYPARAM_VALUE = 2;
	/**
	 * The '<em><b>Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Test</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEST
	 * @model name="test"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_VALUE = 3;
	/**
	 * The '<em><b>Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Event</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT
	 * @model name="event"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_VALUE = 4;
	/**
	 * The '<em><b>Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Message</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MESSAGE
	 * @model name="message"
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_VALUE = 5;
	/**
	 * The '<em><b>Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Property</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @see #PROPERTY
	 * @model name="property"
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_VALUE = 6;
	/**
	 * An array of all the '<em><b>Struct Property Configuration Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StructPropertyConfigurationType[] VALUES_ARRAY = new StructPropertyConfigurationType[] { CONFIGURE, ALLOCATION, FACTORYPARAM, TEST,
		EVENT, MESSAGE, PROPERTY, };
	/**
	 * A public read-only list of all the '<em><b>Struct Property Configuration Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StructPropertyConfigurationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Struct Property Configuration Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructPropertyConfigurationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StructPropertyConfigurationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Struct Property Configuration Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructPropertyConfigurationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StructPropertyConfigurationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Struct Property Configuration Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructPropertyConfigurationType get(int value) {
		switch (value) {
		case CONFIGURE_VALUE:
			return CONFIGURE;
		case ALLOCATION_VALUE:
			return ALLOCATION;
		case FACTORYPARAM_VALUE:
			return FACTORYPARAM;
		case TEST_VALUE:
			return TEST;
		case EVENT_VALUE:
			return EVENT;
		case MESSAGE_VALUE:
			return MESSAGE;
		case PROPERTY_VALUE:
			return PROPERTY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StructPropertyConfigurationType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

	public PropertyConfigurationType getPropertyConfigurationType() {
		switch (this) {
		case ALLOCATION:
			return PropertyConfigurationType.ALLOCATION;
		case CONFIGURE:
			return PropertyConfigurationType.CONFIGURE;
		case EVENT:
			return PropertyConfigurationType.EVENT;
		case FACTORYPARAM:
			return PropertyConfigurationType.FACTORYPARAM;
		case MESSAGE:
			return PropertyConfigurationType.MESSAGE;
		case PROPERTY:
			return PropertyConfigurationType.PROPERTY;
		case TEST:
			return PropertyConfigurationType.TEST;
		default:
			throw new UnsupportedOperationException("Unknown type conversion: " + this);
		}
	}

	public static StructPropertyConfigurationType getStructPropertyConfigurationType(PropertyConfigurationType type) {
		if (type == null) {
			return null;
		}

		switch (type) {
		case ALLOCATION:
			return StructPropertyConfigurationType.ALLOCATION;
		case CONFIGURE:
			return StructPropertyConfigurationType.CONFIGURE;
		case EVENT:
			return StructPropertyConfigurationType.EVENT;
		case FACTORYPARAM:
			return StructPropertyConfigurationType.FACTORYPARAM;
		case MESSAGE:
			return StructPropertyConfigurationType.MESSAGE;
		case PROPERTY:
			return StructPropertyConfigurationType.PROPERTY;
		case TEST:
			return StructPropertyConfigurationType.TEST;
		case EXECPARAM:
			return null;
		default:
			throw new UnsupportedOperationException("Unknown type conversion: " + type);
		}
	}

} //StructPropertyConfigurationType
