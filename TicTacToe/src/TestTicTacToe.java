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
		String tabuleiroTeste[][] =  
		    {  
		        {"X","",""},  
		        {"","",""},
		        {"","",""}
		    };  
		jogo.tabuleiro = tabuleiroTeste; 
		
		assertFalse(jogo.validaDisponibilidade(1,1));
		assertTrue(jogo.validaDisponibilidade(1,2));
	}
	
	@Test 
	public void testaPreenchimentoDoTabuleiro(){
		assertEquals("Jogada efetuada com sucesso!",jogo.preencheTabuleiro("X",1,1));
		assertEquals("Jogada efetuada com sucesso!",jogo.preencheTabuleiro("O",1,2));
		assertEquals("Jogada efetuada com sucesso!",jogo.preencheTabuleiro("X",1,3));
		assertEquals("Jogada efetuada com sucesso!",jogo.preencheTabuleiro("O",2,1));
		assertEquals("Jogada efetuada com sucesso!",jogo.preencheTabuleiro("X",2,2));
		assertEquals("Jogada efetuada com sucesso!",jogo.preencheTabuleiro("O",2,3));
		assertEquals("Jogada efetuada com sucesso!",jogo.preencheTabuleiro("X",3,1));
		assertEquals("Jogada efetuada com sucesso!",jogo.preencheTabuleiro("O",3,2));
		assertEquals("Jogada efetuada com sucesso!",jogo.preencheTabuleiro("X",3,3));
		assertEquals("Jogada não efetuada!",jogo.preencheTabuleiro("X",3,3));
		assertEquals("Jogada não efetuada!",jogo.preencheTabuleiro("S",3,3));
		assertEquals("Jogada não efetuada!",jogo.preencheTabuleiro("O",4,3));
		
		
	}
	
	
	

}
