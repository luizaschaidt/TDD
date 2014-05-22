package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.Game;
import src.NoSuchStrategyError;

public class testGame {
	
	@Before
	public void setUp() throws Exception {
		String [] p1 = {"Dave","P"};
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
	
	@Test
	public void testGameRoundSameStrategy(){
		String [] p1 = {"Dave","S"};
		String [] p2 = {"Armando","S"};		
		Game game = new Game(p1, p2);
				
		assertEquals("Dave",game.result());
	}
	
	
	@Test (expected = NoSuchStrategyError.class)  
	public void testGameInputs() {
		String [] p1 = {"Dave","s"};
		String [] p2 = {"Armando","1"};		
		Game game = new Game(p1, p2);
		
		}
	
	@Test
	public void testTournament_winner(){
		String [] p1 = {"Dave","S"};
		String [] p2 = {"Armando","P"};		
		Game game1 = new Game(p1, p2);
		
		String [] p3 = {"Cesar","R"};
		String [] p4 = {"Kevin","S"};		
		Game game2 = new Game(p3, p4);
		
		Game [] games = {game1, game2};
		
		Game tournament = new Game(games);
		
		assertEquals("Cesar",tournament.tournament_winner(games));
	}
	

}
