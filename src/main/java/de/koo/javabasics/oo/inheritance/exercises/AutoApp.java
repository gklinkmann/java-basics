package de.koo.javabasics.oo.inheritance.exercises;

public class AutoApp {
	public static void main(String[] args) {
		Farbe farbe; // Deklaration der Variablen farbe mit Datentyp Farbe
		Auto opel=new Auto(); // Wert = Referenz auf neues Objekt der Klasse Auto
		Auto bmw=new Auto(); // Wert = Referenz auf neues Objekt der Klasse Auto
		
		// Verwendung des Konstruktors mit Parameter
		farbe=new Farbe("stahl blau"); //Wert = Referenz auf neues Objekt der Klasse Farbe (1. Objekt)
		bmw.setFarbe(farbe);

		// Verwendung des Konstruktors ohne Parameter
		farbe=new Farbe(); //Wert = Referenz auf neues Objekt der Klasse Farbe (2. Objekt)
		farbe.setFarbton("spanisch rot");
		opel.setFarbe(farbe);
		
		System.out.println(bmw.getFarbe().getClass().getName());
		System.out.println(bmw.getFarbe().getFarbton());
		System.out.println(opel.getFarbe().getClass().getName());
		System.out.println(opel.getFarbe().getFarbton());
		
		bmw.fahren();
		opel.fahren(false);
//		opel.fahren();
//		bmw.fahren(true);
		System.out.println("=================================");
		
		// Aufruf des Konstruktors
		Kombi kombi=new Kombi(true, farbe);
		kombi.fahren(false);
		if (kombi.isEinparkbar()) {
			System.out.println("der Kombi ist einparkbar");
		} else {
			System.out.println("Beim Einparken besteht Unfallgefahr");
		}
	}
}
