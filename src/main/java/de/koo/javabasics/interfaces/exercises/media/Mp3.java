package de.koo.javabasics.interfaces.exercises.media;

import de.koo.javabasics.interfaces.exercises.Audio;

public class Mp3 extends Audio{
	public Mp3(String titel) {
		super(titel);
	}

	public Mp3(String titel, StringBuffer beschreibung) {
		super(titel,beschreibung);
	}

	@Override
	public String toString() {
		return "Mp3 - "+getTitel();
	}
}
