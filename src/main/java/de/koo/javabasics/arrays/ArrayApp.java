package de.koo.javabasics.arrays;

import java.util.Arrays;

public class ArrayApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Erzeugen von Arrays Syntax -> Datentyp[]
		// mit Anzahl der abzuspeichernden Werte, die nicht mehr verändert werden kann
		String[] zeichenketten=new String[5];
		
		// Arrays mit Werten zu erzeugen
		Integer[] zahlenVonEinsBisDrei={1,2,3};
		
		/*
		Integer[] z=new Integer[3];
		z[0]=1; // Autoboxing Integer=int;
		z[1]=2;
		z[2]=3;
		*/
		
		// Werte zuweisen über den Index des Arrays
		zeichenketten[0]="eins";
		zeichenketten[1]="zwei";
		zeichenketten[2]="drei";
		zeichenketten[3]="vier";
		zeichenketten[4]="fünf";
		
		// Zugriff auf einen Wert über den Index
		System.out.println(zeichenketten[2]);
		
		// Anzahl der im Array enthaltenen Elemente über das Attribut length
		System.out.printf("Anzahl: %d\n",zeichenketten.length);
		
		// Alle Elemente des Arrays anzeigen
		for(int i=0;i<zeichenketten.length;i++) {
			System.out.println(zeichenketten[i]);
		}

		// nicht mehr als 5 Werte möglich,
		// da sonst Fehler: java.lang.ArrayIndexOutOfBoundsException
		for(int i=0;i<5;i++) {
			zeichenketten[i]="wort"+i;
		}

		for(int i=0;i<zeichenketten.length;i++) {
			System.out.println(zeichenketten[i]);
		}
		
		// Sortieren über Hilfsklasse java.util.Arrays
		Arrays.sort(zeichenketten);
		
		
	}

}
