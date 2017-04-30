package de.koo.javabasics.basics.syntax;

public class Operatoren {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Operatoren für Grundrechen arten
		
		int summe=1+2;
		int differenz=2-1;
		int produkt=1*2;
		int quotient=2/1;
		int modulo=6%2;
		
		// verkürzte Schreibweisen
		int ksumme=1+2;
		ksumme=ksumme+1;
		ksumme++; // Increment
		++ksumme; // Increment
		
		ksumme=ksumme+2;
		ksumme+=2;
		
		int kdifferenz=2-1;
		kdifferenz--; // Decrement
		--kdifferenz;
		kdifferenz-=2;
		
		int kprodukt=1*2;
		kprodukt*=2;
		
		int kquotient=2/1;
		kquotient/=2;
		
		int kmodulo=6%2;
		kmodulo%=2;

		// Vergleichsoperatoren
		boolean wahr=2==2;
		wahr=3!=2;
		wahr=3>2;
		wahr=2<3;
		wahr=3>=2;
		wahr=2<=3;
		
		// logische Operatoren
		wahr=true && true; // && = and
		wahr=2==2 && 3==3; // true && true
			
		wahr=true || false; // || = or
		wahr=!false; // negation von false=true
		
		boolean nichtWahr=!(2==2); // negation von true=false
		
		// XOR
		wahr=true || false || true; // || = or mindestens ein Ausdruck true
		wahr=true ^ false ^ false; // ^ = xor genau ein Ausdruck true
		nichtWahr=true ^ false ^ true; // ^ = xor genau ein Ausdruck true
	}

}
