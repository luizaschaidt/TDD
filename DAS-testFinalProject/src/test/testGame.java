package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.Game;

public class testGame {

	@Before
	public void setUp() throws Exception {
		String [] p1 = {"Dave","S"};
		String [] p2 = {"Armando","P"};
		
		Game game = new Game(p1, p1);
	}

	@After
	public void tearDown() throws Exception {
	}


	
	@Test
	public void testGameRound() {
		String [] p1 = {"Dave","S"};
		String [] p2 = {"Armando","P"};		
		Game game = new Game(p1, p2);
		
		assertEquals("Armando",game.result());
	}
	

}
