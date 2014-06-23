
public class TicTacToe {
	
	 String tabuleiro[][] =  
	    {  
	        {"X", "", "" },  
	        {"", "", "O"},
	        {"","",""}
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

	
}
