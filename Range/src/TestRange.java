import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;


public class TestRange {
	
	Range range;

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		range = new Range();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/*@Test (expected = IntervallNullException.class)
	public void shouldNotBeNull() throws IntervallNullException {
		range.verifyInterval(null);
	}*/

	@Test
	public void testIfIsAValidInterval() throws IntervallNullException {
		assertTrue(range.verifyInterval("(0,2)"));
		assertTrue(range.verifyInterval("[0,0)"));
		assertTrue(range.verifyInterval("  (9,5]"));
		assertTrue(range.verifyInterval("[9,5]"));
		assertFalse(range.verifyInterval("[0 0]"));
		assertFalse(range.verifyInterval("0,0]"));
		assertFalse(range.verifyInterval("(0,0"));
		assertFalse(range.verifyInterval("   0,0]"));
		assertFalse(range.verifyInterval(" ( 0,0   "));
	}
	
	@Test
	public void testIfIsInInterval() throws IntervallNullException{
		assertTrue(range.isInInterval("(0,25)","1"));
		assertTrue(range.isInInterval("(0,25)","24"));
		assertFalse(range.isInInterval("(0,25)","0"));
		assertFalse(range.isInInterval("(0,25)","25"));
		assertTrue(range.isInInterval("(0,25)","10"));
		assertFalse(range.isInInterval("(0,25)","100"));
		
		assertTrue(range.isInInterval("(10,29]","11"));
		assertTrue(range.isInInterval("(10,29]","29"));
		assertFalse(range.isInInterval("(10,29]","10"));
		assertFalse(range.isInInterval("(10,29]","30"));
		assertTrue(range.isInInterval("(10,29]","15"));
		assertFalse(range.isInInterval("(10,29]","5"));
		
		assertTrue(range.isInInterval("[25,50]","25"));
		assertTrue(range.isInInterval("[25,50]","50"));
		assertFalse(range.isInInterval("[25,50]","24"));
		assertFalse(range.isInInterval("[25,50]","51"));
		assertTrue(range.isInInterval("[25,50]","32"));
		assertFalse(range.isInInterval("[25,50]","76"));
		
		assertTrue(range.isInInterval("[90,150)","90"));
		assertTrue(range.isInInterval("[90,150)","149"));
		assertFalse(range.isInInterval("[90,150)","89"));
		assertFalse(range.isInInterval("[90,150)","150"));
		assertTrue(range.isInInterval("[90,150)","110"));
		assertFalse(range.isInInterval("[90,150)","65"));
		
	}

}
