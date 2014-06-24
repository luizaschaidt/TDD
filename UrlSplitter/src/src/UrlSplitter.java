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
		String protocolo = "";
		protocolo = url.substring(0, url.indexOf("://"));
		
		return protocolo;
	}

	public String extraiDominio(String url) {
		String dominio = "";
		dominio = url.substring(url.indexOf("://")+3, url.length() );
		if(dominio.contains("/")){
			System.out.println(dominio);
			return dominio = dominio.substring(0, url.indexOf("/"));
	
		}else{
		return dominio;
		}
	}

}
