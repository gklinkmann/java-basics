package de.koo.javabasics.interfaces;

public class Mann extends Mensch implements Optimist,Pessimist{
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

	@Override
	public void positivDenken() {
		System.out.println("Ich denke positiv");
	}

	@Override
	public void negativDenken() {
		System.out.println("Ich denke negativ");
		
	}

}
