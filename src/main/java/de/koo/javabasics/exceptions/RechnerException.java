package de.koo.javabasics.exceptions;

public class RechnerException extends Exception {
	//==================
	// Konstruktoren
	//==================
	// Konstruktoren der Basisklasse werden verwendet
	public RechnerException() {
		super();
	}

	public RechnerException(String message) {
		super(message);
	}

	public RechnerException(Throwable cause) {
		super(cause);
	}

	public RechnerException(String message, Throwable cause) {
		super(message, cause);
	}

	//==================
	// Methoden
	//==================
}
