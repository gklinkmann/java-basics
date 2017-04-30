package de.koo.javabasics.arrays;

public class Rechner {
	public static void main(String[] args) {
		Rechner rechner=new Rechner();
		double durchschnitt=rechner.durchschnittBerechnen(1,2,3);
		System.out.println(durchschnitt);
	}
	
	public double durchschnittBerechnen (double ... zahlen) {
		double sum=0;
		
		for (double zahl : zahlen) {
			sum+=zahl;
		}
		
		return sum/zahlen.length;
	}
}
