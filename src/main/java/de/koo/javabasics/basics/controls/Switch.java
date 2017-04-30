package de.koo.javabasics.basics.controls;

public class Switch {

	/**
	 * switch ist die Überprüfung des Wertes einer Variablen
	 * auf Gleichheit mit unterschiedlichen Werten
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int a=2;
		switch (a) {
		case 2: 
			System.out.println("a==2");			
			break;
		case 3: 
			System.out.println("a==3");			
			break;
		case 4: 
			System.out.println("a==4");			
			break;
		default:
			System.out.println(a);			
			break;
		}

		// alternativ
		if (a == 2) {
			System.out.println("die 1. Bedingung ist wahr");
		// 2. Bedingung
		} else if (a == 3) {
			System.out.println("die 2. Bedingung ist wahr");
		// 3. Bedingung
		} else if (a == 4) {
			System.out.println("die 3. Bedingung ist wahr");
		} else {
			System.out.println(a);
		}

	}

}
