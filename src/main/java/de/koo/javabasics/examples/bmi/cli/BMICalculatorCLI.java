package de.koo.javabasics.examples.bmi.cli;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import de.koo.javabasics.examples.bmi.BMICalculator;

public class BMICalculatorCLI {
	private Double size;
	private Double weight;
	private Integer age;
	

	/**
	 * Default Konstruktor (kann auch entfallen)
	 */
	public BMICalculatorCLI() {
	}

	/**
	 * Tastatureingaben entgegennehmen
	 */
	private void readInput() {

		// Tastatureingabestrom
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			try {
				// Tastatureingabe von zwei ganzen Zahlen
				if (size  == null) {
					System.out.print("Bitte die Groesse eingeben: ");
					size = new Double(in.readLine());
				} 
				
				if (weight  == null) {
					System.out.print("Bitte das Gewicht eingeben: ");
					weight = new Double(in.readLine());					
				}
				
				if (age  == null) {
					System.out.print("Bitte das Alter eingeben: ");
					age = new Integer(in.readLine());					
				}

				break;
			} catch (NumberFormatException e) { // Verletzung des Zahlenformats
				System.err.println("\nEingabefehler " + e.getMessage());
				System.err.println("Bitte Eingabe wiederholen...!");
			} catch (Exception e) { // andere Fehler
				System.err.println("Fehler! " + e);
			}
		}
	}
	
	/**
	 * Berechnungen ausführen und auf der Konsole ausgeben
	 */
	private void calculate() {
		// Konsolenausgabe der eingelesenen Zahl
		BMICalculator bmiRechner=new BMICalculator(size,weight,age);
		System.out.println("BMI: " + bmiRechner.calculate() +" - "+ bmiRechner.interpret());

		if (bmiRechner.isOptimalBMI()) {
			System.out.println("optimaler BMI");
		} else {
			System.out.println("es besteht Verbesserungspotential :-)");
		} 
	}

	/**
	 * main Methode zur Ausführung der Java Applikation
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BMICalculatorCLI rechnerCLI = new BMICalculatorCLI();
		rechnerCLI.readInput();
		rechnerCLI.calculate();
	}
}
