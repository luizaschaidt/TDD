package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import src.Conversor;

public class test {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	Conversor conv ;
	String roman;
	int arabic;

	@Before
	public void setUp() throws Exception {
		conv = new Conversor();
		roman = "XXII";
		arabic = 22;
	}

	@Test
	public void testRomanToArabic() {
		assertEquals(10, conv.romanValue('X'));
		assertEquals(1000, conv.romanValue('M'));
		assertEquals(arabic,conv.romanToArabic(roman));
	}

}
