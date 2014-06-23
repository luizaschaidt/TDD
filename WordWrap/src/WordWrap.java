
public class WordWrap {

	public String[] wrap(String texto, int coluna) {
		int tamanho = texto.length();
		int qtdtextos = 0;
		
		if(tamanho%coluna != 0){
			qtdtextos = (int)Math.ceil(tamanho/coluna)+1;
		}else
			qtdtextos = tamanho/coluna;
		
		String [] resultado = new String [qtdtextos];
		
		for(int j=0; j<  qtdtextos ; j++ ){
			
			resultado[j] = "";
		}
		
		if(tamanho <= coluna){
			resultado [0]= texto;
			return resultado;
		}else{
			int contador = 0;
			int j;
			for(int i=0; i < qtdtextos ; i++ ){
				for(j = contador; j<coluna+contador ; j++ ){
					if(i == qtdtextos-1){
						if((tamanho%coluna != 0)&& j < (tamanho%coluna + contador)){
							resultado[i] = resultado[i] + texto.charAt(j);
						}
						if((tamanho%coluna == 0)){
							resultado[i] = resultado[i] + texto.charAt(j);
						}
					}else					
						resultado[i] = resultado[i] + texto.charAt(j);
				}
				contador = contador + coluna;
			}
			return resultado;
		}
		
	}

}
