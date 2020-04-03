package com.nackademin.henrik_gustafsson_assignment02;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest1 {
	BasicCalculator basiccalculator = new BasicCalculator();

	@Test
	public void test() {
		assertEquals(basiccalculator.addition(2, 2),4,0);
	}

}
