package src;

public class Game {
	
	private String[] p1;
	private String[] p2;
	
	public Game(String[] p1, String[] p2) {

		this.p1 = p1;
		this.p2 = p2;
	}

	public String result() {
		if (p1[1] == "S" && p2[1] == "P"){
			return p2[0];
		}
		//P > R
		//R > S
		
		
		return p1[0];
	}

	
}
