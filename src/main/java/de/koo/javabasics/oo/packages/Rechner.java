package de.koo.javabasics.oo.packages;
import static java.lang.Math.PI;

import de.koo.javabasics.oo.inheritance.Mann;

public class Rechner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mann mann=new Mann();
		Math.pow(0.1, 0.2);
	}

	public double berechneUmfang(double radius) {
		return 2*PI*radius;
	}
}
