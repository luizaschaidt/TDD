import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;


public class TestPostFix {

	Conversor conv = new Conversor();
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test (expected = Exception.class)
	public void testValidaString() throws Exception{
		assertTrue(conv.validaString("1 +  2"));
		assertFalse(conv.validaString("a+b"));
		assertTrue(conv.validaString(""));
		assertFalse(conv.validaString(null));
	}

	@Test
	public void testConversaoParaPosfixada() throws Exception{
		//assertEquals("12+",conv.converteParaPosfixada("1 + 2"));
		assertEquals("824*+1-",conv.converteParaPosfixada("8+2*4-1"));
		assertEquals("345*6/+",conv.converteParaPosfixada("3+4*5/6"));
	}
	
	@Test
	public void testConversaoParaInternamenteFixada(){
		assertEquals("8+2*4-1",conv.converteParaInternamenteFixada("824*+1-"));
		assertEquals("3+4*5/6",conv.converteParaInternamenteFixada("345*6/+"));
	}
	

	@Test
	public void testCalculaParaInternamenteFixada(){
		assertEquals(15,conv.calculaParaInternamenteFixada("824*+1-"),0.5);
		assertEquals(6.33,conv.calculaParaInternamenteFixada("345*6/+"),0.5);
		
	}
}
