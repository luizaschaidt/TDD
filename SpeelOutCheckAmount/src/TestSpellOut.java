import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestSpellOut {
	SpellOut speller;

	@Before
	public void setUp() throws Exception {
		speller = new SpellOut();
	}

	@Test
	public void shouldNotBeEmpty() throws SpeelOutNullException {
		assertFalse(speller.verifyAmount(""));
		assertTrue(speller.verifyAmount("10"));
	}
	
	@Test (expected = SpeelOutNullException.class)
	public void shouldNotBeNull() throws SpeelOutNullException {
		speller.verifyAmount(null);
	}
	
	@Test
	public void shouldSpeelOutAunitAmount() throws SpeelOutNullException {
		assertEquals("three", speller.spellOutIntegerAmount("3"));
		assertEquals("zero", speller.spellOutIntegerAmount("0"));
		assertEquals("two", speller.spellOutIntegerAmount("2"));
		assertEquals("five", speller.spellOutIntegerAmount("5"));
		assertEquals("nine", speller.spellOutIntegerAmount("9"));
		assertEquals("", speller.spellOutIntegerAmount(""));
	}
	
	@Test
	public void shouldSpeelOutAdozenAmount() throws SpeelOutNullException {
		assertEquals("thirty", speller.spellOutIntegerAmount("30"));
		assertEquals("thirty-one", speller.spellOutIntegerAmount("31"));
		assertEquals("", speller.spellOutIntegerAmount(""));
	}

}
