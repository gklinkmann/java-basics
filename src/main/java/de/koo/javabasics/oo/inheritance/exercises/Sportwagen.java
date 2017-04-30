package de.koo.javabasics.oo.inheritance.exercises;

public class Sportwagen extends Auto{
	private boolean strassentauglich;

	public Sportwagen() {
		this.strassentauglich = false;
	}

	public Sportwagen(boolean strassentauglich) {
		this.strassentauglich = strassentauglich;
	}

	public boolean isStrassentauglich() {
		return strassentauglich;
	}

	public void setStrassentauglich(boolean strassentauglich) {
		this.strassentauglich = strassentauglich;
	}
	
}
