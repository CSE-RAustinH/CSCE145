// Austin Harrelson
public class TimeException extends Exception{

	//Instance Variables
	private String msg;
	
	
	
	// Default Constructor
	public TimeException()
	{
		super("EXCEPTION: Invalid time entered");
		
	}
	
	// Parameterized Constructor
	
	public TimeException(String msg)
	{
		super(msg);
	}
}
