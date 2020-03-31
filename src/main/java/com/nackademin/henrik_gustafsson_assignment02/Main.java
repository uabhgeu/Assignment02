package com.nackademin.henrik_gustafsson_assignment02;

public class Main {

	public static void main(String[] args) {
		BasicCalculator bc = new BasicCalculator();
		System.out.println(bc.addition(2,2));
		System.out.println(bc.subtraction(10,2));

		ScientificCalculator sc = new ScientificCalculator();
		System.out.println(sc.square(5));
		System.out.println(sc.raisedToThePowerOf(5,2));

	}

}
