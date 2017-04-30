package de.koo.javabasics.others;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateApp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date datum=new Date();
		
		System.out.println(datum);
		
		SimpleDateFormat datumsFormat=new SimpleDateFormat("dd.MM.yyyy");
		System.out.println(datumsFormat.format(datum));
	}

}
