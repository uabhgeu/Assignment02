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
	
	

}
