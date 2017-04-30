package de.koo.javabasics.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortierteEmailApp {
	public static void main(String[] args) {
		// TreeSet = sortierte Eindeutigkeit
		SortedSet<String> emails=new TreeSet<String>();
		
		emails.add("homer.simpson@springfield.com");
		emails.add("bart.simpson@springfield.com");
		emails.add("bart.simpson@springfield.com");
		emails.add("bart.simpson@springfield.com");
		emails.add("marge.simpson@springfield.com");
		emails.add("lisa.simpson@springfield.com");
		emails.add("maggie.simpson@springfield.com");
				
		for (String email : emails) {
			System.out.println(email);
		}
		
		System.out.println("============================");
		// SortedSet ermöglicht Zugriff auf erstes und letztes Element
		System.out.println(emails.first());
		System.out.println(emails.last());
		
		System.out.println("============================");
		SortedSet<String> emailsAmAnfang=emails.headSet("lisa.simpson@springfield.come");
		for (String email : emailsAmAnfang) {
			System.out.println(email);
		}
		
	}
}
