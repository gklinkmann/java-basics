package de.koo.javabasics.interfaces;
/**
 * Klasse für einzelne Wörter
 * 
 * @author gklinkmann
 *
 */
public class Wort {
	String inhalt="Hallo";
	
	/**
	 * gibt ein Wort aus
	 */
	void ausgeben () {
		System.out.println(inhalt);
	}
}
