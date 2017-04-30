package de.koo.javabasics.basics.controls.exercises;

public class Alter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int alter=31;
		if (alter < 10) {
			System.out.println("sehr jung");
		// 2. Bedingung
		} else if (alter >= 10 && alter <= 20) {
			System.out.println("jung");
		// 3. Bedingung
		} else if (alter > 30) {
			System.out.println("alt");
		} else {
			System.out.println("twen");
		}
	}

}
