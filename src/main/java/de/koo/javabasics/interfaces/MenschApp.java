package de.koo.javabasics.interfaces;

public class MenschApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Optimist mann=new Mann();
		Pessimist mann2=new Mann();
		Optimist frau=new Frau();
		
		// nicht möglich, da Frau nur das Interface Optimist implementiert
		//Pessimist frau2=new Frau();
		
		mann.positivDenken();
		mann2.negativDenken();
		frau.positivDenken();
		
		Mann mann3=(Mann)mann;
		mann3.positivDenken();
		mann3.negativDenken();
		mann3.telefonieren();
	}
}
