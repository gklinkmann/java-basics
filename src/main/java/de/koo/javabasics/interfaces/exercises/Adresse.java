package de.koo.javabasics.interfaces.exercises;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Adresse{
	// Attribut: Set emails, die nur Werte von String aufnehmen kann
	private Set<String> emails;
	
	/**
	 * Konstruktor
	 * ein Objekt der Klasse LinkedHashSet als erster Wert vergeben werden
	 * 2 Emails dem Set hinzufügen
	 */	
	public Adresse() {
		emails=new LinkedHashSet<String>();
		emails.add("gero.klinkmann@itzbund.de");
		emails.add("thomas.hanke@itzbund.de");
	}
	
	public Adresse(Set<String> emails) {
		this.emails = emails;
	}

	/**
	 * Methode getEmails
	 * @return List, die nur Werte von String aufnehmen kann
	 */
	public List<String> getEmails() {
//		List<String> emailList=new ArrayList<String>();
//		emailList.addAll(emails);
//		
//		return emailList;
		
		return new ArrayList<String>(emails);
	}
}
