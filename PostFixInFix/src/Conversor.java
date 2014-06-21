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
							int precedenciaUltimo = verificaPrecedencia(pilha.lastElement().toString().charAt(0));
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

	public String converteParaInternamenteFixada(String expressao) {
		
		String fixada = "";
		Stack pilha = new Stack();
		
		for (int i= 0; i < expressao.length(); i++){
			for(int c=0; c<numerosValidos.length(); c++){
				if(expressao.charAt(i) == numerosValidos.charAt(c)){
					pilha.push(expressao.charAt(i));
				}
			}
			for(int c=0; c<operadoresValidos.length(); c++){
				if(expressao.charAt(i) == operadoresValidos.charAt(c)){
				
					fixada = pilha.get(pilha.size()-2).toString()+expressao.charAt(i)+pilha.lastElement();
					pilha.pop();
					pilha.pop();
					pilha.push(fixada);
					System.out.println("fixada="+ fixada);
				}
			}
			}
		String resultado1 = "";
		resultado1 = pilha.toString();
		resultado1 = resultado1.replaceAll("\\[", "").replaceAll("\\]", "");
		return resultado1;
	}
	
	public float calculaParaInternamenteFixada(String expressao) {
		
		String fixada = "";
		Stack pilha = new Stack();
		float resultado = 0;
		
		for (int i= 0; i < expressao.length(); i++){
			for(int c=0; c<numerosValidos.length(); c++){
				if(expressao.charAt(i) == numerosValidos.charAt(c)){
					pilha.push(expressao.charAt(i));
				}
			}
			for(int c=0; c<operadoresValidos.length(); c++){
				if(expressao.charAt(i) == operadoresValidos.charAt(c)){
					switch (expressao.charAt(i)) {
					case '+':
						resultado = Float.parseFloat(pilha.get(pilha.size()-2).toString()) + Float.parseFloat(pilha.lastElement().toString());	
						break;
					case '-':
						resultado = Float.parseFloat(pilha.get(pilha.size()-2).toString()) - Float.parseFloat(pilha.lastElement().toString());	
						break;
					case '*':
						resultado = Float.parseFloat(pilha.get(pilha.size()-2).toString()) * Float.parseFloat(pilha.lastElement().toString());	
						break;
					case '/':
						resultado = Float.parseFloat(pilha.get(pilha.size()-2).toString()) / Float.parseFloat(pilha.lastElement().toString());	
						break;
					default:
						break;
					}
					
					pilha.pop();
					pilha.pop();
					pilha.push(resultado);
				}
			}
			}

		return resultado;
	}

}

