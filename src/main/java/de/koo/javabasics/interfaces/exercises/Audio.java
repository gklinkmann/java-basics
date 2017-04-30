package de.koo.javabasics.interfaces.exercises;

/**
 * Adapter für Audio Medien
 * 
 * @author Dozent-B351
 *
 */
public abstract class Audio implements Media, Musik {
	protected String titel;
    protected StringBuffer beschreibung;
    
    /**
     * Konstruktor
     * Initialisierung von Attribut titel
     * 
     * @param titel
     * @throws Exception 
     */
	public Audio(String titel) {
		setTitel(titel);
		beschreibung=new StringBuffer();
	}

	public Audio(String titel, StringBuffer beschreibung) {
		setTitel(titel);
		this.beschreibung=beschreibung;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
			this.titel = titel;
	}

    public StringBuffer getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(StringBuffer beschreibung) {
		this.beschreibung = beschreibung;
	}

	@Override
	public void anzeigen() {
		System.out.printf("%s\n%s\n",this.titel,this.beschreibung);
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
	public void hoeren() {
		System.out.println("hoere: "+this.titel);
		
	}

	@Override
	public void kaufen() {
		System.out.println("kaufe: "+this.titel);
		
	}

	@Override
	public void empfehlen(String email){
		System.out.println(this.titel+" empfehlen an "+email);
		
	}

}
