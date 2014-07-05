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

	@Test
	public void testSort() {
		
		String entradas [] = {"2","1","10"};
		
		Stack pilha = new Stack();
		pilha.push("2");
		pilha.push("10");
		pilha.push("1");
		
		assertEquals(pilha, nat.sort(entradas));;
	}
	
	@Test
	public void testRetornaMenorString() {
		assertEquals("10", nat.retornaMenor("10","2"));
		assertEquals("1", nat.retornaMenor("10","1"));
		assertEquals("102354", nat.retornaMenor("102354","1023540"));
		assertEquals("1023540", nat.retornaMenor("1023541","1023540"));
		assertEquals("32", nat.retornaMenor("32","32"));
		assertEquals("ab 32b", nat.retornaMenor("ab 32b1","ab 32b"));
	}

}
