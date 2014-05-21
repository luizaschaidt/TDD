package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.Game;

public class testGame {

	@Before
	public void setUp() throws Exception {
		Game game = new Game("Dave", "S", "Armando", "P");
	}

	@After
	public void tearDown() throws Exception {
	}


	
	@Test
	public void testGameRound() {
		Game game = new Game("Dave", "S", "Armando", "P");
		assertEquals("Dave",game.result());
	}
	

}
