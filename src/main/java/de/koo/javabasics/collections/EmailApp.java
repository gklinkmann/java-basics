package de.koo.javabasics.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class EmailApp {
	public static void main(String[] args) {
		// HashSet Reihenfolge der Elemente ist nicht gewährleistet
		// da HashSet performance orientiert ist
		Set<String> emails=new HashSet<String>();
		
		emails.add("homer.simpson@springfield.com");
		emails.add("bart.simpson@springfield.com");
		emails.add("bart.simpson@springfield.com");
		
		for (Iterator iterator = emails.iterator(); iterator.hasNext();) {
			String email = (String) iterator.next();
		}
		
		// keine Methode get
		/*
		for (int i=0; i<emails.size();i++) {
			String email = (String) emails.get(i);
		}
		*/
		
		for (String email : emails) {
			System.out.println(email);
		}
		
		System.out.println("============================");
		// LinkedHashSet: andere Implementierrung von Set
		// bleibt die Reihenfolge des Hinzuf�gens erhalten
		emails=new LinkedHashSet<String>();
		
		emails.add("homer.simpson@springfield.com");
		emails.add("bart.simpson@springfield.com");
		emails.add("bart.simpson@springfield.com");
		
		for (String email : emails) {
			System.out.println(email);
		}
		
		System.out.println("============================");
		// Sets enthalten keine Methode für den direkten Zugriff auf ein Element
		// nur über Umwege möglich
		// 1.) Umwandlung in Array
		Object[] emailStrings=emails.toArray();
		System.out.println(emailStrings[1].toString());
		
		// 2.) Umwandlung in eine Implementierung des Interfaces List
		List<String>emailList=new ArrayList<String>();
		emailList.addAll(emails);
		System.out.println(emailList.get(1));
		
		// Kurzschreibweise: Verwendung des Konstruktors
		emailList=new ArrayList<String>(emails);
	}
}
