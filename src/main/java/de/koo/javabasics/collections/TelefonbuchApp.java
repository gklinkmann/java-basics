package de.koo.javabasics.collections;

import java.util.HashMap;
import java.util.Map;

public class TelefonbuchApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Map = Schlüssel, Wert Paare (Key, Value)
		// erzeugen: Generics für Schlüssel und Wert
		Map<String,Person> telefonbuch=new HashMap<String,Person>();

		// Werte hinzufügen über die Methode put
		telefonbuch.put("bart",new Person("Bart","Simpson","+01 939 123 456"));
		telefonbuch.put("lisa",new Person("Lisa","Simpson","+01 939 123 457"));
		telefonbuch.put("maggie",new Person("Maggie","Simpson","+01 939 123 458"));
		telefonbuch.put("marge",new Person("Marge","Simpson","+01 939 123 459"));
		telefonbuch.put("homer",new Person("Homer","Simpson","+01 939 123 460"));
		
		System.out.println(telefonbuch.size());
		
		// alle Schlüssel über die Methode keySet
		for (String schluessel : telefonbuch.keySet()) {
			System.out.println(schluessel);
		}
		
		// einen Wert aus der Map, durch Zugriff über den Schlüssel
		Person paul=telefonbuch.get("homer");
		System.out.println(paul.getVorname());
		
		// alle Werte aus der Map
		for (String schluessel : telefonbuch.keySet()) {
			Person person=telefonbuch.get(schluessel);

			System.out.println(person.getTelefonnummer());
		}
	}

}
