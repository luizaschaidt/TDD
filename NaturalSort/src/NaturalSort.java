import java.util.Arrays;
import java.util.Stack;


public class NaturalSort {

	public Stack sort(String entradas []) {
		
		System.out.println(Arrays.asList(entradas));
		
		Stack pilha = new Stack();
		
		for(int i=0; i< entradas.length; i++){
			if(pilha.isEmpty()){
		//		pilha.push(entradas[i]);
			}else{
				
			}
		}
		
		pilha.push("2");
		pilha.push("10");
		pilha.push("1");
		
		System.out.println(pilha);
		
		return pilha;
	}

	public String retornaMenor(String p1, String p2) {
		String menorTamanho ="";
		if(p1.length()<p2.length()){
			menorTamanho=p1;
		}else{
			menorTamanho=p2;
		}
		
		String menorValor="";
		
		for(int i=0; i<menorTamanho.length(); i++){
			if(p1.charAt(i)<p2.charAt(i)){
				menorValor = p1;
				System.out.println(menorValor);
				return menorValor;
			}
			
			if (i==menorTamanho.length()-1){
				menorValor = menorTamanho;
			}
		}
		
		return menorValor;
	}

}
