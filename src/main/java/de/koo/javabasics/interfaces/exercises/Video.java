package de.koo.javabasics.interfaces.exercises;

/**
 * Adapter für Audio Medien
 * 
 * @author Dozent-B351
 *
 */
public abstract class Video implements Media {
    protected String titel;
    
	public Video(String titel) {
		this.titel = titel;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	@Override
	public void anzeigen() {
		System.out.println("anzeigen: "+toString());
	}

	@Override
	public void starten() {
		System.out.println("start: "+this.toString());

	}

	@Override
	public void stoppen(){
		System.out.println("stop:  "+this.toString());
		
	}


	@Override
	public void empfehlen(String email){
		System.out.println(this.toString()+" empfehlen an "+email);
		
	}
	
}
