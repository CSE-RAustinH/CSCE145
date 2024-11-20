//Austin Harrelson
public class Coffee {

	//Instance Variables
	
	private String name;
	private double caffine;
	private Object key;
	
	// Default Constructor
	public Coffee()
	{
		this.name = "none";
		this.caffine = 50;
	}
	
	// Parameterized Constructor
	
	public Coffee(String xName, double xCaffine)
	{
		this.setCoffee(xName);
		this.setCaffine(xCaffine);
	}

	
	// Accessors
	
	public String getCoffee()
	{
		return this.name;
	}
	
	public double getCaffine()
	{
		return this.caffine;
	}
	
	//Mutators
	public void setCoffee(String xName) {
		this.name = xName;
	}

	// User Input Validation
	public void setCaffine(double xCaffine) {
		if (xCaffine >= 50 && xCaffine <= 300)
		{
			this.caffine = xCaffine;
		}
		else
		{
			System.out.println("Invalid Amount Entered!");
		}
		
	}
	
	//Risky amount of Coffee
	public double riskyAmount()
	{
		double cups = (180.0/((caffine/ 100.0)*6.0));
		return cups;
	}
	
	//Returning All Values
	public String toString()
	{
		return "Name: " + this.name 
				+ "Caffine Amount: " + caffine 
				+ "It would take" + riskyAmount() + "of" 
				+ this.name +"before it’s dangerous to drink \r\n"
				+ "more.";
	}
	
	public boolean equals(Coffee c)
	{
		return c.getCoffee().equals(this.name) 
				&& c.getCaffine() == (caffine);
	}
	
}
