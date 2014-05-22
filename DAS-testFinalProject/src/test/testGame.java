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
				
		assertEquals("Dave",game.result(p1, p2)[0]);
		
		p1[0]="Dave";
		p1[1]="S";
		p1[0]="Armando";
		p1[1]="R";
			
		assertEquals("Armando",game.result(p1, p2)[0]);
	}
	
	@Test
	public void testGameRoundSameStrategy(){
		String [] p1 = {"Dave","S"};
		String [] p2 = {"Armando","S"};		
		Game game = new Game(p1, p2);
				
		assertEquals("Dave",game.result(p1, p2)[0]);
	}
	
	
	@Test (expected = NoSuchStrategyError.class)  
	public void testGameInputs() {
		String [] p1 = {"Dave","s"};
		String [] p2 = {"Armando","1"};		
		Game game = new Game(p1, p2);
		
		}
	
	@Test
	public void testTournament_winner(){
		String [] p1 = {"Armando","P"};
		String [] p2 = {"Dave","S"};		
		Game game1 = new Game(p1, p2);
		
		String [] p3 = {"Richard","R"};
		String [] p4 = {"Michael","S"};		
		Game game2 = new Game(p3, p4); 
		
		String [] p5 = {"Allen","S"};
		String [] p6 = {"Omer","P"};		
		Game game3 = new Game(p5, p6);
		
		String [] p7 = {"David E.","R"};
		String [] p8 = {"Richard X.","P"};		
		Game game4 = new Game(p7, p8);
		
		Game [] games = {game1, game2, game3, game4};
		
		Game tournament = new Game(games);
		
		assertEquals("Cesar",tournament.tournament_winner(games));
	}
	

}
