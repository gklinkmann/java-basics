package de.koo.javabasics.examples.calculator.awt;
import java.awt.Button;
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

import de.koo.javabasics.examples.calculator.Fraction;

/**
 * GUI für Berechnungen
 *
 * @version 1.0 vom 03.09.2013
 * @author
 */

public class FractionGUI extends Frame {
	private static final long serialVersionUID = 452441117031089864L;
	// Anfang Attribute
	private TextField txDividend, txDivisor, txFieldOutput;
	// Ende Attribute

	/**
	 * Konstruktor
	 * initialisieren der Oberfläche
	 * 
	 * @param title
	 */
	public FractionGUI(String title) {
		super(title);

		Label lbHeading = new Label();
		Label lbDividend = new Label();
		Label lbDivisor = new Label();
		Button btCalculation = new Button();
		Button btInverse = new Button();
		Button btDuplicate = new Button();
		Button btHalf = new Button();
		Label lbOutput = new Label();
		Button btEnd = new Button();

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
		lbHeading.setBounds(16, 16, 262, 36);
		lbHeading.setText("Bruchrechnung:");
		lbHeading.setFont(new Font("Dialog", Font.BOLD, 12));
		cp.add(lbHeading);
		
		// Label Zähler
		lbDividend.setBounds(16, 64, 110, 20);
		lbDividend.setText("Zähler: ");
		cp.add(lbDividend);
		
		// Textfeld Zähler
		txDividend = new TextField();
		txDividend.setBounds(168, 64, 110, 20);
		cp.add(txDividend);
		
		// Label Nenner
		lbDivisor.setBounds(16, 88, 110, 20);
		lbDivisor.setText("Nenner: ");
		cp.add(lbDivisor);
		
		// Textfeld Nenner
		txDivisor = new TextField();
		txDivisor.setBounds(168, 88, 110, 20);
		cp.add(txDivisor);
				
		// Button Berechnung
		btCalculation.setBounds(16, 132, 115, 25);
		btCalculation.setLabel("Dezimalwert");
		btCalculation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btCalculationActionPerformed(evt);
			}
		});
		cp.add(btCalculation);

		// Button Verdopplung
		btDuplicate.setBounds(132, 132, 115, 25);
		btDuplicate.setLabel("Verdoppeln");
		btDuplicate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btDuplicateActionPerformed(evt);
			}
		});
		cp.add(btDuplicate);

		// Button Halbierung
		btHalf.setBounds(132, 160, 115, 25);
		btHalf.setLabel("Halbieren");
		btHalf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btHalfActionPerformed(evt);
			}
		});
		cp.add(btHalf);

		// Button Kehrwert
		btInverse.setBounds(16, 160, 115, 25);
		btInverse.setLabel("Kehrwert");
		btInverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btInverseActionPerformed(evt);
			}
		});
		cp.add(btInverse);

		// Label Ausgabe
		lbOutput.setBounds(16, 208, 80, 20);
		lbOutput.setText("Ergebnis: ");
		cp.add(lbOutput);

		// Textfeld Ausgabe
		txFieldOutput = new TextField();
		txFieldOutput.setBounds(108, 208, 170, 20);
		txFieldOutput.setEditable(false);
		cp.add(txFieldOutput);
		
		// Button Ende
		btEnd.setBounds(112, 248, 75, 25);
		btEnd.setLabel("Ende");
		btEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btEndActionPerformed(evt);
			}
		});
		cp.add(btEnd);

		setVisible(true);
	}

	/**
	 * Auslesen der Eingaben
	 * @return
	 */
	public Fraction getInputs() {
		// Eingabe der Zahlen
		String inputDividend = txDividend.getText(); 
		String inputDivisor = txDivisor.getText(); 
		Integer dividend = new Integer(inputDividend);
		Integer divisor = new Integer(inputDivisor);

		// Erzeugen eines neuen Objekts der Klasse Rechenoperation
		return new Fraction(dividend, divisor);
	}
	
	/**
	 * ausführen der Berechnung nach Klick auf den Button
	 * 
	 * @param evt
	 */
	public void btCalculationActionPerformed(ActionEvent evt) {
		// Erzeugen eines neuen Objekts der Klasse Rechenoperation
		Fraction fraction = getInputs();
		Double result = Math.round(fraction.calculate()*100)/100.0;
		
		// Ausgabe des Ergebnisses
		txFieldOutput.setText(result.toString());
	}

	/**
	 * ausführen der Verdopplung nach Klick auf den Button
	 * 
	 * @param evt
	 */
	public void btDuplicateActionPerformed(ActionEvent evt) {
		// Erzeugen eines neuen Objekts der Klasse Rechenoperation
		Fraction fraction = getInputs();
		fraction.duplicate();
		
		// Ausgabe des Ergebnisses
		txFieldOutput.setText(fraction.toString());
	}

	/**
	 * ausführen der Verdopplung nach Klick auf den Button
	 * 
	 * @param evt
	 */
	public void btHalfActionPerformed(ActionEvent evt) {
		// Erzeugen eines neuen Objekts der Klasse Rechenoperation
		Fraction fraction = getInputs();
		fraction.half();
		
		// Ausgabe des Ergebnisses
		txFieldOutput.setText(fraction.toString());
	}
	
	/**
	 * ausführen des Kehrwertes nach Klick auf den Button
	 * 
	 * @param evt
	 */
	public void btInverseActionPerformed(ActionEvent evt) {
		// Erzeugen eines neuen Objekts der Klasse Rechenoperation
		Fraction fraction = getInputs();
		fraction.inverse();
		
		// Ausgabe des Ergebnisses
		txFieldOutput.setText(fraction.toString());
	}

	/**
	 * beendet das Programm nach Klick auf den Button Ende
	 * 
	 * @param evt
	 */
	public void btEndActionPerformed(ActionEvent evt) {
		System.exit(0);
	}

	/**
	 * main Methode zum Start der Java Applikation
	 * @param args
	 */
	public static void main(String[] args) {
		new FractionGUI("Bruchrechnung");
	}

}
