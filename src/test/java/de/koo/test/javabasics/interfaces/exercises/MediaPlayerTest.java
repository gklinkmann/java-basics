package de.koo.test.javabasics.interfaces.exercises;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.koo.javabasics.interfaces.exercises.MediaPlayer;

public class MediaPlayerTest {
	private MediaPlayer player;
	
	@Before
	public void setUp() throws Exception {
		player=new MediaPlayer();
	}

	@Test
	public void play() {
		player.play();
	}

}
