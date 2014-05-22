package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.Game;
import src.GameInputException;

public class testGame {

	@Before
	public void setUp() throws Exception {
		String [] p1 = {"Dave","n"};
		String [] p2 = {"Armando","S"};
		
		Game game = new Game(p1, p2);
	}

	@After
	public void tearDown() throws Exception {
	}


	
	@Test
	public void testGameRound() {
		String [] p1 = {"Dave","S"};
		String [] p2 = {"Armando","P"};		
		Game game = new Game(p1, p2);
				
		assertEquals("Dave",game.result());
		
		p1[0]="Dave";
		p1[1]="S";
		p1[0]="Armando";
		p1[1]="R";
			
		assertEquals("Armando",game.result());
	}
	
	/*@Test (expected = GameInputException.class)  
	public void testGameInputs() {
		String [] p1 = {"Dave","c"};
		String [] p2 = {"Armando","p"};		
		Game game = new Game(p1, p2);
		}
	*/
	
	@Test
	public void testGameInputs() {
		try {
			String [] p1 = {"Dave","c"};
			String [] p2 = {"Armando","p"};		
			Game game = new Game(p1, p2);
			fail("GameInputException expected"); 
		} catch (Exception e) {
			System.out.println("t");
			assertEquals(GameInputException.class, e.getClass());
		}
	}

}
