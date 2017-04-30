package de.koo.javabasics.basics.controls.exercises;

public class Ausgabe10x10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		for (int row=1 ;row < 11;row++) {
			for (int col=1 ;col < 11;col++) {
				// Ausgabe innere Schleife
				System.out.printf("\t%d ",row*col);
			}
			// Ausgabe �u�ere Schleife - Zeilenumbruch
			System.out.println();
		}

	}

}
