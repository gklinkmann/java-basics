package de.koo.javabasics.oo.inheritance;

public class Auto extends Object{
	private Farbe farbe;

	public Auto () {
		farbe=new Farbe();
	}
	
	public Auto (Farbe farbe) {
		this.farbe=farbe;
	}

	public void fahren() {
		System.out.println("Ich bin "+this.farbe.getFarbton()+". Ich fahre.");
	}

	public void fahren(boolean schnell) {
		if (schnell) {
			System.out.println("Ich bin "+this.farbe.getFarbton()+". Ich fahre schnell.");
		} else {
			System.out.println("Ich bin "+this.farbe.getFarbton()+". Ich fahre langsam.");
		}
	}

	/**
	 * auslesen des Wertes für das Attribut farbe
	 * 
	 * @return Referenz auf ein Objekt der Klasse Farbe
	 */
	public Farbe getFarbe() {
		return farbe;
	}

	/**
	 * verändern des Wertes für das Attribut farbe
	 * 
	 * @param farbe Nur Werte erlaubt, die eine Referenz auf ein Objekt der Klasse Farbe enthalten
	 */
	public void setFarbe(Farbe farbe) {
		this.farbe = farbe;
	}
	
	protected Object clone() {
		return new Auto();
		
	}
	
	@Override
	/**
	 * @return Farbton des Autos
	 */
	public String toString() {
		return this.farbe.getFarbton();
	}
}
