package src;

public class GameInputException extends Exception{

	//Parameterless Constructor
    public GameInputException() {}

    //Constructor that accepts a message
    public GameInputException(String message)
    {
       super(message);
    }
}
