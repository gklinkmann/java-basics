package de.koo.javabasics.oo.inheritance.exercises;

public class Lkw extends Kfz{
	public Lkw () {
		super();
	}
	
	public Lkw (Farbe farbe) {
		super(farbe);
	}

	public String toString() {
		return "Lkw Farbe: " + this.farbe.getFarbton();
	}
}
