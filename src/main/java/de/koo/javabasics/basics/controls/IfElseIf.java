package de.koo.javabasics.basics.controls;

public class IfElseIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a=1;
		int b=2;
		int c=3;
		boolean wahr;
		// 1. Bedingung
		if (a == b) {
			System.out.println("die 1. Bedingung ist wahr");
		// 2. Bedingung
		} else if (a < b) {
			System.out.println("die 2. Bedingung ist wahr");
		// 3. Bedingung
		} else if (a < c) {
			System.out.println("die 3. Bedingung ist wahr");
		} else {
			System.out.println("die Bedingung ist falsch");
		}

		if (a == 2) {
			System.out.println("die 1. Bedingung ist wahr");
		// 2. Bedingung
		} else if (a == 3) {
			System.out.println("die 2. Bedingung ist wahr");
		// 3. Bedingung
		} else if (a == 4) {
			System.out.println("die 3. Bedingung ist wahr");
		} else {
			System.out.println("die Bedingung ist falsch");
		}
	}

}
