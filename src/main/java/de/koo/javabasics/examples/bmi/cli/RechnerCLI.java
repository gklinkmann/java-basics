package de.koo.javabasics.examples.bmi.cli;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import de.koo.javabasics.examples.bmi.BMIRechner;

public class RechnerCLI {
	private Double groesse;
	private Double gewicht;
	private Integer alter;
	

	/**
	 * Default Konstruktor (kann auch entfallen)
	 */
	public RechnerCLI() {
	}

	/**
	 * Tastatureingaben entgegennehmen
	 */
	private void eingeben() {

		// Tastatureingabestrom
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			try {
				// Tastatureingabe von zwei ganzen Zahlen
				if (groesse  == null) {
					System.out.print("Bitte die Groesse eingeben: ");
					groesse = new Double(in.readLine());
				} 
				
				if (gewicht  == null) {
					System.out.print("Bitte das Gewicht eingeben: ");
					gewicht = new Double(in.readLine());					
				}
				
				if (alter  == null) {
					System.out.print("Bitte das Alter eingeben: ");
					alter = new Integer(in.readLine());					
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
	private void berechnen() {
		// Konsolenausgabe der eingelesenen Zahl
		BMIRechner bmiRechner=new BMIRechner(groesse,gewicht,alter);
		System.out.println("BMI: " + bmiRechner.berechnen() +" - "+ bmiRechner.interpretieren());

		if (bmiRechner.isOptimalterBMMI()) {
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
		RechnerCLI rechnerCLI = new RechnerCLI();
		rechnerCLI.eingeben();
		rechnerCLI.berechnen();
	}
}
