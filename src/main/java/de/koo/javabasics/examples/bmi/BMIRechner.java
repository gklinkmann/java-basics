package de.koo.javabasics.examples.bmi;

public class BMIRechner {
	private Double groesse, gewicht;
	private Double bmi;
	private Integer alter;

	
	public BMIRechner() {
		bmi=0.0;
		alter=0;
	}

	public BMIRechner(Double groesse, Double gewicht) {
		this.groesse = groesse;
		this.gewicht = gewicht;
		alter=0;
	}

	public BMIRechner(Double groesse, Double gewicht,Integer alter) {
		this.groesse = groesse;
		this.gewicht = gewicht;
		this.alter = alter;
	}
	
	public Integer getAlter() {
		return alter;
	}

	public void setAlter(Integer alter) {
		this.alter = alter;
	}

	public Double getGroesse() {
		return groesse;
	}

	public void setGroesse(Double groesse) {
		this.groesse = groesse;
	}

	public Double getGewicht() {
		return gewicht;
	}

	public void setGewicht(Double zahl2) {
		this.gewicht = zahl2;
	}

	public Double berechnen() {
		bmi=Math.round(gewicht/(groesse*groesse)*10)/10.0;
		return bmi;
	}

	public String interpretieren() {
		String interpretation="";
		if (bmi<16) {
			interpretation="starkes Untergewicht";
		} else if (bmi>=16 && bmi<17) {
			interpretation="maessiges Untergewicht";
		} else if (bmi>=17 && bmi<18.5) {
			interpretation="leichtes Untergewicht";
		} else if (bmi>=18.5 && bmi<25) {
			interpretation="Normalgewicht";
		} else if (bmi>=25 && bmi<30) {
			interpretation="Präadipositas";
		} else if (bmi>=30 && bmi<35) {
			interpretation="Adipositas Grad I";
		} else if (bmi>=35 && bmi<40) {
			interpretation="Adipositas Grad II";
		} else if (bmi>=40) {
			interpretation="Adipositas Grad III";
		} else {

		}
		return interpretation;
	}
	
	public Boolean isOptimalterBMMI () {
		Boolean optimalerBMI=false;
		
		if ((alter>=19 && alter <= 24 && bmi >= 19 && bmi <= 24)
				|| (alter>=25 && alter <= 34 && bmi >= 20 && bmi <= 25)
				|| (alter>=35 && alter <= 44 && bmi >= 21 && bmi <= 26)
				|| (alter>=45 && alter <= 54 && bmi >= 22 && bmi <= 27)
				|| (alter>=55 && alter <= 64 && bmi >= 23 && bmi <= 28)
				|| (alter>=65 && bmi >= 24 && bmi <= 29)) {
			optimalerBMI=true;
		}
		
		return optimalerBMI;
	}
}
