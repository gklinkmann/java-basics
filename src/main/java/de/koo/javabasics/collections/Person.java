package de.koo.javabasics.collections;

public class Person {
	private String vorname; 
	private String nachname; 
	private String telefonnummer;
	
	public Person () {
		vorname="";
		nachname="";
		telefonnummer="";
	}
	
	public Person(String vorname, String nachname, String telefonnummer) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.telefonnummer = telefonnummer;
	}

	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getTelefonnummer() {
		return telefonnummer;
	}
	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	} 
}
