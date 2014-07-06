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
		assertEquals("seventy-four", speller.spellOutIntegerAmount("74"));
		assertEquals("ninety-nine", speller.spellOutIntegerAmount("99"));
		assertEquals("five", speller.spellOutIntegerAmount("5"));
		assertEquals("eleven", speller.spellOutIntegerAmount("11"));
		assertEquals("fifteen", speller.spellOutIntegerAmount("15"));
		assertEquals("", speller.spellOutIntegerAmount(""));
	}
	
	@Test
	public void shouldSpeelOutAhundredAmount() throws SpeelOutNullException {
		assertEquals("one hundred", speller.spellOutIntegerAmount("100"));
		assertEquals("nine hundred", speller.spellOutIntegerAmount("900"));
		assertEquals("five hundred and four", speller.spellOutIntegerAmount("504"));
		assertEquals("one hundred and nine", speller.spellOutIntegerAmount("109"));
		assertEquals("three hundred twelve", speller.spellOutIntegerAmount("312"));
		assertEquals("five hundred twenty-seven", speller.spellOutIntegerAmount("527"));
	}
	
	@Test
	public void shouldSpeelOutAthousandAmount() throws SpeelOutNullException {
		assertEquals("one thousand", speller.spellOutIntegerAmount("1000"));
		assertEquals("one thousand one hundred", speller.spellOutIntegerAmount("1100"));
	}

}
