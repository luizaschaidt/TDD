package src;

public class Conversor {

	public int romanToArabic(String roman) {
		
		String newRoman="";
		int numRoman;
		int temp;
		
		for(int i=roman.length(); i>0; i--){
			//newRoman=newRoman+roman.charAt(i-1);
			//if(roman.charAt(i-1));
			temp = romanValue(roman.charAt(i-1));
			if(roman.length()!= i){
				if(true){
					
				}
				if(true){
					
				}
			}
			
		
		}
		System.out.println(newRoman);
		return 22;
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

	
	
}
