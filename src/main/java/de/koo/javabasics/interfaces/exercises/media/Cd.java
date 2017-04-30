package de.koo.javabasics.interfaces.exercises.media;

import de.koo.javabasics.interfaces.exercises.Audio;

public class Cd extends Audio{


	public Cd(String titel) {
		super(titel);
	}

	public Cd(String titel, StringBuffer beschreibung) {
		super(titel,beschreibung);
	}

	@Override
	public String toString() {
		return "CD - "+getTitel();
	}
}
