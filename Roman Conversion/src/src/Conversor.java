package src;

public class Conversor {

	public int romanToArabic(String roman) {
	
		int numRoman=0;
		int temp;
		
		if (roman.length()==1){
			return romanValue(roman.charAt(0));
		}
		else{
			
			for(int i=roman.length(); i>0; i--){

				temp = romanValue(roman.charAt(i-1));
			
				if(i==roman.length())
				numRoman= numRoman +romanValue(roman.charAt(i-1));
				
				if(i>=2){
					
					if(temp>romanValue(roman.charAt(i-2))){
						numRoman= numRoman-romanValue(roman.charAt(i-2));
					}
					else{
						numRoman= numRoman +romanValue(roman.charAt(i-2));
					}
				}
			}
		}
		return numRoman;
	}

	public int romanValue(char arabic) {
		switch (arabic) {
		case 'I':
			return 1;
		case 'V':
			return 5;	
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			break;
		}
		return 0;
	}

	public String arabicToRoman(int i) {
		return "I";
	}

	
	
}
