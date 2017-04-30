package de.koo.javabasics.oo.inheritance.exercises;

public class Auto extends Kfz{
	public Auto () {
		super();
	}
	
	public Auto (Farbe farbe) {
		super(farbe);
	}

	/**
	 * überschreiben der toString() Methode der Klasse Kfz
	 * 
	 * @return Zeichenkette
	 */
	public String toString() {
		//System.out.println(super.toString());
		return "Auto Farbe: " + this.farbe.getFarbton();
	}
}
