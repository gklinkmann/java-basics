package de.koo.javabasics.basics.syntax;

public class Typkonversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Primitive Datentypen
		 */
		
		double zahl2=1; // inplizite Typkonversion
//		int zahl1=1.2; Fehler
		int zahl3=(int)1.2; // explizite Typkonversion = cast
		
		System.out.println(zahl3);
	}

}
