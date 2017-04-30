package de.koo.javabasics.interfaces.exercises;

import java.util.HashMap;
import java.util.Map;

public class Adressbuch {
	// Map <String, Adresse> mit Adressen
	Map <String, Adresse> adressen;
	
	// 1. Konstruktor
	public Adressbuch(){
		adressen=new HashMap <String, Adresse>();
	}

	// 2. Konstruktor
	public Adressbuch(Map<String, Adresse> adressen) {
		super();
		this.adressen = adressen;
	}

	// Methode getAdresse(Parameter für name)
		// @return Adresse für den Namen
	// Zugriffsmodifizierer, Rückgabewert, Methodenname, Parameterlist, Anweisungsblock
	public Adresse getAdresse(String name) {
		return adressen.get(name);
	}
}
