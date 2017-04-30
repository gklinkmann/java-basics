package de.koo.javabasics.interfaces.exercises;

import java.util.ArrayList;
import java.util.List;


public class ErweitertePlayList {
	List<Media> mediaList;
	
	public ErweitertePlayList() {
		mediaList=new ArrayList<Media>();
	}
	
	public void hinzufuegen(Media media) {
		mediaList.add(media);
	}
	
	public void abspielen() {
		for (Media media : mediaList) {
			media.starten();
			media.stoppen();
		}
	}
}
