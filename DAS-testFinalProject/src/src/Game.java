package src;

import static org.junit.Assert.fail;

public class Game {
	
	private String[] p1;
	private String[] p2;
	
	public Game(String[] p1, String[] p2) {

			this.p1 = p1;
			this.p2 = p2;
			
			try
				{
				if((!p1[1].equals("S")) || (!p1[1].equals("P") || (!p1[1].equals("R")))) {
		    	 //if(true) {
		    		 System.out.println("diferente");
		    		 throw new GameInputException();
		    	 }
			 }
			 catch(Exception e)
			 {
				// fail("GameInputException expected");
			 }
		
	}

	public String result() {
		if ((p1[1] == "S" && p2[1] == "P")||(p1[1]== "P" && p2[1] == "R")||((p1[1]== "R" && p2[1] == "S"))){
			return p1[0];
		}
		else
			return p2[0];
	}

	
}
