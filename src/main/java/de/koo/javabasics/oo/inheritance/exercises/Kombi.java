package de.koo.javabasics.oo.inheritance.exercises;

public class Kombi extends Auto{
	private boolean einparkbar;

	public Kombi() {
		this.einparkbar = true;
	}

	public Kombi(boolean einparkbar) {
		this.einparkbar = einparkbar;
	}

	public Kombi(boolean einparkbar, Farbe farbe) {
		// Aufruf des Konstruktors der Basis/Elternklasse
		super(farbe);
		// alternativ
		//this.setFarbe(farbe);
		
		this.einparkbar = einparkbar;
	}

	public boolean isEinparkbar() {
		return einparkbar;
	}

	public void setEinparkbar(boolean einparkbar) {
		this.einparkbar = einparkbar;
	}
	
	
}
