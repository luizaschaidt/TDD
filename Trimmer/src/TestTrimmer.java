import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;


public class TestTrimmer {
	Trimmer trimmer = new Trimmer();
	@Test
	public void testTrimmer() {
		assertEquals("",trimmer.trimEndOfLine(" "));
		assertEquals("abc",trimmer.trimEndOfLine("abc "));
		assertEquals("abc",trimmer.trimEndOfLine("abc   "));
		assertEquals("  abc",trimmer.trimEndOfLine("  abc   "));
		assertEquals("abc/n123",trimmer.trimEndOfLine("abc /n123 "));
		assertEquals("abc/n123",trimmer.trimEndOfLine("abc /n123"));
		assertEquals("abc/n123/n def",trimmer.trimEndOfLine("abc /n123   /n def "));
	}

}
