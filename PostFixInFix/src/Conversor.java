import java.util.HashMap;
import java.util.Stack;


public class Conversor {
	
	String operadoresValidos = "+-*/()";
	String numerosValidos = "0123456789";
	HashMap<String, Integer> precedencia = new 	HashMap<String, Integer>();
	
	public boolean validaString(String expressao) throws Exception{
		
		if(expressao!=null){
			expressao = expressao.replaceAll(" ", "");
			int quantidadeCaracteres=0;
			
			for (int i= 0; i < expressao.length(); i++){
				
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
				throw new Exception("Expressao inválida!");
			}
		}else{
			throw new Exception("Expressao inválida!");
		}
	
	}

	public String converteParaPosfixada(String expressao) throws Exception {
		precedencia.put("+",1);
		precedencia.put("-",1);
		precedencia.put("*",2);
		precedencia.put("/",2);
		expressao = expressao.replaceAll(" ", "");
		String posfixada = "";
		Stack pilha = new Stack();
		if (validaString(expressao)){
			for (int i= 0; i < expressao.length(); i++){
				for(int c=0; c<numerosValidos.length(); c++){
					if(expressao.charAt(i) == numerosValidos.charAt(c)){
						posfixada = posfixada + expressao.charAt(i);
					}
				}
				for(int c=0; c<operadoresValidos.length(); c++){
					if(expressao.charAt(i) == operadoresValidos.charAt(c)){
						if(!pilha.isEmpty()){
							int precedenciaUltimo = verificaPrecedencia((char)pilha.lastElement());
							int precedenciaAtual = verificaPrecedencia(expressao.charAt(i));
							System.out.println("Atual:"+expressao.charAt(i)+" precedencia:"+precedenciaAtual+"    -  Ultimo:"+pilha.lastElement().toString()+ " precedencia:"+precedenciaUltimo);
							if(precedenciaUltimo > precedenciaAtual){
								System.out.println(posfixada);
								while(!pilha.isEmpty()){
									posfixada = posfixada + pilha.lastElement().toString();
									pilha.pop();									
								}
								pilha.push(expressao.charAt(i));
								
							}else{
								if(precedenciaUltimo == precedenciaAtual){
									posfixada = posfixada + pilha.lastElement().toString();
									pilha.pop();
								}
								
								pilha.push(expressao.charAt(i));
							}
						}else{
							pilha.push(expressao.charAt(i));
						}
					}

				}
			}
			while(!pilha.isEmpty()){
				posfixada = posfixada + pilha.lastElement().toString();
				pilha.pop();									
			}
			System.out.println(posfixada);
			return posfixada;
		}else{
			return "Expressao inválida!";
		}
		
	}

	private int verificaPrecedencia(char c) {
		switch (c) {
		case '+':
			return 1;
		case '-':
			return 1;	
		case '*':
			return 2;
		case '/':
			return 2;
		default:
			return 0;
		}
	}


}
