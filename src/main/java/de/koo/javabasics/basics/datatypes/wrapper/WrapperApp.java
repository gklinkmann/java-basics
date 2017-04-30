package de.koo.javabasics.basics.datatypes.wrapper;

public class WrapperApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Erzeugung primitiver Datentypen
		int i=1;
		
		// Erzeugung von Objekten der Wrapperklassen
		Integer ii=new Integer(1);
		
		// bis Java 1.4 ii=i; -> ii=new Integer(i);
		ii=i; // Autoboxing
		Integer j=1;
		
		// weiterhin mit primitiven Datentypen,
		// ansonsten Empfehlung mit den Wrapperklassen zu arbeiten
		for (int j2 = 0; j2 < 10; j2++) {
			System.out.println("juhu");
		}

	}

}
