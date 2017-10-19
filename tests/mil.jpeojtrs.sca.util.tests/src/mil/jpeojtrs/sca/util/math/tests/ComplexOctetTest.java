/**
 * This file is protected by Copyright.
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package mil.jpeojtrs.sca.util.math.tests;

import org.junit.Assert;
import mil.jpeojtrs.sca.util.math.ComplexOctet;
import mil.jpeojtrs.sca.util.UnsignedUtils;
import mil.jpeojtrs.sca.util.math.ComplexNumber;

import org.junit.Test;
import org.omg.CORBA.Any;
import org.omg.CORBA.ORB;

import CF.complexOctet;
import CF.complexOctetHelper;

public class ComplexOctetTest extends ComplexNumberTest {

	private final ComplexOctet complexOctet = new ComplexOctet((short) 7, (short) 8);

	@Override
	public void testToAny() {
		Any any = complexOctet.toAny();

		complexOctet cfType = complexOctetHelper.extract(any);
		Assert.assertEquals((short) 7, UnsignedUtils.toSigned(cfType.real));
		Assert.assertEquals((short) 8, UnsignedUtils.toSigned(cfType.imag));
	}

	@Override
	public void testGetValue() {
		Assert.assertEquals((short) 7, complexOctet.getValue(0).shortValue());
		Assert.assertEquals((short) 8, complexOctet.getValue(1).shortValue());
	}

	@Test
	public void testGetShortValue() {
		Assert.assertEquals((short) 7, complexOctet.getShortValue(0));
		Assert.assertEquals((short) 8, complexOctet.getShortValue(1));
	}

	@Override
	public void testGetSize() {
		Assert.assertEquals(2, complexOctet.getSize());
	}

	@Override
	public void testValueOfAny() {
		complexOctet cfType = new complexOctet((byte) 7, (byte) 8);
		Any any = ORB.init().create_any();
		complexOctetHelper.insert(any, cfType);

		ComplexOctet complexShort2 = ComplexOctet.valueOf(any);
		Assert.assertEquals((short) 7, complexShort2.getShortValue(0));
		Assert.assertEquals((short) 8, complexShort2.getShortValue(1));
	}

	@Override
	public void testValueOfString() {
		ComplexOctet complexShort2 = ComplexOctet.valueOf("5+i6");

		Assert.assertEquals((short) 5, complexShort2.getShortValue(0));
		Assert.assertEquals((short) 6, complexShort2.getShortValue(1));
	}

	@Override
	public void testValueOfStringString() {
		ComplexNumber complexNumber = ComplexNumber.valueOf("octet", "5+i6");

		Assert.assertTrue("Invalid complex type", complexNumber instanceof ComplexOctet);
		Assert.assertEquals((short) 5, ((ComplexOctet) complexNumber).getShortValue(0));
		Assert.assertEquals((short) 6, ((ComplexOctet) complexNumber).getShortValue(1));
	}

	@Override
	public void testToString() {
		Assert.assertEquals("7+j8", complexOctet.toString());
	}

}
