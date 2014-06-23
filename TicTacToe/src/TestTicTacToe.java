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
		assertEquals("Jogada efetuada com sucesso!",jogo.preencheTabuleiro("X",1,2));
		assertEquals("", jogo.resultadoJogo());
		assertEquals("Jogada efetuada com sucesso!",jogo.preencheTabuleiro("X",1,3));
		assertEquals("O vencedor e: X", jogo.resultadoJogo());
		assertEquals("Jogada efetuada com sucesso!",jogo.preencheTabuleiro("O",2,1));
		assertEquals("Jogada efetuada com sucesso!",jogo.preencheTabuleiro("X",2,2));
		assertEquals("Jogada efetuada com sucesso!",jogo.preencheTabuleiro("O",2,3));
		assertEquals("Jogada efetuada com sucesso!",jogo.preencheTabuleiro("X",3,1));
		assertEquals("Jogada efetuada com sucesso!",jogo.preencheTabuleiro("O",3,2));
		assertEquals("Jogada efetuada com sucesso!",jogo.preencheTabuleiro("O",3,3));
		assertEquals("Jogada não efetuada!",jogo.preencheTabuleiro("X",3,3));
		assertEquals("Jogada não efetuada!",jogo.preencheTabuleiro("S",3,3));
		assertEquals("Jogada não efetuada!",jogo.preencheTabuleiro("O",4,3));
	}
	
	@Test 
	public void testaResultadoJogo(){
		String tabuleiroTeste[][] =  
		    {  
		        {"X","X","X"},  
		        {"O","O",""},
		        {"","","X"}
		    };  
		jogo.tabuleiro = tabuleiroTeste; 		
		assertEquals("O vencedor e: X", jogo.resultadoJogo());
		
		String tabuleiroTeste1[][] =  
		    {  
		        {"O","X","X"},  
		        {"O","O",""},
		        {"O","","X"}
		    };  
		jogo.tabuleiro = tabuleiroTeste1; 		
		assertEquals("O vencedor e: O", jogo.resultadoJogo());
		
		String tabuleiroTeste2[][] =  
		    {  
		        {"O","O","X"},  
		        {"O","X",""},
		        {"X","","X"}
		    };  
		jogo.tabuleiro = tabuleiroTeste2; 		
		assertEquals("O vencedor e: X", jogo.resultadoJogo());
		
		String tabuleiroTeste3[][] =  
		    {  
		        {"O","X","O"},  
		        {"O","O","X"},
		        {"X","O","X"}
		    };  
		jogo.tabuleiro = tabuleiroTeste3;		
		assertEquals("Empate", jogo.resultadoJogo());		
	}
	
	@Test 
	public void testaTipoJogo(){
		String tabuleiroTeste4[][] =  
		    {  
		        {"","",""},  
		        {"","",""},
		        {"","",""}
		    };  
		jogo.tabuleiro = tabuleiroTeste4;		
		
		jogo.jogo("Computador");
		assertEquals("Computador", jogo.tipoJogo);
		jogo.jogo("Manual");
		assertEquals("Manual", jogo.tipoJogo);
	}

}
