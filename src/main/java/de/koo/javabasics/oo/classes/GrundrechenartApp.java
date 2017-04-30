package de.koo.javabasics.oo.classes;

public class GrundrechenartApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Grundrechenart rechner=new Grundrechenart();
		int summe=rechner.summe(2, 3);

		System.out.println(summe);
		
		int produkt = Grundrechenart.produkt(2, 3);
		System.out.println(produkt);
		
		int radius=5;
		double umfang=2 * Grundrechenart.PI * radius;
	}

}
