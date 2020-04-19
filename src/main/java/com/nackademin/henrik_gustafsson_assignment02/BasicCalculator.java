/* Class BasicCalculator implementing the interface BasicOperations
 * Contains addition, subtraction, multiplication and division
 */
package com.nackademin.henrik_gustafsson_assignment02;

public class BasicCalculator implements BasicOperations {

	@Override
	public double addition(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}

	@Override
	public double subtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}

	@Override
	public double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}

	@Override
	public double division(double firstNumber, double secondNumber) {
		return firstNumber / secondNumber;
	}
}
