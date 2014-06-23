import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestaWordWrap {
	WordWrap wrapper;
	
	@Before
	public void setUp() throws Exception {
		wrapper = new WordWrap();
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testWordWrap() {
		String [] resultado = {
			"0123456789"
		};
		assertEquals(resultado, wrapper.wrap("0123456789", 15));
		
		String [] resultado2 = {
				"01234","56789"
			};
		assertEquals(resultado2, wrapper.wrap("0123456789", 5));
		
		String [] resultado3 = {
				"012345","6789"
			};
		assertEquals(resultado3, wrapper.wrap("0123456789", 6));
		
		String [] resultado4 = {
				"01234","abcde","fgh"
			};
		assertEquals(resultado4, wrapper.wrap("01234abcdefgh", 5));
		
		String [] resultado5 = {
				"0123","abcd","efh ","ijk"
			};
		assertEquals(resultado5, wrapper.wrap("0123abcdefh ijk", 4));
	}

}
