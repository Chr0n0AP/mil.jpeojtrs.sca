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

import java.io.ByteArrayOutputStream;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;

import junit.textui.TestRunner;
import mil.jpeojtrs.sca.prf.AccessType;
import mil.jpeojtrs.sca.prf.ActionType;
import mil.jpeojtrs.sca.prf.ConfigurationKind;
import mil.jpeojtrs.sca.prf.PrfFactory;
import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.prf.PropertyConfigurationType;
import mil.jpeojtrs.sca.prf.Struct;
import mil.jpeojtrs.sca.prf.StructPropertyConfigurationType;
import mil.jpeojtrs.sca.prf.StructSequence;
import mil.jpeojtrs.sca.prf.util.PrfValidator;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Struct Sequence</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.PropertyContainer#getProperty(java.lang.String) <em>Get Property</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StructSequenceTest extends AbstractPropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StructSequenceTest.class);
	}

	/**
	 * Constructs a new Struct Sequence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructSequenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Struct Sequence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StructSequence getFixture() {
		return (StructSequence) fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Properties props = Properties.Util.getProperties(resourceSet.getResource(PrfTests.getURI("testFiles/StructSequenceTest.prf.xml"), true));
		final StructSequence structSeq = props.getStructSequence().get(0);
		Assert.assertNotNull(structSeq);
		setFixture(structSeq);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 * @generated NOT
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.PropertyContainer#getProperty(java.lang.String) <em>Get Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.PropertyContainer#getProperty(java.lang.String)
	 * @generated NOT
	 */
	public void testGetProperty__String() {
		// END GENERATED CODE
		Assert.assertNull(getFixture().getProperty(null));
		// BEGIN GENERATED CODE
	}

	public void test_parse() throws Exception {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Properties props = Properties.Util.getProperties(resourceSet.getResource(PrfTests.getURI("testFiles/StructSequenceTest.prf.xml"), true));
		final StructSequence structSeq = props.getStructSequence().get(0);
		Assert.assertNotNull(structSeq);
		Assert.assertEquals("DCE:8ab14a5d-00a0-4468-9ab3-7298f7025470", structSeq.getId());
		Assert.assertEquals(AccessType.READWRITE, structSeq.getMode());
		Assert.assertEquals("structSequence", structSeq.getName());
		Assert.assertEquals("StructSequence Definition", structSeq.getDescription());

		Assert.assertNotNull(structSeq.getStruct());
		Assert.assertEquals("testStruct", structSeq.getStruct().getName());
		Assert.assertEquals(1, structSeq.getStruct().getSimple().size());
		Assert.assertEquals("testString", structSeq.getStruct().getSimple().get(0).getName());
		Assert.assertEquals(1, structSeq.getStruct().getSimple().get(0).getKind().size());
		Assert.assertEquals(PropertyConfigurationType.CONFIGURE, structSeq.getStruct().getSimple().get(0).getKind().get(0).getType());
		Assert.assertEquals(ActionType.EXTERNAL, structSeq.getStruct().getSimple().get(0).getAction().getType());
		Assert.assertEquals(StructPropertyConfigurationType.CONFIGURE, structSeq.getStruct().getConfigurationKind().get(0).getType());
		Assert.assertEquals(2, structSeq.getStructValue().size());
		Assert.assertEquals("t1", structSeq.getStructValue().get(0).getSimpleRef().get(0).getValue());
		Assert.assertEquals("t2", structSeq.getStructValue().get(1).getSimpleRef().get(0).getValue());
		Assert.assertNotNull(structSeq.getConfigurationKind());
		Assert.assertEquals(StructPropertyConfigurationType.CONFIGURE, structSeq.getConfigurationKind().get(0).getType());
	}

	public void testExtra() throws Exception {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Properties props = Properties.Util.getProperties(resourceSet.getResource(PrfTests.getURI("testFiles/StructSequenceTest.prf.xml"), true));
		Assert.assertNotNull(props);
		final StructSequence structSeq = props.getStructSequence().get(0);
		Assert.assertNotNull(structSeq);

		// test setStruct
		final Struct struct = PrfFactory.eINSTANCE.createStruct();
		final ConfigurationKind ck = PrfFactory.eINSTANCE.createConfigurationKind();
		ck.setType(StructPropertyConfigurationType.ALLOCATION);
		struct.setName("Replace");
		struct.getConfigurationKind().add(ck);
		structSeq.setStruct(struct);
		Assert.assertEquals("Replace", structSeq.getStruct().getName());
		Assert.assertEquals(StructPropertyConfigurationType.ALLOCATION, structSeq.getStruct().getConfigurationKind().get(0).getType());

		structSeq.setStruct(struct);
		Assert.assertEquals("Replace", structSeq.getStruct().getName());
		Assert.assertEquals(StructPropertyConfigurationType.ALLOCATION, structSeq.getStruct().getConfigurationKind().get(0).getType());

		// test unsetMode
		structSeq.unsetMode();
		Assert.assertFalse(structSeq.isSetMode());
		Assert.assertEquals(AccessType.READWRITE, structSeq.getMode());

		structSeq.setMode(AccessType.WRITEONLY);
		Assert.assertEquals(AccessType.WRITEONLY, structSeq.getMode());

		structSeq.setMode(null);
		Assert.assertEquals(AccessType.READWRITE, structSeq.getMode());

		structSeq.setMode(AccessType.READWRITE);
		Assert.assertEquals(AccessType.READWRITE, structSeq.getMode());

		// test set null and non null type
		structSeq.getConfigurationKind().clear();
		structSeq.getConfigurationKind().add(ck);
		Assert.assertEquals(StructPropertyConfigurationType.ALLOCATION, structSeq.getConfigurationKind().get(0).getType());
		structSeq.getConfigurationKind().clear();
		structSeq.getConfigurationKind().add(ck);
		Assert.assertEquals(StructPropertyConfigurationType.ALLOCATION, structSeq.getConfigurationKind().get(0).getType());

	}

	public void testEmptyConfigurationKind_IDE_917() throws Exception {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Properties props = Properties.Util.getProperties(resourceSet.getResource(PrfTests.getURI("testFiles/StructSequenceTest.prf.xml"), true));
		Assert.assertNotNull(props);
		final StructSequence structSeq = props.getStructSequence().get(0);
		Assert.assertNotNull(structSeq);

		// test setStruct
		final Struct struct = PrfFactory.eINSTANCE.createStruct();
		final ConfigurationKind ck = PrfFactory.eINSTANCE.createConfigurationKind();
		ck.setType(StructPropertyConfigurationType.ALLOCATION);
		struct.setName("Replace");
		struct.getConfigurationKind().add(ck);
		structSeq.setStruct(struct);

		// test unsetType
		structSeq.getConfigurationKind().clear();
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		structSeq.eResource().save(buffer, null);
		String xml = new String(buffer.toByteArray());
		Assert.assertFalse("Empty configuration kind serialized wrong.", xml.contains("configurationkind=\"\""));
	}

	/**
	 * IDE-1344 - Provide validation warning for kind elements on members of a struct/struct seq
	 */
	public void testRedundantConfigurationKind_IDE_1344() throws Exception {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Properties props = Properties.Util.getProperties(resourceSet.getResource(PrfTests.getURI("testFiles/StructSequenceTest.prf.xml"), true));
		Assert.assertNotNull(props);
		final StructSequence structSeq = props.getStructSequence().get(0);
		Assert.assertNotNull(structSeq);
		Assert.assertEquals("Test case running against wrong StructSequence element", "DCE:8ab14a5d-00a0-4468-9ab3-7298f7025470", structSeq.getId());

		// Assert that EMF Warning is thrown if a struct contained in a struct sequence has a declared configurationKind
		Struct struct = structSeq.getStructValue().get(0).getStruct();
		Assert.assertEquals("Test case running against wrong Struct element", "DCE:c87bfb04-88ea-4e91-bc53-f9fce3b7eb6e", struct.getId());
		Assert.assertEquals("Configuration Kind is not set", StructPropertyConfigurationType.CONFIGURE, struct.getConfigurationKind().get(0).getType());

		BasicDiagnostic diagnostic = new BasicDiagnostic();
		Assert.assertTrue(PrfValidator.INSTANCE.validateStruct(struct, diagnostic, null));
		Assert.assertFalse(diagnostic.getChildren().isEmpty());
		Diagnostic diagResult = diagnostic.getChildren().get(0);
		Assert.assertEquals("Validation should result in a warning", Diagnostic.WARNING, diagResult.getSeverity());
		Assert.assertEquals("Unexpected error message", PrfValidator.INSTANCE.getResourceLocator().getString("_UI_RedundantKind_diagnostic"),
			diagResult.getMessage());
	}

} //StructSequenceTest
