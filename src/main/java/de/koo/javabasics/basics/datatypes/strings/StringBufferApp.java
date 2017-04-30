package de.koo.javabasics.basics.datatypes.strings;

public class StringBufferApp {
	public static void main(String[] args) {
		// Erzeugung von StringBuffer Objekten
		StringBuffer langeZeichenkette=new StringBuffer();
		StringBuffer langeZeichenkette2=new StringBuffer("Anfangswert");
		
		// alt und langsam
		String zeichenkette="";
		for (int i = 0; i < 10; i++) {
			// 10 Objekte
			zeichenkette+=" wort"+i;
		}
		System.out.println(zeichenkette.trim());

		// schnell und besser
		for (int i = 0; i < 10; i++) {
			// 1 Objekt
			langeZeichenkette.append(" wort"+i);
		}
		System.out.println(langeZeichenkette.toString().trim());
	}
}
