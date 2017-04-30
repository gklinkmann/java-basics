package de.koo.javabasics.interfaces.exercises;

import java.util.ArrayList;
import java.util.List;

import de.koo.javabasics.interfaces.exercises.media.Bluray;
import de.koo.javabasics.interfaces.exercises.media.Cd;
import de.koo.javabasics.interfaces.exercises.media.Dvd;
import de.koo.javabasics.interfaces.exercises.media.Mp3;

public class PlayListCollection implements PlayList{
	// Attribut mediaList als Array vom Datentyp Media
	private List<Media> mediaList;
	
	public List<Media> getMediaList() {
		return mediaList;
	}

	/**
	 * Hinzufügen von min. 4, max. 10 Objekten der Klassen Cd,Dvd,Bluray,Mp3
	 */
	public PlayListCollection() {
		// Anlegen eines Array Objektes, das 10 Elemente aufnehmen kann
		mediaList=new ArrayList<Media>();
		
		// Befüllen des Arrays mit Werten
		mediaList.add(new Dvd("kill bill"));
		mediaList.add(new Bluray("kill bill 2"));
		mediaList.add(new Mp3("TNT", new StringBuffer("AC / DC 2003")));
		mediaList.add(new Cd("back in black", new StringBuffer("AC / DC 2005")));
	}

	/**
	 * auf allen Elementen der mediaList die Methoden starten() und stoppen()
	 * aufrufen
	 * @throws PlayListException 
	 */
	public void abspielen() throws Exception {
		int titelnummer=1;
		for (Media media:mediaList) {
			System.out.printf("======= Titel Nr. %d =========\n",titelnummer );

			media.starten();
			media.stoppen();
			
			titelnummer++;
		}	
	}	
}
