package de.koo.javabasics.basics.controls;

public class Break {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i=1;
		while (i < 4) {
			System.out.println(i);
			if (i==2) {
				break;				
			}
			
			i++;
		}

	}

}
