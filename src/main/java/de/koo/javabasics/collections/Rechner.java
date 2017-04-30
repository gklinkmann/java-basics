package de.koo.javabasics.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Rechner {
	/**
	 * Methode, die ihre Ausnahmen (Exceptions) an die aufrufende
	 * Methode weitergibt
	 * Kennzeichnung der Ausnahme erfolgt über throws
	 * 
	 * @return
	 * @throws Exception
	 */
	public int summeBerechnen() throws Exception {
		int summe=0;
		// Arrays sind pfui
		//int[] zahlen = new int[2];
		
		// Erzeugung einer Liste, die nur Objekte der Klasse Double aufnehmen kann
		// <Generics> = Datentypen für Collections
		// früher: List zahlen=new ArrayList();
		List<Integer> zahlen=new ArrayList<Integer>();
		
		// Werte hinzufügen
		for (int i = 0; i < 100; i++) {
			zahlen.add(i);
		}			
		
		// Summe berechnen
		// alt
//		for (int i = 0; i < zahlen.length; i++) {
//			summe+=zahlen[i];
//		}

		// früher konnten nur Objekte der Klasse Object in Listen gespeichert werden
		for (Iterator iterator = zahlen.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();			
		}

		// ab Java 1.5, als Generics eingeführt wurden
		for (Integer zahl : zahlen) {
			summe+=zahl;
		}
		
		return summe;
	}
}
