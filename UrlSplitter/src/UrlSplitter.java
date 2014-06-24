
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

}
