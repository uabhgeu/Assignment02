package com.nackademin.henrik_gustafsson_assignment02;

import static org.junit.Assert.*;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorTest {
	BasicCalculator basiccalculator = new BasicCalculator();
	public static final Logger LOG = Logger.getLogger(CalculatorTest.class.getName());

	@Test
	public void testAddition() {
		assertEquals(basiccalculator.addition(2, 2),4,0);
		LOG.info("Testing methods addition with 2 + 2");
	}

	@Test
	public void testSubtraction() {
		assertEquals(basiccalculator.subtraction(10, 2),8,0);
		LOG.info("Testing methods subtraction with 10 - 2");
	}
	
	@Test
	public void testDivision() {
		assertEquals(basiccalculator.division(10, 2),5,0);
		LOG.info("Testing methods division with 10 / 2");
	}
	
	@Test
	public void testMultiplication() {
		assertEquals(basiccalculator.multiplication(10, 2),20,0);
		LOG.info("Testing methods multiplication with 10 * 2");
	}
}

