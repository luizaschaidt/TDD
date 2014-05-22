package src;

import java.lang.reflect.Array;
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


	public String [] result(String[] p1,String[] p2) {
		if ((p2[1] == "S" && p1[1] == "P")||(p2[1]== "P" && p1[1] == "R")||((p2[1]== "R" && p1[1] == "S"))){
			return p2;
		}
		else
			return p1;
	}

	public Game(Game[] games) {
		
	}


	public String tournament_winner(Game[] games) {
		int it = games.length;

			String[] vencedor = null;
			for(int n=0;n<it;n++){
			Game gameTemp = games[n];
			String[] player1 = gameTemp.p1;
			String[] player2 = gameTemp.p2;
			System.out.println(result(player1, player2)[0]);
			//vencedor[n]=result(player1,player2)[0];
			

		}
		
		return "Cesar";
	}
	
}
