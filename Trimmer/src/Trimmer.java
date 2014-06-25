
public class Trimmer {

	public String trimEndOfLine(String text) {
		String textTrimmed="";
		if(text.trim().length() == 0){
			return "";
		}else if(text.contains("/n")){
			textTrimmed = trimComplexText(text);
		}else{
			textTrimmed = trimSimpleText(text);
		}
		
		return textTrimmed;
	}

	private String trimComplexText(String complexText) {
		String textTrimmed="";
		int lastIndex = 0;
		int count = 0;
		
		
		while(lastIndex != -1){
		       lastIndex = complexText.indexOf("/n",lastIndex);
		       if( lastIndex != -1){
		            count ++;
		            lastIndex+=2;
		      }
		}
		String arraySubTexts[] = new String [count+1];
		if(count != 0){
		arraySubTexts = complexText.split("/n");
		}
		
		for (int i = 0; i <= count; i++) {
			if(i == 0){
				textTrimmed = textTrimmed + trimSimpleText(arraySubTexts[i]);	
			}else{
				textTrimmed = textTrimmed + "/n" +trimSimpleText(arraySubTexts[i]);
			}
		}
		
		return textTrimmed;
	}

	private String trimSimpleText(String simpleText) {
		String textTrimmed = "";
		for(int i=simpleText.length()-1; i>0 ; i--){
			if(simpleText.charAt(i) == ' '){
				textTrimmed = simpleText.substring(0, i);
			}else{
				 if(i == simpleText.length()-1)
					 return simpleText;
				 else{
					 return textTrimmed;
				 }
			}
		}
		return textTrimmed;
	}

}
