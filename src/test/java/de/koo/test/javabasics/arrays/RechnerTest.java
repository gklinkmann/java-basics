package de.koo.test.javabasics.arrays;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import de.koo.javabasics.arrays.Rechner;

public class RechnerTest {
	Rechner rechner;
	
	@Before
	public void setUp(){
		rechner=new Rechner();
	}
	
	@Test
	public void durchschnittBerechnen() {
		assertTrue(rechner.durchschnittBerechnen(1,2,3)==2);
	}

}
