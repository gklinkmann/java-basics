package de.koo.javabasics.oo.inheritance;

public class Farbe {
	// verstecktes Attribut
	private String farbton;

	/**
	 * Konstruktor ohne Parameter
	 */
	public Farbe() {
		this.farbton = "";
	}
	
	/**
	 * Konstruktor mit Parameter
	 *
	 * @param farbton Farbton
	 */
	public Farbe(String farbton) {
		this.farbton = farbton;
	}
	
	/**
	 * lesender Zugriff auf den Farbton
	 * 
	 * @return
	 */
	public String getFarbton() {
		return farbton;
	}

	/**
	 * schreibender Zugriff auf den Farbton
	 * 
	 * @return
	 */
	public void setFarbton(String farbton) {
		this.farbton = farbton;
	}
}
