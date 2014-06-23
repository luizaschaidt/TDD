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
			"01234","56789"
		};
		assertEquals(resultado, wrapper.wrap("0123456789", 6));
	}

}
