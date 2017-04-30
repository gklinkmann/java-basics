package de.koo.javabasics.oo.inheritance;

public class Mitarbeiter extends Mann {
	public double gehalt;
	
	public Mitarbeiter() {
		super();
		gehalt=0;
	}
	
	public void arbeiten() {
		System.out.println("ich arbeite");
	}
	
	public String toString() {
		return "Ich bin ein Mitarbeiter";
	}
}
