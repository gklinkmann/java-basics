package de.koo.javabasics.arrays;

public class RechnerApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RechnerApp rechner=new RechnerApp();
		double durchschnitt=rechner.durchschnittBerechnen(1,2,3);

		System.out.println(durchschnitt);
		
		durchschnitt=rechner.durchschnittBerechnen(1,2,3,4,5,6,7,8,9);
		System.out.println(durchschnitt);
		
	}

	public double durchschnittBerechnen(double ... zahlen) {
		//Parameter zahlen Datentyp = double[]
		
		// Durchschnitt = Summe der Zahlen durch ihre Anzahl
		
		// Summe berechnen
		double summe=0;
		for (int i = 0; i < zahlen.length; i++) {
			double zahl=zahlen[i];

			summe=summe+zahl;
		}
		
		// alternativ
		/*
		for (double zahl : zahlen) {
			summe+=zahl;
		}
		*/
		
		return summe / zahlen.length;
	}
}
