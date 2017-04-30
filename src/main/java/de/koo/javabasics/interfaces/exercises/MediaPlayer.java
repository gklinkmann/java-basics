package de.koo.javabasics.interfaces.exercises;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import de.koo.javabasics.interfaces.exercises.media.Bluray;
import de.koo.javabasics.interfaces.exercises.media.Cd;
import de.koo.javabasics.interfaces.exercises.media.Dvd;
import de.koo.javabasics.interfaces.exercises.media.Mp3;

public class MediaPlayer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Media m1=new Cd("back in black", new StringBuffer("AC / DC 2005"));
		// Attribut beschreibung mit Wert füllen für m1
		//((Cd)m1).setBeschreibung(new StringBuffer("AC / DC 2005"));
		// oder
		//((Audio)m1).setBeschreibung(new StringBuffer("AC / DC 2005"));
		// m1
		//(Cd)m1
		//((Cd)m1)
		//((Cd)m1).setBeschreibung()
		//((Cd)m1).setBeschreibung(new StringBuffer())
		//((Cd)m1).setBeschreibung(new StringBuffer("Wert"))
		
		
		Media m2=new Dvd("kill bill");
		Media m3=new Bluray("kill bill 2");
		Media m4=new Mp3("TNT", new StringBuffer("AC / DC 2003"));

		Map<String, Adresse> adressen=new HashMap<String, Adresse>();

		SortedSet emails=new TreeSet();
		emails.add("eva@zivit.de");
		emails.add("eva.kowalski@zivit.de");
		adressen.put("eva", new Adresse(emails));
		
		emails=new TreeSet();
		emails.add("adam@zivit.de");
		emails.add("adam.kowalski@zivit.de");
		
		adressen.put("adam", new Adresse(emails));

		Adressbuch adressbuch=new Adressbuch(adressen);
		
		// In der Klasse MediaPlayer auf die PlayListException reagieren
		PlayListCollection playList;
		playList=new PlayListCollection();
		boolean gut=true;
		if (gut) {
			playList=new PlayListCollection();
		} else {
			//playList=new PlayListArray();
		}
		try {
			playList.abspielen();
			
			// Titel Nummer 2 weiterempfehlen
			List<Media> mediaList=playList.getMediaList();
			Media media=mediaList.get(1);
			
			// Emailadresse Adam
				// Adresse Adam
			Adresse adamsAdresse=adressbuch.getAdresse("adam");
			String adamsEmail=adamsAdresse.getEmails().get(0);
			
			media.empfehlen(adamsEmail);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// möglich
		// Audio a1=new Cd("juhu");
		System.out.println("===============================\nEnde der Wiedergabe");
	}

}
