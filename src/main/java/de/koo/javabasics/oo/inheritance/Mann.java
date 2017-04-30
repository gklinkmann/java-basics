package de.koo.javabasics.oo.inheritance;

public class Mann extends Mensch{
	private String telefonNummer;

	public Mann() {
		this.telefonNummer="";
	}
	
	public String getTelefonNummer() {
		return telefonNummer;
	}

	public void setTelefonNummer(String telefonNummer) {
		this.telefonNummer = telefonNummer;
	}

	public void telefonieren() {
		System.out.printf("Rufe die Nummer %s an."
				,this.telefonNummer);
	}
	/**
	 * Ausgabe ich bin ein Mann
	 */
	public String toString() {
		return "Ich bin ein Mann;";
	}

}
