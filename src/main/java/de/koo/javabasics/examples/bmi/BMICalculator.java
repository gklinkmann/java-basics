package de.koo.javabasics.examples.bmi;

public class BMICalculator {
	private Double size, weight;
	private Double bmi;
	private Integer age;

	
	public BMICalculator() {
		bmi=0.0;
		age=0;
	}

	public BMICalculator(Double size, Double weight) {
		this.size = size;
		this.weight = weight;
		age=0;
	}

	public BMICalculator(Double size, Double weight,Integer age) {
		this.size = size;
		this.weight = weight;
		this.age = age;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double calculate() {
		bmi=Math.round(weight/(size*size)*10)/10.0;
		return bmi;
	}

	public String interpret() {
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
	
	public Boolean isOptimalBMI () {
		Boolean optimalerBMI=false;
		
		if ((age>=19 && age <= 24 && bmi >= 19 && bmi <= 24)
				|| (age>=25 && age <= 34 && bmi >= 20 && bmi <= 25)
				|| (age>=35 && age <= 44 && bmi >= 21 && bmi <= 26)
				|| (age>=45 && age <= 54 && bmi >= 22 && bmi <= 27)
				|| (age>=55 && age <= 64 && bmi >= 23 && bmi <= 28)
				|| (age>=65 && bmi >= 24 && bmi <= 29)) {
			optimalerBMI=true;
		}
		
		return optimalerBMI;
	}
}
