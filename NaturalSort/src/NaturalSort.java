import java.util.Arrays;
import java.util.Stack;


public class NaturalSort {

	public String[] sort(String entradas []) {
		
		String aux = "";
		
		for(int i=0; i< entradas.length; i++){
			for(int j=0; j< entradas.length-1; j++){
				if(entradas[j+1] == retornaMenor(entradas[j], entradas[j+1])){
					String menor = (retornaMenor(entradas[j], entradas[j+1]));
					aux = entradas[j];
					entradas[j] = menor;
					entradas[j+1] =aux;
				}
			}
		}
		
		return entradas;
	}

	public String retornaMenor(String p1, String p2) {
		String menorTamanho ="";
		String menorValor="";
		
		if(p1.length()<p2.length()){
			menorTamanho=p1;
		}else{
			menorTamanho=p2;
		}
		
		for(int i=0; i<menorTamanho.length(); i++){
			if(p1.charAt(i)<p2.charAt(i)){
				menorValor = p1;
				return menorValor;
			}else if (p1.charAt(i)>p2.charAt(i)){
				menorValor = p2;
				return menorValor;
			}
			
			if (i==menorTamanho.length()-1){
				menorValor = menorTamanho;
			}
		}
		
		return menorValor;
	}

}
