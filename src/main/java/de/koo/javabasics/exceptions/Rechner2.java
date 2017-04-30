package de.koo.javabasics.exceptions;

public class Rechner2 {
	/**
	 * Methode, die ihre Ausnahmen (Exceptions) an die aufrufende
	 * Methode weitergibt
	 * Kennzeichnung der Ausnahme erfolgt über throws
	 * 
	 * @return
	 * @throws Exception
	 */
	public int summeBerechnen() {
		int summe=0;
		int[] zahlen = new int[2];
		
		// Werte
		for (int i = 0; i < 3; i++) {
			try {
				zahlen[i]=i+1;
				// ...
			} catch (NullPointerException e) {
				System.out.println("eine Methode auf einem Null Objekt verwendet.");
			} 
			catch (Exception e) {
				System.out.printf("Klassenname: %s\nFehlernachricht: %s\n%s\n"
						,e.getClass().getName()
						,e.getMessage()
						,e.toString());
				
				// aufgetretenen Fehler weitergeben
				// throw e;
				// RuntimeExceptions sind unkontrollierte Fehlermeldungen, die nicht in 
				// der Methodensignatur bekannt gegeben werden müssen
				// keine gute Idee
				throw new RuntimeException("Fehler: Berechnung der Summe war nicht erfolgreich.");
			} finally {
				// übliche Verwendung von finally zum Schließen offener Verbindungen 
				// (z.B. zu Datenbanken oder Dateien)
				System.out.println("Purzel Ordnung");
			}
		}			
		
		// Summe berechnen
		for (int i = 0; i < zahlen.length; i++) {
			summe+=zahlen[i];
		}
		
		return summe;
	}
}
