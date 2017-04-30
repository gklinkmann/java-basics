package de.koo.javabasics.arrays;

public class MultidimensionaleArrayApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Erzeugung
		int [][] zehnXzehn=new int [10][];
		
		for (int zeilenIndex = 0; zeilenIndex < zehnXzehn.length; zeilenIndex++) {
			zehnXzehn[zeilenIndex]=new int[10];
			for (int spaltenIndex = 0; spaltenIndex < zehnXzehn[zeilenIndex].length; spaltenIndex++) {
				// Zeilenwert = Zeilen Index + 1
				// Spaltenwert = Spalten Index + 1
				// Wert des Array Elements = Zeilenwert * Spaltenwert
				zehnXzehn[zeilenIndex][spaltenIndex]=(zeilenIndex+1)*(spaltenIndex+1);
			}
		}

	}

}
