package de.koo.javabasics.oo.inheritance;

public class Frau extends Mensch{
	private Auto auto;

	public Frau () {
		auto=new Auto();
	}
	
	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	
	public void einparken() {
		System.out.printf("Ich parke ein Auto mit der Farbe %s ein."
				,this.auto.getFarbe().getFarbton());
	}
	
	/**
	 * Ausgabe ich bin ein Frau
	 */
	public String toString() {
		return "Ich bin eine Frau;";
	}
	
}
