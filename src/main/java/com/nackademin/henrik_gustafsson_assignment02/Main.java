/*
 * Main method for the project
 */

package com.nackademin.henrik_gustafsson_assignment02;

public class Main {

	public static void main(String[] args) {
		BasicCalculator bc = new BasicCalculator();
		System.out.println(bc.addition(2, 2));
		System.out.println(bc.subtraction(2, 12));
		System.out.println(bc.division(2, 1));

		ScientificCalculator sc = new ScientificCalculator();
		System.out.println(sc.square(4));
		System.out.println(sc.raisedToThePowerOf(6, 2));
		System.out.println(sc.squareRoot(5));
		System.out.println(sc.max(5, 7));
		System.out.println(sc.min(5, 7));
	}

}
