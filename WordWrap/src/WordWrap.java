
public class WordWrap {

	public String[] wrap(String string, int coluna) {
		int tamanho = string.length();
		int qtdStrings = 0;
		if(tamanho%coluna != 0){
			qtdStrings = (int)Math.ceil(tamanho/coluna)+1;
		}else
			qtdStrings = tamanho/coluna;
		
		System.out.println(qtdStrings);
		
		String [] resultado = new String [qtdStrings];
		
		if(tamanho <= coluna){
			resultado [0]= string;
			return resultado;
		}
		
		for(int i=0; i<tamanho ; i++ ){
			
		}

		return resultado;
	}

}
