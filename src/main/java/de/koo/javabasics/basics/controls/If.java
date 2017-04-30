package de.koo.javabasics.basics.controls;

public class If {

	/**
	 * Beispiel für if
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Überprüfung eines Wertes (true=Literal)
		if (true) {
			System.out.println("1. Bedingung ist wahr");
		}

		// Überprüfung eines Ausdrucks
		if (2==2) {
			System.out.println("2. Bedingung ist wahr");
		}

		int a=2;
		int b=3;
		// Überprüfung auf ungleich
		if (a!=b) {
			System.out.println("3. Bedingung ist wahr");
		}
		
		// Überprüfung auf ungleich mit Negation
		if (!(a==b)) {
			System.out.println("4. Bedingung ist wahr");
		}

		boolean wahr;
		
		// logische Operatoren
		wahr=true && true; // && = and
		if (wahr) {
			System.out.println("5. Bedingung ist wahr");
		}
		wahr=2==2 && 3==3; // true && true
		if (wahr) {
			System.out.println("6. Bedingung ist wahr");
		}
			
		wahr=true || false; // || = or
		if (wahr) {
			System.out.println("7. Bedingung ist wahr");
		}
		wahr=!false; // negation von false=true
		if (wahr) {
			System.out.println("8. Bedingung ist wahr");
		}
		
		boolean nichtWahr=!(2==2); // negation von true=false
		if (!nichtWahr) {
			System.out.println("9. Bedingung ist wahr");
		}
		
		// XOR
		wahr=true || false || true; // || = or mindestens ein Ausdruck true
		if (wahr) {
			System.out.println("10. Bedingung ist wahr");
		}

		wahr=true ^ false ^ false; // ^ = xor genau ein Ausdruck true
		if (wahr) {
			System.out.println("11. Bedingung ist wahr");
		}
		nichtWahr=true ^ false ^ true; // ^ = xor genau ein Ausdruck true
		if (!nichtWahr) {
			System.out.println("12. Bedingung ist wahr");
		}
	}

}
