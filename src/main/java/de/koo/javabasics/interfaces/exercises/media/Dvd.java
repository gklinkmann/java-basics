package de.koo.javabasics.interfaces.exercises.media;

import de.koo.javabasics.interfaces.exercises.Video;

public class Dvd extends Video{
	public Dvd(String titel) {
		super(titel);
	}

	@Override
	public String toString() {
		return "DVD - "+getTitel();
	}
}
