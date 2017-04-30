package de.koo.javabasics.interfaces.exercises;

import de.koo.javabasics.interfaces.exercises.media.Bluray;
import de.koo.javabasics.interfaces.exercises.media.Cd;
import de.koo.javabasics.interfaces.exercises.media.Dvd;
import de.koo.javabasics.interfaces.exercises.media.Mp3;

public class PlayListArray implements PlayList{
	// Attribut mediaList als Array vom Datentyp Media
	// Array durch ArrayList ersetzen
	private Media[] mediaList;
	
	/**
	 * Hinzufügen von min. 4, max. 10 Objekten der Klassen Cd,Dvd,Bluray,Mp3
	 */
	public PlayListArray() {
		// Anlege eines Array Objektes, das 10 Elemente aufnehmen kann
		// Array durch ArrayList ersetzen
		mediaList=new Media[10];
		
		// Befüllen des Arrays mit Werten
		// ArrayList befüllen
		mediaList[0]=new Dvd("kill bill");
		mediaList[1]=new Bluray("kill bill 2");
		mediaList[2]=new Mp3("TNT", new StringBuffer("AC / DC 2003"));
		mediaList[3]=new Cd("back in black", new StringBuffer("AC / DC 2005"));
	}

	/**
	 * auf allen Elementen der mediaList die Methoden starten() und stoppen()
	 * aufrufen
	 * @throws PlayListException 
	 */
	public void abspielen() throws Exception {
		// ArrayList auslesen
		// sind dann noch die Exceptions notwendig?
		for (int i = 0; i < mediaList.length; i++) {
			System.out.printf("======= Titel Nr. %d =========\n",i+1 );
			Media media = mediaList[i];

			// try catch Block, der die NullPointer und sonstige Exceptions abfängt
			// im catch Block eine neues Fehlerobjekt wirft (PlayListException)
			try {
				media.starten();
				media.stoppen();				
			} catch (NullPointerException e) {
				System.out.printf("Fehler: %s - %s\n",e.getClass().getName(),e.getMessage());
				throw new PlayListException("Titel kann nicht gestartet werden.");
			} catch (Exception e) {
				System.out.printf("Fehler: %s - %s\n",e.getClass().getName(),e.getMessage());
				throw new PlayListException("Titel kann nicht gestartet werden.");
			}
		}	
	}	
}
