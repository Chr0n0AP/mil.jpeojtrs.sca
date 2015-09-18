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
package mil.jpeojtrs.sca.prf.tests;

import junit.textui.TestRunner;
import mil.jpeojtrs.sca.prf.PrfFactory;
import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.prf.StructSequenceRef;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Struct Sequence Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.PropertyRefContainer#getPropertyContainer() <em>Get Property Container</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StructSequenceRefTest extends AbstractPropertyRefTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StructSequenceRefTest.class);
	}

	/**
	 * Constructs a new Struct Sequence Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructSequenceRefTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Struct Sequence Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StructSequenceRef getFixture() {
		return (StructSequenceRef) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		final Properties props = Properties.Util.getProperties(
			new ResourceSetImpl().getResource(PrfTests.getURI("testFiles/StructSequenceTest.prf.xml"), true));
		StructSequenceRef ssRef = PrfFactory.eINSTANCE.createStructSequenceRef();
		props.eResource().getContents().add(ssRef);
		ssRef.setProperty(props.getStructSequence().get(0));
		setFixture(ssRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.PropertyRefContainer#getPropertyContainer() <em>Get Property Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.PropertyRefContainer#getPropertyContainer()
	 * @generated NOT
	 */
	public void testGetPropertyContainer() {
		// END GENERATED CODE
		getFixture().getPropertyContainer();
		// BEGIN GENERATED CODE
	}

} //StructSequenceRefTest
