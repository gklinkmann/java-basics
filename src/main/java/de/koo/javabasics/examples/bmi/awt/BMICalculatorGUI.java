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
	private TextField txFieldAge, txFieldSize, txFieldWeight, txFieldOutput;
	private Checkbox chBoxOptimalBMI;
	// Ende Attribute

	/**
	 * Konstruktor
	 * initialisieren der Oberfläche
	 * 
	 * @param title
	 */
	public BMICalculatorGUI(String title) {
		super(title);
		Label lbHeading = new Label();
		Label lbAge = new Label();
		Label lbSize = new Label();
		Label lbWeight = new Label();
		Button btCalculation = new Button();
		Label lbOutput = new Label();
		Label lbOptimalBMI = new Label();
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
		lbHeading.setText("BMI Berechnung:");
		lbHeading.setFont(new Font("Dialog", Font.BOLD, 12));
		cp.add(lbHeading);
		
		// Label Alter
		lbAge.setBounds(16, 64, 110, 20);
		lbAge.setText("Alter: ");
		cp.add(lbAge);
		
		// Textfeld Alter
		txFieldAge = new TextField();
		txFieldAge.setBounds(168, 64, 110, 20);
		cp.add(txFieldAge);
		
		// Label Groesse
		lbSize.setBounds(16, 88, 110, 20);
		lbSize.setText("Größe: ");
		cp.add(lbSize);
		
		// Textfeld Groesse
		txFieldSize = new TextField();
		txFieldSize.setBounds(168, 88, 110, 20);
		cp.add(txFieldSize);
		
		// Label Gewicht
		lbWeight.setBounds(16, 112, 110, 20);
		lbWeight.setText("Gewicht: ");
		cp.add(lbWeight);
		
		// Textfeld Gewicht
		txFieldWeight = new TextField();
		txFieldWeight.setBounds(168, 112, 110, 20);
		cp.add(txFieldWeight);
		
		// Button Berechnung
		btCalculation.setBounds(92, 152, 115, 25);
		btCalculation.setLabel("Berechnung");
		btCalculation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btCalculationActionPerformed(evt);
			}
		});
		cp.add(btCalculation);

		// Label Ausgabe
		lbOutput.setBounds(16, 208, 60, 20);
		lbOutput.setText("BMI: ");
		cp.add(lbOutput);

		// Textfeld Ausgabe
		txFieldOutput = new TextField();
		txFieldOutput.setBounds(68, 208, 210, 20);
		txFieldOutput.setEditable(false);
		cp.add(txFieldOutput);

		// Label optimaler BMI
		lbOptimalBMI.setBounds(16, 232, 100, 20);
		lbOptimalBMI.setText("optimaler BMI: ");
		cp.add(lbOptimalBMI);

		// CheckBox optimaler BMI
		chBoxOptimalBMI = new Checkbox();
		chBoxOptimalBMI.setBounds(108, 232, 210, 20);
		chBoxOptimalBMI.setFocusable(false);
		chBoxOptimalBMI.setEnabled(false);
		cp.add(chBoxOptimalBMI);
		
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
	 * ausführen der Berechnung nach Klick auf den Button
	 * 
	 * @param evt
	 */
	public void btCalculationActionPerformed(ActionEvent evt) {
		// Eingabe der Zahlen
		String inputAge = txFieldAge.getText(); 
		String inputSize = txFieldSize.getText(); 
		String inputWeight = txFieldWeight.getText();
		Integer age = new Integer(inputAge);
		Double size = new Double(inputSize);
		Double weight = new Double(inputWeight);

		// Erzeugen eines neuen Objekts der Klasse Rechenoperation
		BMICalculator bmiCalculator = new BMICalculator();
		bmiCalculator.setAge(age);
		bmiCalculator.setSize(size);
		bmiCalculator.setWeight(weight);
		Double result = bmiCalculator.calculate();
		String interpretation=bmiCalculator.interpret();
		
		// Ausgabe des Ergebnisses
		String ausgabe = result.toString(); 
		txFieldOutput.setText(ausgabe+" - "+interpretation);
		
		if (bmiCalculator.isOptimalBMI()) {
			chBoxOptimalBMI.setState(true);
		} else {
			chBoxOptimalBMI.setState(false);
		} 
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
		new BMICalculatorGUI("BMI Rechner");
	}

}
