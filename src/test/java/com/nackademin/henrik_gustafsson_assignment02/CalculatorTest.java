package com.nackademin.henrik_gustafsson_assignment02;

import static org.junit.Assert.*;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorTest {
	BasicCalculator basiccalculator = new BasicCalculator();
	ScientificCalculator scientificCalculator = new ScientificCalculator();

	Random random = new Random();
	public static final Logger LOG = Logger.getLogger(CalculatorTest.class.getName());

	@Test
	public void testAdditionPositiveRandom() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for  (int i = 0; i < 5; i++) {
			tempFirstNumber = random.nextDouble();
			tempSecondNumber = random.nextDouble();
			tempExpectedResult = tempFirstNumber + tempSecondNumber;
			assertEquals(basiccalculator.addition(tempFirstNumber, tempSecondNumber),tempExpectedResult,0);
			LOG.info("Testing methods addition with: " + tempFirstNumber + " + " + tempSecondNumber + " = " + tempExpectedResult);
		}
	}
		
	@Test
	public void testAdditionNegativeNumbers() {
		double tempFirstNumber = -2.0;
		double tempSecondNumber = -10.0;
		double tempExpectedResult = 0.0;

		tempExpectedResult = tempFirstNumber + tempSecondNumber;
		assertEquals(basiccalculator.addition(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
		LOG.info("Testing methods addition with negative numbers: " + tempFirstNumber + " / " + tempSecondNumber + " = "
				+ tempExpectedResult);
	}
	
	@Test
	public void testAdditionWithZero() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 1.0;

		tempExpectedResult = tempFirstNumber + tempSecondNumber;
		assertEquals(basiccalculator.addition(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
		LOG.info("Testing methods addition with zero: " + tempFirstNumber + " + " + tempSecondNumber + " = "
				+ tempExpectedResult);
	}

	@Test
	public void testSubtractionRandomPositive() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for  (int i = 0; i < 1; i++) {
			tempFirstNumber = random.nextDouble();
			tempSecondNumber = random.nextDouble();
			tempExpectedResult = tempFirstNumber - tempSecondNumber;
			assertEquals(basiccalculator.subtraction(tempFirstNumber, tempSecondNumber),tempExpectedResult,0);
			LOG.info("Testing methods subtraction with: " + tempFirstNumber + " - " + tempSecondNumber + " = " + tempExpectedResult);
		}
		
	}
	
	@Test
	public void testSubtractionNegativeNumbers() {
		double tempFirstNumber = -2.0;
		double tempSecondNumber = -10.0;
		double tempExpectedResult = 0.0;

		tempExpectedResult = tempFirstNumber - tempSecondNumber;
		assertEquals(basiccalculator.subtraction(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
		LOG.info("Testing methods subtraction with negative numbers: " + tempFirstNumber + " - " + tempSecondNumber + " = "
				+ tempExpectedResult);
	}
	
	@Test
	public void testSubtractionWithZero() {
		double tempFirstNumber = 2.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;

		tempExpectedResult = tempFirstNumber - tempSecondNumber;
		assertEquals(basiccalculator.subtraction(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
		LOG.info("Testing methods subtraction with negative numbers: " + tempFirstNumber + " - " + tempSecondNumber + " = "
				+ tempExpectedResult);
	}
	
	
	@Test
	public void testDivisionRandomPositive() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for  (int i = 0; i < 1; i++) {
			tempFirstNumber = random.nextDouble();
			tempSecondNumber = random.nextDouble();
			tempExpectedResult = tempFirstNumber / tempSecondNumber;
			assertEquals(basiccalculator.division(tempFirstNumber, tempSecondNumber),tempExpectedResult,0);
			LOG.info("Testing methods division with: " + tempFirstNumber + " / " + tempSecondNumber + " = " + tempExpectedResult);
		}
	}
	
	@Test
	public void testDivisionNegativeNumbers() {
		double tempFirstNumber = 2.0;
		double tempSecondNumber = -10.0;
		double tempExpectedResult = 0.0;
		
		tempExpectedResult = tempFirstNumber / tempSecondNumber;
		assertEquals(basiccalculator.division(tempFirstNumber, tempSecondNumber),tempExpectedResult,0);
		LOG.info("Testing methods division with negative numbers: " + tempFirstNumber + " / " + tempSecondNumber + " = " + tempExpectedResult);
	}
		
	
	@Test (expected=java.lang.ArithmeticException.class)
	public void testDivideByZeroShouldBeInfinity() {
		double tempFirstNumber = 2.0;
		double tempSecondNumber = 0.0;
		LOG.info("Testing methods division, dividing by zero");
		basiccalculator.division(tempFirstNumber, tempSecondNumber);
	}
		
	
	@Test
	public void testMultiplicationRandomPositive() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for  (int i = 0; i < 1; i++) {
			tempFirstNumber = random.nextDouble();
			tempSecondNumber = random.nextDouble();
			tempExpectedResult = tempFirstNumber * tempSecondNumber;
			assertEquals(basiccalculator.multiplication(tempFirstNumber, tempSecondNumber),tempExpectedResult,0);
			LOG.info("Testing methods multiplication with: " + tempFirstNumber + " * " + tempSecondNumber + " = " + tempExpectedResult);
		}
	}

	@Test
	public void testMultiplicationNegativeNumbers() {
		double tempFirstNumber = -2.0;
		double tempSecondNumber = -10.0;
		double tempExpectedResult = 0.0;

		tempExpectedResult = tempFirstNumber * tempSecondNumber;
		assertEquals(basiccalculator.multiplication(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
		LOG.info("Testing methods multiplication with negative numbers: " + tempFirstNumber + " * " + tempSecondNumber + " = "
				+ tempExpectedResult);
	}

	@Test
	public void testMultiplicationWithZero() {
		double tempFirstNumber = 2.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;

		tempExpectedResult = tempFirstNumber * tempSecondNumber;
		assertEquals(basiccalculator.multiplication(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
		LOG.info("Testing methods subtraction with negative numbers: " + tempFirstNumber + " * " + tempSecondNumber + " = "
				+ tempExpectedResult);
	}

@Test
public void testRaisedToThePowerOfRandomPositive() {
	double tempNumber = 0.0;
	double tempExponent = 0.0;
	double tempExpectedResult = 0.0;
	
	for  (int i = 0; i < 10; i++) {
		tempNumber = random.nextDouble();
		tempExponent = random.nextDouble();
		tempExpectedResult = Math.pow(tempNumber, tempExponent);
		assertEquals(scientificCalculator.raisedToThePowerOf(tempNumber, tempExponent),tempExpectedResult,0);
		LOG.info("Testing methods pow: " + tempNumber + " raised to " + tempExponent + " = " + tempExpectedResult);
	}
}
	
	@Test
	public void testRaisedToThePowerOfNegativeNumbers() {
		double tempNumber = 10.0;
		double tempExponent = -2.0;
		double tempExpectedResult = 0.0;

		tempExpectedResult = Math.pow(tempNumber, tempExponent);
		assertEquals(scientificCalculator.raisedToThePowerOf(tempNumber, tempExponent),tempExpectedResult,0);
		LOG.info("Testing methods POW with negative numbers: " + tempNumber + " ^ " + tempExponent + " = "
				+ tempExpectedResult);
	}
	
	@Test
	public void testRaisedToThePowerOfZero() {
		double tempNumber = 10.0;
		double tempExponent = 0.0;
		double tempExpectedResult = 0.0;

		tempExpectedResult = Math.pow(tempNumber, tempExponent);
		assertEquals(scientificCalculator.raisedToThePowerOf(tempNumber, tempExponent),tempExpectedResult,0);
		LOG.info("Testing methods POW with raised to Zero: " + tempNumber + " ^ " + tempExponent + " = "
				+ tempExpectedResult);
	}
	
	@Test
	public void testSquareRandomPositive() {
		double tempNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for  (int i = 0; i < 10; i++) {
			tempNumber = random.nextDouble();
			tempExpectedResult = tempNumber * tempNumber;
			assertEquals(scientificCalculator.square(tempNumber),tempExpectedResult,0);
			LOG.info("Testing methods square: " + tempNumber + " square = " + tempExpectedResult);
		}
	}
	
	@Test
	public void testSquareRootRandomPositive() {
		double tempNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for  (int i = 0; i < 10; i++) {
			tempNumber = random.nextDouble();
			tempExpectedResult = Math.sqrt(tempNumber);
			assertEquals(scientificCalculator.squareRoot(tempNumber),tempExpectedResult,0);
			LOG.info("Testing methods squareRoot: " + tempNumber + " squareRoot = " + tempExpectedResult);
		}
	}
	
	@Test
	public void testMaxRandomPositive() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for  (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble();
			tempSecondNumber = random.nextDouble();

			tempExpectedResult = Math.max(tempFirstNumber, tempSecondNumber);
			assertEquals(scientificCalculator.max(tempFirstNumber, tempSecondNumber),tempExpectedResult,0);
			LOG.info("Testing methods max: " + tempFirstNumber + " or " +tempSecondNumber + " max = " + tempExpectedResult);
		}
	}
	
	@Test
	public void testMinRandomPositive() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for  (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble();
			tempSecondNumber = random.nextDouble();

			tempExpectedResult = Math.min(tempFirstNumber, tempSecondNumber);
			assertEquals(scientificCalculator.min(tempFirstNumber, tempSecondNumber),tempExpectedResult,0);
			LOG.info("Testing methods min: " + tempFirstNumber + " or " +tempSecondNumber + " min = " + tempExpectedResult);
		}
	}

}
