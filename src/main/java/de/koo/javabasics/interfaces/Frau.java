package de.koo.javabasics.interfaces;

public class Frau extends Mensch implements Optimist{
	public Frau () {
	}
	
	public void einparken() {
		System.out.printf("Ich parke ein Auto mit der Farbe %s ein."
				,"");
	}
	
	/**
	 * Ausgabe ich bin ein Frau
	 */
	public String toString() {
		return "Ich bin eine Frau;";
	}

	@Override
	public void positivDenken() {
		System.out.println("Ich denke positiv");
		
	}
	
}
