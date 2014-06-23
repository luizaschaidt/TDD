import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestTicTacToe {
	TicTacToe jogo = new TicTacToe();
	
	@Before
	public void setUp() throws Exception {
	}

	/*@Test (expected = Exception.class)
	public void testaEntradaDoJogo() throws Exception {
		assertTrue(jogo.validaEntrada("X"));
		assertTrue(jogo.validaEntrada("O"));
		assertTrue(jogo.validaEntrada("x"));
		assertTrue(jogo.validaEntrada("o"));
		assertFalse(jogo.validaEntrada("1"));
		assertFalse(jogo.validaEntrada("letra x"));
	}*/
	
	@Test 
	public void testaPosicao(){
		assertTrue(jogo.validaEntrada(1, 2));
		assertTrue(jogo.validaEntrada(2, 2));
		assertTrue(jogo.validaEntrada(1, 3));
		assertFalse(jogo.validaEntrada(1, 0));
		assertFalse(jogo.validaEntrada(4, 2));
	}
	
	@Test 
	public void testaDisponibilidade(){
		assertFalse(jogo.validaDisponibilidade(1,1));
		assertTrue(jogo.validaDisponibilidade(1,2));
	}
	
	@Test 
	public void testaJogada(){
		
	}
	
	
	

}
