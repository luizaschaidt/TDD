import java.util.HashMap;


public class TemplateEngine {

	public boolean verifyText(String text) {
		if(text.isEmpty()){
			return false;
		}
		return true;
	}

	public String evaluate(String text, HashMap<String, String> mapOfVariables) throws Exception {
		String newText = text;
		Object[] key = mapOfVariables.keySet().toArray();
		for (int i = 0; i < key.length; i++) {
			newText = newText.replaceAll("\\{\\$"+key[i]+"\\}", mapOfVariables.get(key[i]));
			newText = newText.replaceAll("\\$\\{"+key[i]+"\\}", mapOfVariables.get(key[i]));
		}
		if(newText.equals(text) || !verifyText(text))
			throw new MissingValueException();
		
		return newText;
	}

}
