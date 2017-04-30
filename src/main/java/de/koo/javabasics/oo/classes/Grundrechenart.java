package de.koo.javabasics.oo.classes;

public class Grundrechenart {
	// statische Konstante
	static final double PI=3.14;
	
	/**
	 * berechnet die Summe aus a und b
	 * 
	 * @param a Summand
	 * @param b Summand
	 * @return Summe
	 */
	int summe(int a,int b) {
		return a+b;
	}

	
	static int produkt(int a,int b) {
		return a*b;
	}
}
