package de.koo.javabasics.basics.controls;

public class ForFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		for (int i=1 ;i < 4;i++) {
			// Ausgabe äußere Schleife
			System.out.println(i);
			for (int j=1 ;j < 4;j++) {
				// Ausgabe innere Schleife
				System.out.println("== "+i);
				System.out.println("=== "+j);
			}
		}

	}

}
