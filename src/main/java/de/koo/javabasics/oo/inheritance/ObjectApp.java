package de.koo.javabasics.oo.inheritance;

import java.util.ArrayList;

public class ObjectApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object objekt = new Object();
		System.out.println(objekt.toString());
		Auto auto=new Auto();
		auto.setFarbe(new Farbe("rosa"));
		Auto auto2=new Auto();
		System.out.println(auto.toString());
		System.out.println(auto);
		System.out.println(auto2);

		// Metainformation eines Objektes anzeigen
		System.out.println(objekt.getClass().getName());
		System.out.println(auto.getClass().getName());

		System.out.println("==============================");
		if (auto.equals(auto)) {
			System.out.println("die Objekte sind gleich");
		} else {
			System.out.println("die Objekte sind ungleich");			
		}

		String[] strings=new String[10];
		String[] newStrings=strings.clone();
		if (strings.equals(newStrings)) {
			System.out.println("die Objekte sind gleich");
		} else {
			System.out.println("die Objekte sind ungleich");			
		}
		
	}

}
