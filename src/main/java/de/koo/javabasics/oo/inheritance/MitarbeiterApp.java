package de.koo.javabasics.oo.inheritance;

public class MitarbeiterApp {
	public static void main(String[] args) {
		Mann mann=new Mann();
		//Mann mann=new Mitarbeiter();
		
		// Prüfung ob der Wert einer Variablen eine 
		// Instanz (Objekt) einer bestimmten Klasse ist
		if (mann instanceof Mitarbeiter) {
			// explizite Typkonversion = cast
			Mitarbeiter mitarbeiter=(Mitarbeiter)mann;
			mitarbeiter.arbeiten();
			
			// explizite Typkonversion = cast
			// ohne zusätzliche Variable
			((Mitarbeiter)mann).arbeiten();			
		} else {
			System.out.println("cast nicht möglich");
		}
		
		// von der Klasse Mensch können keine Objekte instanziert werden
		// da sie zu allgemein ist und sie deswegen als abstrakte Klasse
		// erstellt wurde
		//Mensch mensch = new Mensch();
		
		Mensch mensch2 = new Mann();
		Mensch mensch3 = new Mitarbeiter();
		
		System.out.println(mensch2.toString());
		System.out.println(mensch3.toString());
		
	}
}
