package de.koo.javabasics.oo.inheritance.exercises;

public class KfzApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Kfz kfz=new Kfz();
		Kfz kfz=new Auto(new Farbe("blau"));
		Auto auto=new Auto();
		
		if (kfz instanceof Auto) {
			auto=(Auto)kfz;			
		}

		System.out.println(auto);
		// oder auch System.out.println(auto.toString());
		
		Lkw lkw=new Lkw(new Farbe("grau"));
		System.out.println(lkw);
	}

}
