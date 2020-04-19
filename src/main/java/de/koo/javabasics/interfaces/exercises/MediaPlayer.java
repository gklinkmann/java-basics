package de.koo.javabasics.interfaces.exercises;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class MediaPlayer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MediaPlayer player=new MediaPlayer();
		player.play();
	}

	public void play() {
		// In der Klasse MediaPlayer auf die PlayListException reagieren
		PlayListCollection playList;
		playList = new PlayListCollection();

		try {
			playList.abspielen();

			// Titel Nummer 2 weiterempfehlen
			List<Media> mediaList = playList.getMediaList();
			Media media = mediaList.get(1);

			// Emailadresse Adam
			// Adresse Adam
			Adresse adamsAdresse = getAdressbuch().getAdresse("adam");
			String adamsEmail = adamsAdresse.getEmails().get(0);

			media.empfehlen(adamsEmail);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// möglich
		// Audio a1=new Cd("juhu");
		System.out.println("===============================\nEnde der Wiedergabe");
	}

	public Adressbuch getAdressbuch() {
		Map<String, Adresse> adressen = new HashMap<String, Adresse>();

		SortedSet emails = new TreeSet();
		emails.add("eva@itzbund.de");
		emails.add("eva.kowalski@itzbund.de");
		adressen.put("eva", new Adresse(emails));

		emails = new TreeSet();
		emails.add("adam@itzbund.de");
		emails.add("adam.kowalski@itzbund.de");

		adressen.put("adam", new Adresse(emails));

		return new Adressbuch(adressen);
	}
}
