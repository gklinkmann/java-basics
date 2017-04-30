package de.koo.javabasics.basics.datatypes.strings;

public class StringApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Erzeugen von Strings
		String zeichenkette="";
		
		// Wertzuweisung
		zeichenkette="wert 1";
		
		// Strings sind unveränderlich und müssen über den Operator +
		// verkettet werden
		zeichenkette=zeichenkette+": wert 2";
		zeichenkette+=": wert 3";
		
		// Vergleich von Zeichenketten immer über die Methode equals - geerbt von der Klasse Object
		String a="eins";
		String b="eins";
		
		/* falsch falsch falsch falsch falsch falsch falsch falsch 
		if (a==b) {
			System.out.println("die Zeichenketten sind gleich");
		}
		*/
		if (a.equals(b)) {
			System.out.println("die Zeichenketten sind gleich");
		}
		
		if (a.equalsIgnoreCase("Eins")) {
			System.out.println("die Zeichenketten sind gleich unabhängig von der Groß-/Kleinschreibung");
		}
		
		if (a.contains("ein")) {
			System.out.println("Zeichenkette entält den Teilstring");
		}
		
		System.out.println("=========================================");
		String c="eins";
		if (c==args[0]) {
			System.out.printf("die Zeichenketten %s und %s sind gleich\n",c,args[0]);
		} else {
			System.out.printf("die Zeichenketten %s und %s sind ungleich\n",c,args[0]);
		}
		System.out.println("=========================================");
		if (c.equals(args[0])) {
			System.out.printf("die Zeichenketten %s und %s sind gleich\n",c,args[0]);
		} else {
			System.out.printf("die Zeichenketten %s und %s sind ungleich\n",c,args[0]);
		}
		System.out.println("=========================================");

		String s="juhu";
		System.out.println(s.indexOf("hu"));
		
		// Strings sind unveränderlich auch wenn man ersetzen kann
		String neuerString=s.replace("u", "aa");
		
		String s1="juhu";
		System.out.println(s1.substring(2));
		
		String s2="   juhu    ";
		System.out.println(s2.trim());
		
		System.out.println(1);
		// String s3=1; nicht möglich
		String s3="1";
		s3=String.valueOf(1);
	}
}
