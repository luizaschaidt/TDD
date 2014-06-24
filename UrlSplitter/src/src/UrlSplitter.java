package src;
public class UrlSplitter {

	public boolean verificaUrl(String url) {
		if(url.isEmpty() || url.contains(" ")){
			return false;
		}else if(url.contains("://")){
			
			if(url.length() <= url.indexOf("://")+3){
				return false;
			}
			return true;
		}
		
		return true;
	}

	public String extraiProtocolo(String url) {
		if (verificaUrl(url)){
			String protocolo = "";
			protocolo = url.substring(0, url.indexOf("://"));
			
			return protocolo;
		}
		return "Url inválida";
		
	}

	public String extraiDominio(String url) {
		if (verificaUrl(url)){
			String dominio = "";
			dominio = url.substring(url.indexOf("://")+3, url.length() );
			if(dominio.contains("/")){
				return dominio = dominio.substring(0, dominio.indexOf("/"));
		
			}else{
			return dominio;
			}
		}
		return "Url inválida";
	}

	public String extraiCaminho(String url) {
		if (verificaUrl(url)){
			String caminho = "";
			caminho = url.substring(url.indexOf("://")+3, url.length() );
			if(caminho.contains("/")){
				caminho = caminho.substring(caminho.indexOf("/")+1, caminho.length());			
				return caminho;
			}
			return "";
		}
		return "Url inválida";
	}

}
