package de.koo.javabasics.oo.classes;
/**
 * Klasse zur Erzeugung von Menschen
 * 
 * @author gklinkmann
 */
public class Mensch {

	// Default Konstruktor
	public Mensch () {
		// Vorbelegung oder Initialisierung von Attributen
		alter=1;
		name="";
		groesse=0;
	}
	
	public Mensch (String name, int alter, double groesse) {
		// Vorbelegung oder Initialisierung von Attributen
		this.alter=alter;
		this.name=name;
		this.groesse=groesse;
	}

	public Mensch (String name, int alter) {
		// Vorbelegung oder Initialisierung von Attributen
		this.alter=alter;
		this.name=name;
		groesse=0;
	}

	// Attribute
	private int alter;
	
	String name;
	static double groesse;
	
	public double getGroesse() {
		return groesse;
	}

	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}

	/**
	 * liefert den Namen des Menschen
	 */
	void heissen() {
		
	}

	/**
	 * lesender Zugriff auf das Alter eines Menschen
	 * 
	 * @return aktuelles Alter
	 */
	public int getAlter () {
		return alter;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * lässt den Menschen 1 Jahr älter werden und gibt als 
	 * 
	 * @return das neue Alter
	 */
	public int altern() {
		alter++;
		
		// Rückgabewert sollte an letzter Stelle der Methode stehen
		return alter;
	}

	/**
	 * lässt den Menschen einen Satz sprechen
	 * void = leerer Rückgabewert -> kein return erforderlich
	 * 
	 * @param satz Satz der gesprochen werden soll
	 */
	void sprechen(Satz satz) {
		satz.ausgeben();
	}
	
	/**
	 * 2 Sätze sprechen
	 * Methoden überladen mit mehreren Parametern 
	 * 
	 * @param satz
	 * @param satz2
	 */
	void sprechen(Satz satz, Satz satz2) {
		satz.ausgeben();
		satz2.ausgeben();
	}
	
	/**
	 * Wort sprechen
	 * Methoden überladen mit unterschiedlichem Datentyp
	 * 
	 * @param wort
	 */
	void sprechen(Wort wort) {
		wort.ausgeben();
	}

	
}
