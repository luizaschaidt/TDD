package src;

import java.util.Iterator;

public class Game {
	
	private String[] p1;
	private String[] p2;
	
	public Game(String[] p1, String[] p2) {

			this.p1 = p1;
			this.p2 = p2;
							
			if((!p1[1].equals("S")&&!p1[1].equals("P")&&!p1[1].equals("R"))||(!p2[1].equals("S")&&!p2[1].equals("P")&&!p2[1].equals("R"))) {
	    		 throw new NoSuchStrategyError("Strategy must be one of R,P,S");
	    	 }			 
	}


	public String result() {
		if ((p2[1] == "S" && p1[1] == "P")||(p2[1]== "P" && p1[1] == "R")||((p2[1]== "R" && p1[1] == "S"))){
			return p2[0];
		}
		else
			return p1[0];
	}

	public Game(Game[] games) {
		
	}


	public String tournament_winner(Game[] games) {
		int it = games.length;
		
		for(int n=0;n<it;n++){
			
		}
		
		return "Cesar";
	}
	
}
