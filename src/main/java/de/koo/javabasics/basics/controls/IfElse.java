package de.koo.javabasics.basics.controls;

public class IfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (false) {
			System.out.println("die Bedingung ist wahr");
		} else {
			System.out.println("juhu");
		}

		boolean wahr=true;
		if (wahr) {
			System.out.println("die Bedingung ist wahr");
		} else {
			System.out.println("die Bedingung ist falsch");
		}

		int a=1;
		int b=2;
		boolean wahr2;
		if (a==b) {
//			System.out.println("die Bedingung ist wahr");
			wahr2=true;
		} else {
//			System.out.println("die Bedingung ist falsch");
			wahr2=false;
		}
	}

}
