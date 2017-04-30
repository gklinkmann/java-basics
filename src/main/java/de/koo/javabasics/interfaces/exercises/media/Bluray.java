package de.koo.javabasics.interfaces.exercises.media;

import de.koo.javabasics.interfaces.exercises.Video;

public class Bluray extends Video{
	public Bluray(String titel) {
		super(titel);
	}

	@Override
	public String toString() {
		return "Bluray - "+getTitel();
	}
}
