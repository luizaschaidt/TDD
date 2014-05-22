package src;

@SuppressWarnings("serial")
public class NoSuchStrategyError extends RuntimeException{

	//Parameterless Constructor
    public NoSuchStrategyError() {}

    //Constructor that accepts a message
    public NoSuchStrategyError(String message)
    {
    	System.out.println(message);
    }
}
