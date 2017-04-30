package de.koo.javabasics.arrays;

public class Hallo {

	/**
	 * Parsen der Kommandozeilen Argumente
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Hallo hallo = new Hallo();
		
		for (int i=0; i<args.length ; i++) {
			String argument=args[i];
			if (argument.equals("-name")) {
				hallo.sprechen("Hallo "+args[i+1]);
			}
		}
	}
	
	private void sprechen(String irgendwas) {
		System.out.println(irgendwas);
	}

}
