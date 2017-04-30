package de.koo.javabasics.exceptions;

public class RechnerApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rechner rechner=new Rechner();

		try {
			System.out.println(rechner.summeBerechnen());
		} catch (Exception e) {			
			// Ausgabe des Fehlerblocks (stack trace)
			e.printStackTrace();
		}
	}
}
