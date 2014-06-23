import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.sun.java_cup.internal.runtime.Scanner;
import com.sun.java_cup.internal.runtime.Symbol;


public class TicTacToe {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
	String tabuleiro[][] =  
	    {  
	        {"","",""},  
	        {"","",""},
	        {"","",""}
	    }; 
	 String tipoJogo = "";
	 
	 int possibilidadeVitoria[][][] = new int[][][]
	   {  
	       {{1,1},{1,2},{1,3}},  
	       {{2,1},{2,2},{2,3}},
	       {{3,1},{3,2},{3,3}},
	       {{1,1},{2,1},{3,1}},
	       {{1,2},{2,2},{3,2}},
	       {{1,3},{2,3},{3,3}},
	       {{1,1},{2,2},{3,3}},
	       {{1,3},{2,2},{3,1}},
	       
	   }; 
	/*
	public boolean validaEntrada(String jogada) throws Exception {
		jogada = jogada.toUpperCase();
		if (jogada.equals("X") || jogada.equals("O"))
			return true;
		else
			throw new Exception ("Jogada inválida!");
	}*/

	public boolean validaEntrada(int linha, int coluna) {
		if(linha >= 1 && linha<=3 && coluna >=1 && coluna <=3){
			return true;
		}else{
			return false;
		}
	}

	public boolean validaDisponibilidade(int linha, int coluna) {
		if(tabuleiro[linha-1][coluna-1] != ""){
			return false;
		}
			return true;
	}
	
	public String preencheTabuleiro(String jogador, int linha, int coluna) {
	
		if(validaEntrada(linha,coluna)){
			if(validaDisponibilidade(linha,coluna)){
				tabuleiro[linha-1][coluna-1] = jogador;
				
				resultadoJogo();
				
				return "Jogada efetuada com sucesso!";
			}			
		}
		return "Jogada não efetuada!";

	}

	public String resultadoJogo() {
		String jogada[] = new String[3];
		int contador =0;
		for(int l=0; l<8; l++){
			for(int c=0; c<3; c++){
				
				int linha = possibilidadeVitoria[l][c][0];
				int coluna = possibilidadeVitoria[l][c][1];
				jogada[c] = tabuleiro[linha-1][coluna-1];				
			}
			if(jogada[0] != "" && jogada[0] == jogada[1] && jogada[1] == jogada[2]){
				return ("O vencedor e: " + jogada[0]);
			}
		}
		for(int l=0; l<3; l++){
			for(int c=0; c<3; c++){
				if(tabuleiro[l][c] != "")
					contador++;
			}		
		}
		if(contador == 9)
			return "Empate";
		else
			return "";
	}

	public Object jogo(String tipo) throws IOException {
		if(tipo == "Computador"){
			tipoJogo = "Computador";
			System.out.println("Jogador X, digite uma linha e coluna: ");
			String entrada = in.readLine();
		}
		else{
			tipoJogo = "Manual";
		}
		
		return null;
	}

	
}
