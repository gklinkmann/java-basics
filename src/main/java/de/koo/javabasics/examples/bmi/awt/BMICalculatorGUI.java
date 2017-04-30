package de.koo.javabasics.examples.bmi.awt;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import de.koo.javabasics.examples.bmi.BMICalculator;

/**
 * GUI für Berechnungen
 *
 * @version 1.0 vom 03.09.2013
 * @author
 */

public class BMICalculatorGUI extends Frame {
	// Anfang Attribute
	private static final long serialVersionUID = 6773296787435533965L;
	private TextField txFieldAlter, txFieldGroesse, txFieldGewicht, txFieldAusgabe;
	private Checkbox chBoxOptimalerBMI;
	// Ende Attribute

	/**
	 * Konstruktor
	 * initialisieren der Oberfläche
	 * 
	 * @param title
	 */
	public BMICalculatorGUI(String title) {
		super(title);
	}
	
	//=======================================================
	// Anfang Methoden
	//=======================================================

	/**
	 * anzeigen der Oberfläche
	 */
	private void anzeigen() {
		Label lbUeberschrift = new Label();
		Label lbAlter = new Label();
		Label lbGroesse = new Label();
		Label lbGewicht = new Label();
		Button btBerechnung = new Button();
		Label lbAusgabe = new Label();
		Label lbOptimalerBMI = new Label();
		Button btEnde = new Button();

		// Frame-Initialisierung
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				dispose();
			}
		});
		int frameWidth = 302;
		int frameHeight = 308;
		setSize(frameWidth, frameHeight);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (d.width - getSize().width) / 2;
		int y = (d.height - getSize().height) / 2;
		setLocation(x, y);
		setResizable(false);
		
		// Panel
		Panel cp = new Panel(null);
		add(cp);

		// Überschrift
		lbUeberschrift.setBounds(16, 16, 262, 36);
		lbUeberschrift.setText("BMI Berechnung:");
		lbUeberschrift.setFont(new Font("Dialog", Font.BOLD, 12));
		cp.add(lbUeberschrift);
		
		// Label Alter
		lbAlter.setBounds(16, 64, 110, 20);
		lbAlter.setText("Alter: ");
		cp.add(lbAlter);
		
		// Textfeld Alter
		txFieldAlter = new TextField();
		txFieldAlter.setBounds(168, 64, 110, 20);
		cp.add(txFieldAlter);
		
		// Label Groesse
		lbGroesse.setBounds(16, 88, 110, 20);
		lbGroesse.setText("Größe: ");
		cp.add(lbGroesse);
		
		// Textfeld Groesse
		txFieldGroesse = new TextField();
		txFieldGroesse.setBounds(168, 88, 110, 20);
		cp.add(txFieldGroesse);
		
		// Label Gewicht
		lbGewicht.setBounds(16, 112, 110, 20);
		lbGewicht.setText("Gewicht: ");
		cp.add(lbGewicht);
		
		// Textfeld Gewicht
		txFieldGewicht = new TextField();
		txFieldGewicht.setBounds(168, 112, 110, 20);
		cp.add(txFieldGewicht);
		
		// Button Berechnung
		btBerechnung.setBounds(92, 152, 115, 25);
		btBerechnung.setLabel("Berechnung");
		btBerechnung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btBerechnungActionPerformed(evt);
			}
		});
		cp.add(btBerechnung);

		// Label Ausgabe
		lbAusgabe.setBounds(16, 208, 60, 20);
		lbAusgabe.setText("BMI: ");
		cp.add(lbAusgabe);

		// Textfeld Ausgabe
		txFieldAusgabe = new TextField();
		txFieldAusgabe.setBounds(68, 208, 210, 20);
		txFieldAusgabe.setEditable(false);
		cp.add(txFieldAusgabe);

		// Label optimaler BMI
		lbOptimalerBMI.setBounds(16, 232, 100, 20);
		lbOptimalerBMI.setText("optimaler BMI: ");
		cp.add(lbOptimalerBMI);

		// CheckBox optimaler BMI
		chBoxOptimalerBMI = new Checkbox();
		chBoxOptimalerBMI.setBounds(108, 232, 210, 20);
		chBoxOptimalerBMI.setFocusable(false);
		chBoxOptimalerBMI.setEnabled(false);
		cp.add(chBoxOptimalerBMI);
		
		// Button Ende
		btEnde.setBounds(112, 248, 75, 25);
		btEnde.setLabel("Ende");
		btEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btEndeActionPerformed(evt);
			}
		});
		cp.add(btEnde);

		setVisible(true);
	}

	/**
	 * ausführen der Berechnung nach Klick auf den Button
	 * 
	 * @param evt
	 */
	public void btBerechnungActionPerformed(ActionEvent evt) {
		// Eingabe der Zahlen
		String eingabeAlter = txFieldAlter.getText(); 
		String eingabeGroesse = txFieldGroesse.getText(); 
		String eingabeGewicht = txFieldGewicht.getText();
		Integer alter = new Integer(eingabeAlter);
		Double groesse = new Double(eingabeGroesse);
		Double gewicht = new Double(eingabeGewicht);

		// Erzeugen eines neuen Objekts der Klasse Rechenoperation
		BMICalculator bmiRechner = new BMICalculator();
		bmiRechner.setAlter(alter);
		bmiRechner.setGroesse(groesse);
		bmiRechner.setGewicht(gewicht);
		Double ergebnis = bmiRechner.berechnen();
		String interpretation=bmiRechner.interpretieren();
		
		// Ausgabe des Ergebnisses
		String ausgabe = ergebnis.toString(); 
		txFieldAusgabe.setText(ausgabe+" - "+interpretation);
		
		if (bmiRechner.isOptimalterBMMI()) {
			chBoxOptimalerBMI.setState(true);
		} else {
			chBoxOptimalerBMI.setState(false);
		} 
	}

	/**
	 * beendet das Programm nach Klick auf den Button Ende
	 * 
	 * @param evt
	 */
	public void btEndeActionPerformed(ActionEvent evt) {
		System.exit(0);
	}

	/**
	 * main Methode zum Start der Java Applikation
	 * @param args
	 */
	public static void main(String[] args) {
		BMICalculatorGUI rechnerGUI=new BMICalculatorGUI("BMI Rechner");
		rechnerGUI.anzeigen();
	}

}
