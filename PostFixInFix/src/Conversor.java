
public class Conversor {
	
	public boolean validaString(String expressao){
		String operadoresValidos = "+-*/()";
		String numerosValidos = "0123456789";
		
		expressao.replaceAll(" ", "");
		
		int quantidadeCaracteres=0;
		
		for (int i= 0; i < expressao.length(); i++){
			
			System.out.println("operadoresVLIDOS"+operadoresValidos.length());
			System.out.println("numerosVLIDOS"+numerosValidos.length());
			System.out.println("expressao"+expressao.length());
			
			for(int c=0; c<operadoresValidos.length(); c++){
				
				if(expressao.charAt(i) == operadoresValidos.charAt(c)){
					quantidadeCaracteres ++;
				}
			}
			for(int c=0; c<numerosValidos.length(); c++){
				if(expressao.charAt(i) == numerosValidos.charAt(c)){
					quantidadeCaracteres ++;
				}
			}
			
		}
		if(expressao.length()==quantidadeCaracteres){
			return true;
		}
		else{
			return false;
		}
	
	}


}
