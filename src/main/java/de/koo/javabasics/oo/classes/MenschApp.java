package de.koo.javabasics.oo.classes;

public class MenschApp {
	public static void main(String[] args) {
		// Erzeugung von Objekten
		Mensch adam=new Mensch();
		Mensch eva=new Mensch("Eva", 27, 1.70);
		Mensch paula=new Mensch("Paula", 27);
		System.out.println(paula.getName()+": "+paula.getAlter());
		Mensch paul=new Mensch();
		
		// Verwendung von Methoden auf Objekten
		Satz satz1=new Satz();
		paul.sprechen(satz1);
		
		int neuesAlterVonPaul=paul.altern();
		System.out.println(neuesAlterVonPaul);
		
		paul.setName("Paul"); // schreibender Zugriff über Methode
		System.out.println(paul.getName()); // lesender Zugriff über Methode
		
		// Objekt Attribute = Instanz Variablen
		System.out.println("Name Adam: "+adam.getName());
		System.out.println("Name Eva: "+eva.getName());
		adam.setName("Adam Kowalski");
		eva.setName("Eva Kowalski");
		System.out.println("Name Adam: "+adam.getName());
		System.out.println("Name Eva: "+eva.getName());
		
		// Klassenattribute
		// Veränderung des Wertes wirkt sich auf alle Objekte der Klasse aus
		System.out.println("Grüße Adam: "+adam.getGroesse());
		System.out.println("Grüße Eva: "+eva.getGroesse());
		adam.setGroesse(1.9);
		System.out.println("Grüße Adam: "+adam.getGroesse());
		System.out.println("Grüße Eva: "+eva.getGroesse());
		eva.setGroesse(1.7);
		System.out.println("Grüße Adam: "+adam.getGroesse());
		System.out.println("Grüße Eva: "+eva.getGroesse());
		
		// direkter Zugriff auf Attribute mit private unterbunden
		// eva.alter=7;
		System.out.println("Alter Eva: "+eva.getAlter());
		eva.altern();
		System.out.println("Alter Eva: "+eva.getAlter());
		
	}
}
