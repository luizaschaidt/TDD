import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;


public class TestNaturalSort {
	
	NaturalSort nat = new NaturalSort();

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testSort() {
		
		String entradas [] = {"2","1","10"};
		String resultado [] = {"1", "10", "2"};
		assertEquals(resultado, nat.sort(entradas));
		
		String entradas2 [] = {"10","1","101"};		
		String resultado2 [] = {"1", "10", "101"};		
		assertEquals(resultado2, nat.sort(entradas2));
		
		String entradas3 [] = {"Alpha 200","Alpha 2","Alpha 100","Alpha 2A","Alpha 2A900","Alpha 2A8000"};		
		String resultado3 [] = {"Alpha 100","Alpha 2","Alpha 200","Alpha 2A","Alpha 2A8000","Alpha 2A900"};		
		assertEquals(resultado3, nat.sort(entradas3));
	}
	
	@Test
	public void testRetornaMenorString() {
		assertEquals("10", nat.retornaMenor("2","10"));
		assertEquals("1", nat.retornaMenor("10","1"));
		assertEquals("102354", nat.retornaMenor("102354","1023540"));
		assertEquals("1023540", nat.retornaMenor("1023541","1023540"));
		assertEquals("32", nat.retornaMenor("32","32"));
		assertEquals("ab 32b", nat.retornaMenor("ab 32b1","ab 32b"));
	}

}
