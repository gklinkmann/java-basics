package de.koo.javabasics.basics.syntax;

public class Ausgabe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// normale Ausgabe mit Zeilenumbruch
		System.out.println("hallo");
		System.out.println("=====");
		
		// formatierte Ausgabe
		System.out.printf("%s\n%s\n","hallo","=====");
		                //Format    , Wert1 , Wert2
		                //mit Platzhaltern
		
		// Datumsangabe mit Zeilenumbruch
		System.out.printf("%d.%d.%d\n",8,11,2010);
		System.out.printf("0%d.%d.%d\n",8,11,2010);
	}

}
