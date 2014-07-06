import java.util.HashMap;


public class SpellOut {
	
	HashMap<String, String> unitDictionary = new HashMap<String, String>();
	HashMap<String, String> dozenDictionary = new HashMap<String, String>();
	
	public SpellOut() {
		unitDictionary.put("0", "zero");
		unitDictionary.put("1", "one");
		unitDictionary.put("2", "two");
		unitDictionary.put("3", "three");
		unitDictionary.put("4", "four");
		unitDictionary.put("5", "five");
		unitDictionary.put("6", "six");
		unitDictionary.put("7", "seven");
		unitDictionary.put("8", "eight");
		unitDictionary.put("9", "nine");
		
		dozenDictionary.put("10", "ten");
		dozenDictionary.put("11", "eleven");
		dozenDictionary.put("12", "twelve");
		dozenDictionary.put("13", "thirteen");
		dozenDictionary.put("14", "fourteen");
		dozenDictionary.put("15", "fifteen");
		dozenDictionary.put("16", "sixteen");
		dozenDictionary.put("17", "seventeen");
		dozenDictionary.put("18", "eighteen");
		dozenDictionary.put("19", "nineteen");
		dozenDictionary.put("2", "twenty");
		dozenDictionary.put("3", "thirty");
		dozenDictionary.put("4", "forty");
		dozenDictionary.put("5", "fifty");
		dozenDictionary.put("6", "sixty");
		dozenDictionary.put("7", "seventy");
		dozenDictionary.put("8", "eighty");
		dozenDictionary.put("9", "ninety");
		dozenDictionary.put("20", "twenty");
		dozenDictionary.put("30", "thirty");
		dozenDictionary.put("40", "forty");
		dozenDictionary.put("50", "fifty");
		dozenDictionary.put("60", "sixty");
		dozenDictionary.put("70", "seventy");
		dozenDictionary.put("80", "eighty");
		dozenDictionary.put("90", "ninety");
	}

	public boolean verifyAmount(String amount) throws SpeelOutNullException {
	
		if(amount == null)
			throw new SpeelOutNullException();
		
		if(amount.isEmpty())
			return false;
		
		return true;
	}

	public String spellOutIntegerAmount(String amount) throws SpeelOutNullException {
		
		if(verifyAmount(amount)){
			if(amount.length()==1){
				return spellOutAnUnitIntegerAmount(amount);
			}else if(amount.length()==2) {
				return spellOutAdozenIntegerAmount(amount);
			}else if(amount.length()==3){
				return spellOutAhundredIntegerAmount(amount);
			}else if(amount.length()==4){
				String spellOutAmount = "";
				spellOutAmount += spellOutAnUnitIntegerAmount(amount.charAt(0)+"");
				spellOutAmount += " thousand";
				if(amount.charAt(1)== '0' && amount.charAt(2)== '0' && amount.charAt(3)== '0'){
					return spellOutAmount;
				}else if(amount.charAt(1)!= '0' && amount.charAt(2)== '0' && amount.charAt(3)== '0'){
					spellOutAmount += " "+spellOutAhundredIntegerAmount(amount.substring(1,4));
					return spellOutAmount;
				}
			}
				
		}
		return "";
	}

	private String spellOutAhundredIntegerAmount(String amount) {
		String spellOutAmount = "";
		spellOutAmount = spellOutAnUnitIntegerAmount(amount.charAt(0)+"");
		spellOutAmount += " hundred";
		
		if(amount.charAt(1) == '0' && amount.charAt(2) == '0'){
			return spellOutAmount;
		}else if(amount.charAt(1) == '0' && amount.charAt(2) != '0'){
			spellOutAmount += " and ";
			spellOutAmount += spellOutAnUnitIntegerAmount(amount.charAt(2)+"");
			return spellOutAmount;
		}else if(amount.charAt(1) != '0' && amount.charAt(2) != '0'){
			spellOutAmount += " " +spellOutAdozenIntegerAmount(amount.substring(1,3));
			return spellOutAmount;
		}
		return spellOutAmount;
	}


	private String spellOutAnUnitIntegerAmount(String amount) {
		return unitDictionary.get(amount);
	}
	

	private String spellOutAdozenIntegerAmount(String amount) {
		if(dozenDictionary.containsKey(amount)){
			return dozenDictionary.get(amount);
		}else{
			String spellOutAmount = "";
			spellOutAmount = dozenDictionary.get(amount.charAt(0)+"");
			spellOutAmount += "-";
			spellOutAmount += unitDictionary.get(amount.charAt(1)+"");
			return spellOutAmount;
		}
	}

}
