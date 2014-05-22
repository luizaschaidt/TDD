package src;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
		
		List<String> estrategia1 = new ArrayList<String>();
		List<String> vencedor1 = new ArrayList<String>();

		Game gameTemp;
		String[] player1 = null;
		String[] player2 = null;
		
		Game [] vencedores = games;
					
			
		for(int n=0;n<it;n++){
			
				gameTemp = vencedores[n];
				player1 = gameTemp.p1;
				player2 = gameTemp.p2;
				
				vencedor1.add(result(player1, player2)[0]);			
				estrategia1.add(result(player1, player2)[1]);				
		}
				
				if (vencedor1.size()>1){
					for(int j =0 ; j<3; j++){
						vencedores[j]=null;
						
						//String [] p1 = null;
						List<String> p1 = new ArrayList<String>();
						List<String> p2 = new ArrayList<String>();

						p1.add(vencedor1.get(j));
						p1.add(estrategia1.get(j));
						
						p2.add(vencedor1.get(j+1));
						p2.add(estrategia1.get(j+1));
						
						//Game games1 = new Game(p1, p2);
						//vencedores[j]= games1;
						
				
				}
					//tournament_winner(vencedores);
			}
		
		
		System.out.println(vencedor1.toString());
		System.out.println(estrategia1.toString());
		
		System.out.println(result(player1, player2)[0]);
		
		return "Cesar";
	}
	
}
