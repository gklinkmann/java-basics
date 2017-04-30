package de.koo.javabasics.oo.inheritance;

public class MenschApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mann mann=new Mann();
		Frau frau=new Frau();
		
		mann.setName("Adam");
		frau.setName("Eva");
		
		System.out.printf("Name des Mannes: %s\nName der Frau: %s\n"
				,mann.getName()
				,frau.getName());
		
		mann.setTelefonNummer("069/123456");
		mann.telefonieren();
		
		// lange Schreibweise
		Farbe farbe=new Farbe();
		farbe.setFarbton("rot");

		Auto auto=new Auto();
		auto.setFarbe(farbe);

		System.out.println();
		frau.setAuto(auto);
		frau.einparken();

		// kurze Schreibweise durch zusätzliche Konstruktoren
		Farbe farbe2=new Farbe("blau");
		Auto auto2=new Auto(farbe2);
		frau.setAuto(auto2);
		frau.einparken();
		
		System.out.println("\n=======================");
		System.out.println(mann.toString());
		System.out.println(frau.toString());

	}
}
