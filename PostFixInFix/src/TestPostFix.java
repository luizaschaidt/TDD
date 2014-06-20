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

	@Test
	public void testValidaString() {
		assertTrue(conv.validaString("1+2"));
		assertFalse(conv.validaString("a+b"));
		assertTrue(conv.validaString(""));
		//assertTrue(conv.validaString(null));
	}

}
