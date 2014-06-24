
public class Trimmer {

	public String trimEndOfLine(String text) {
		String textTrimmed="";
		if(text.trim().length() == 0){
			return "";
		}else if(text.contains("/n")){
				
		}else{
			for(int i=text.length()-1; i>0 ; i--){
				if(text.charAt(i) == ' '){
					textTrimmed = text.substring(0, i);
				}else{
					return textTrimmed;
				}
			}
		}
		
		return textTrimmed;
	}

}
