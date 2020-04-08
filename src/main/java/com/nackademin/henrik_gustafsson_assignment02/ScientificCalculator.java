package com.nackademin.henrik_gustafsson_assignment02;

public class ScientificCalculator extends BasicCalculator implements AdvancedOperations {
	public double square(double number) {
		return number * number;
	}

	@Override
	public double raisedToThePowerOf(double base, double exponent) {
		return Math.pow(base, exponent);
	}

	@Override
	public double squareRoot(double number) {
		return Math.sqrt(number);
	}

	@Override
	public double max(double number1, double number2) {
		return Math.max(number1, number2);
	}

	@Override
	public double min(double number1, double number2) {
		return Math.min(number1, number2);
	}
	
	

}
