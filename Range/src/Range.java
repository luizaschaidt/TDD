
public class Range {

	public boolean verifyInterval(String interval) throws IntervallNullException{
		if(interval==null){
			throw new IntervallNullException();
		}else{
			interval = interval.trim();
		}
		
		if(interval.isEmpty() || !interval.contains(",")){
			return false;
		}
		
		String firstCharacter = interval.charAt(0)+"";
		String lastCharacter = interval.charAt(interval.length()-1)+"";
		
		if((firstCharacter.equals("(") || firstCharacter.equals("[")) && 
				(lastCharacter.equals(")") || lastCharacter.equals("]"))){
			return true;
		}else{
			return false;
		}
	}

	public boolean isInInterval(String interval, String number) throws IntervallNullException {
		verifyInterval(interval);
		String firstCharacter = interval.charAt(0)+"";
		String lastCharacter = interval.charAt(interval.length()-1)+"";

		Integer firstNumber = Integer.parseInt(interval.substring(1, interval.indexOf(",")));
		Integer lastNumber = Integer.parseInt(interval.substring(interval.indexOf(",")+1, interval.length()-1));
		
		
		if(firstCharacter.equals("(")){
			if (lastCharacter.equals(")")) {

				for (Integer i = firstNumber + 1; i < lastNumber; i++) {
					if (i==Integer.parseInt(number)){
						return true;
					}
				}
			}else if(lastCharacter.equals("]")){
				for (Integer i = firstNumber + 1; i <= lastNumber; i++) {
					if (i==Integer.parseInt(number)){
						return true;
					}
				}
			}
		}else if(firstCharacter.equals("[")){
			if (lastCharacter.equals(")")) {

				for (Integer i = firstNumber; i < lastNumber; i++) {
					if (i==Integer.parseInt(number)){
						return true;
					}
				}

			}else if(lastCharacter.equals("]")){
				for (Integer i = firstNumber; i <= lastNumber; i++) {
					if (i==Integer.parseInt(number)){
						return true;
					}
				}
			}
		}
		return false;
	}

}
