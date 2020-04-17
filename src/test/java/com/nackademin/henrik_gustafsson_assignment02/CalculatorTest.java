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

		for (int i = 0; i < 5; i++) {
			double min = 0.0;
			double max = 100.0;
			Random r = new Random();
			tempFirstNumber = min + (max - min) * r.nextDouble();
			tempSecondNumber = min + (max - min) * r.nextDouble();
			tempExpectedResult = tempFirstNumber + tempSecondNumber;
			assertEquals(basiccalculator.addition(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
			LOG.info("Testing method addition with random positive numbers: " + tempFirstNumber + " + "
					+ tempSecondNumber + " = " + tempExpectedResult);
		}
	}

	@Test
	public void testAdditionNegativeRandom() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;

		for (int i = 0; i < 5; i++) {
			double min = -100.0;
			double max = 0.0;
			Random r = new Random();
			tempFirstNumber = min + (max - min) * r.nextDouble();
			tempSecondNumber = min + (max - min) * r.nextDouble();

			tempExpectedResult = tempFirstNumber + tempSecondNumber;
			assertEquals(basiccalculator.addition(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
			LOG.info("Testing method addition with random negative numbers: " + tempFirstNumber + " + "
					+ tempSecondNumber + " = " + tempExpectedResult);
		}
	}

	@Test
	public void testAdditionWithZero() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;

		for (int i = 0; i < 5; i++) {
			double min = 0.0;
			double max = 100.0;
			Random r = new Random();
			tempFirstNumber = min + (max - min) * r.nextDouble();

			tempExpectedResult = tempFirstNumber + tempSecondNumber;
			assertEquals(basiccalculator.addition(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
			LOG.info("Testing method addition with zero: " + tempFirstNumber + " + " + tempSecondNumber + " = "
					+ tempExpectedResult);
		}
	}

	@Test
	public void testSubtractionRandomPositive() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;

		for (int i = 0; i < 5; i++) {
			double min = 0.0;
			double max = 100.0;
			Random r = new Random();
			tempFirstNumber = min + (max - min) * r.nextDouble();
			tempSecondNumber = min + (max - min) * r.nextDouble();

			tempExpectedResult = tempFirstNumber - tempSecondNumber;
			assertEquals(basiccalculator.subtraction(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
			LOG.info("Testing method subtraction with random positive numbers: " + tempFirstNumber + " - "
					+ tempSecondNumber + " = " + tempExpectedResult);
		}

	}

	@Test
	public void testSubtractionRandomNegative() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;

		for (int i = 0; i < 5; i++) {
			double min = -100.0;
			double max = 0.0;
			Random r = new Random();
			tempFirstNumber = min + (max - min) * r.nextDouble();
			tempSecondNumber = min + (max - min) * r.nextDouble();

			tempExpectedResult = tempFirstNumber - tempSecondNumber;
			assertEquals(basiccalculator.subtraction(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
			LOG.info("Testing method subtraction with random negative numbers: " + tempFirstNumber + " - "
					+ tempSecondNumber + " = " + tempExpectedResult);
		}

	}

	@Test
	public void testRandomSubtractionWithZero() {
		double tempFirstNumber = 2.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;

		for (int i = 0; i < 5; i++) {
			double min = 0.0;
			double max = 100.0;
			Random r = new Random();
			tempFirstNumber = min + (max - min) * r.nextDouble();

			tempExpectedResult = tempFirstNumber - tempSecondNumber;
			assertEquals(basiccalculator.subtraction(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
			LOG.info("Testing method subtraction with zero: " + tempFirstNumber + " - " + tempSecondNumber + " = "
					+ tempExpectedResult);
		}
	}

	@Test
	public void testDivisionRandomPositive() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;

		for (int i = 0; i < 5; i++) {
			double min = 0.0;
			double max = 100.0;
			Random r = new Random();
			tempFirstNumber = min + (max - min) * r.nextDouble();
			tempSecondNumber = min + (max - min) * r.nextDouble();

			tempExpectedResult = tempFirstNumber / tempSecondNumber;
			assertEquals(basiccalculator.division(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
			LOG.info("Testing method division with random positive numbers: " + tempFirstNumber + " / "
					+ tempSecondNumber + " = " + tempExpectedResult);
		}
	}

	@Test
	public void testDivisionRandomNegative() {
		double tempFirstNumber = 2.0;
		double tempSecondNumber = -10.0;
		double tempExpectedResult = 0.0;

		for (int i = 0; i < 5; i++) {
			double min = -100.0;
			double max = 0.0;
			Random r = new Random();
			tempFirstNumber = min + (max - min) * r.nextDouble();
			tempSecondNumber = min + (max - min) * r.nextDouble();

			tempExpectedResult = tempFirstNumber / tempSecondNumber;
			assertEquals(basiccalculator.division(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
			LOG.info("Testing method division with random negative numbers: " + tempFirstNumber + " / "
					+ tempSecondNumber + " = " + tempExpectedResult);
		}
	}

	@Test(expected = java.lang.AssertionError.class)
	public void testDivideByZeroShouldBeInfinity() {
		double tempFirstNumber = 2.0;
		double tempSecondNumber = 0.0;
		LOG.info("Testing method division, dividing by zero");
		basiccalculator.division(tempFirstNumber, tempSecondNumber);
	}

	@Test
	public void testMultiplicationRandomPositive() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;

		for (int i = 0; i < 5; i++) {
			double min = 0.0;
			double max = 100.0;
			Random r = new Random();

			tempFirstNumber = min + (max - min) * r.nextDouble();
			tempSecondNumber = min + (max - min) * r.nextDouble();
			tempExpectedResult = tempFirstNumber * tempSecondNumber;

			assertEquals(basiccalculator.multiplication(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
			LOG.info("Testing method multiplication with random positive numbers: " + tempFirstNumber + " * "
					+ tempSecondNumber + " = " + tempExpectedResult);
		}
	}

	@Test
	public void testMultiplicationRandomNegativeNumbers() {
		double tempFirstNumber = -2.0;
		double tempSecondNumber = -10.0;
		double tempExpectedResult = 0.0;

		for (int i = 0; i < 5; i++) {
			double min = -100.0;
			double max = 0.0;
			Random r = new Random();

			tempFirstNumber = min + (max - min) * r.nextDouble();
			tempSecondNumber = min + (max - min) * r.nextDouble();

			tempExpectedResult = tempFirstNumber * tempSecondNumber;
			assertEquals(basiccalculator.multiplication(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
			LOG.info("Testing method multiplication with random negative numbers: " + tempFirstNumber + " * "
					+ tempSecondNumber + " = " + tempExpectedResult);
		}
	}

	@Test
	public void testRandomMultiplicationWithZero() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 10.0;

		for (int i = 0; i < 5; i++) {
			double min = 0.0;
			double max = 100.0;
			Random r = new Random();
			tempFirstNumber = min + (max - min) * r.nextDouble();

			tempExpectedResult = tempFirstNumber * tempSecondNumber;
			assertEquals(basiccalculator.multiplication(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
			LOG.info("Testing method multiplication with zero: " + tempFirstNumber + " * " + tempSecondNumber + " = "
					+ tempExpectedResult);
		}
	}

	@Test
	public void testRaisedToThePowerOfPositive() {
		double tempNumber = 5.0;
		double tempExponent = 3.0;
		double tempExpectedResult = 125.0;

			assertEquals(scientificCalculator.raisedToThePowerOf(tempNumber, tempExponent), tempExpectedResult, 0);
			LOG.info("Testing method pow with random positive numbers: " + tempNumber + " raised to " + tempExponent
					+ " = " + tempExpectedResult);
		}

	@Test
	public void testRaisedToThePowerOfNegative() {
		double tempNumber = 10.0;
		double tempExponent = -2.0;
		double tempExpectedResult = 0.01;

			assertEquals(scientificCalculator.raisedToThePowerOf(tempNumber, tempExponent), tempExpectedResult, 0);
			LOG.info("Testing method POW with negative number: " + tempNumber + " ^ " + tempExponent + " = "
					+ tempExpectedResult);
		}

	@Test
	public void testRaisedToThePowerOfZero() {
		double tempNumber = 10.0;
		double tempExponent = 0.0;
		double tempExpectedResult = 1.0;

			assertEquals(scientificCalculator.raisedToThePowerOf(tempNumber, tempExponent), tempExpectedResult, 0);
			LOG.info("Testing method POW with raised to Zero: " + tempNumber + " ^ " + tempExponent + " = "
					+ tempExpectedResult);
		}

	@Test
	public void testSquareRandomPositive() {
		double tempNumber = 0.0;
		double tempExpectedResult = 0.0;

		for (int i = 0; i < 5; i++) {
			double min = 0.0;
			double max = 100.0;
			Random r = new Random();
			tempNumber = min + (max - min) * r.nextDouble();
			tempExpectedResult = tempNumber * tempNumber;

			assertEquals(scientificCalculator.square(tempNumber), tempExpectedResult, 0);
			LOG.info("Testing method square with random positive numbers: " + tempNumber + " square = "
					+ tempExpectedResult);
		}
	}

	@Test
	public void testSquareRandomNegativeNumbers() {
		double tempNumber = 0.0;
		double tempExpectedResult = 0.0;

		for (int i = 0; i < 5; i++) {
			double min = -100.0;
			double max = 0.0;
			Random r = new Random();
			tempNumber = min + (max - min) * r.nextDouble();

			tempExpectedResult = tempNumber * tempNumber;
			assertEquals(scientificCalculator.square(tempNumber), tempExpectedResult, 0);
			LOG.info("Testing method square with random negative numbers: " + tempNumber + " square = "
					+ tempExpectedResult);
		}
	}

	@Test
	public void testSquareWithZero() {
		double tempNumber = 0.0;
		double tempExpectedResult = 0.0;

		tempExpectedResult = tempNumber * tempNumber;
		assertEquals(scientificCalculator.square(tempNumber), tempExpectedResult, 0);
		LOG.info("Testing method square with Zero: " + tempNumber + " square = " + tempExpectedResult);
	}

	@Test
	public void testSquareRootRandomPositive() {
		double tempNumber = 1056.25;
		double tempExpectedResult = 32.5;

//		for (int i = 0; i < 5; i++) {
//			double min = 0.0;
//			double max = 100.0;
//
//			Random r = new Random();
//			tempNumber = min + (max - min) * r.nextDouble();
//			tempExpectedResult = Math.sqrt(tempNumber);

			assertEquals(scientificCalculator.squareRoot(tempNumber), tempExpectedResult, 0);
			LOG.info("Testing method squareRoot: " + tempNumber + " squareRoot = " + tempExpectedResult);
		}
	//}

	@Test
	public void testSquareRootNegativeNumbers() {
		double tempNumber = -10.0;
		double tempExpectedResult = 0.0;

		tempExpectedResult = Math.sqrt(tempNumber);
		assertEquals(scientificCalculator.squareRoot(tempNumber), tempExpectedResult, 0);
		LOG.info("Testing methods squareRoot with negative numbers: " + tempNumber + " squareRoot = "
				+ tempExpectedResult);
	}

	@Test
	public void testMaxRandomPositiveAndNegativeNumbers() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;

		for (int i = 0; i < 100; i++) {
			double min = -1000.0;
			double max = 1000.0;
			Random r = new Random();
			tempFirstNumber = min + (max - min) * r.nextDouble();
			tempSecondNumber = min + (max - min) * r.nextDouble();

			if (tempFirstNumber < tempSecondNumber) {
				tempExpectedResult = tempSecondNumber;
			} else {
				tempExpectedResult = tempFirstNumber;
			}

			assertEquals(scientificCalculator.max(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
			LOG.info("Testing methods max: " + tempFirstNumber + " or " + tempSecondNumber + " max = "
					+ tempExpectedResult);
		}
	}

	@Test
	public void testMaxWithZero() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;

		tempExpectedResult = Math.max(tempFirstNumber, tempSecondNumber);
		assertEquals(scientificCalculator.max(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
		LOG.info("Testing method max with Zero: " + tempFirstNumber + " or " + tempSecondNumber + " max = "
				+ tempExpectedResult);
	}

	@Test
	public void testMinRandomPositiveAndNegativeNumbers() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;

		for (int i = 0; i < 100; i++) {
			double min = -1000.0;
			double max = 1000.0;
			Random r = new Random();
			tempFirstNumber = min + (max - min) * r.nextDouble();
			tempSecondNumber = min + (max - min) * r.nextDouble();
			
			if (tempFirstNumber > tempSecondNumber) {
				tempExpectedResult = tempSecondNumber;
			} else {
				tempExpectedResult = tempFirstNumber;
			}

			assertEquals(scientificCalculator.min(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
			LOG.info("Testing methods min: " + tempFirstNumber + " or " + tempSecondNumber + " min = "
					+ tempExpectedResult);
		}
	}

	@Test
	public void testMinWithZero() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;

		tempExpectedResult = Math.min(tempFirstNumber, tempSecondNumber);
		assertEquals(scientificCalculator.min(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
		LOG.info("Testing method min with Zero: " + tempFirstNumber + " or " + tempSecondNumber + " min = "
				+ tempExpectedResult);
	}

}
