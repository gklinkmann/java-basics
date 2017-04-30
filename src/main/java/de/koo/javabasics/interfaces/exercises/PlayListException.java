package de.koo.javabasics.interfaces.exercises;

public class PlayListException extends Exception {

	public PlayListException() {
	}

	public PlayListException(String message) {
		super(message);
	}

	public PlayListException(Throwable cause) {
		super(cause);
	}

	public PlayListException(String message, Throwable cause) {
		super(message, cause);
	}

}
