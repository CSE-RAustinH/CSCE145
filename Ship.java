//Austin Harrelson
public class Ship {
	//Instance Variables
	
	private String Shipname;
	private String Launchdate;
	
	//Default Constructor
	public Ship()
	{
		this.Shipname = "none";
		this.Launchdate = "none";
	}
	
	//Parameterized Constructor
	
	public Ship(String xShipname, String xLaunchdate)
	{
		this.setShipname(xShipname);
		this.setLaunchdate(xLaunchdate);
	}
	
	//Accesors
	
	public String getShipname()
	{
		return this.Shipname;
	}
	
	public String getLaunchdate()
	{
		return this.Launchdate;
	}
	
	//Mutators
	
	public void setShipname(String xShipname)
	{
		this.Shipname = xShipname;
	}
	
	public void setLaunchdate(String xLaunchdate)
	{
		String subShipdate = xLaunchdate.substring(6,10);
		int year = 0;
		
		try {
			year = Integer.parseInt(subShipdate);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		if(year >= 1990 && year <= 2019)
		{
			this.Launchdate = xLaunchdate;
		}
		else
		{
			System.out.println("Value out of Range! Invalid Value Entered!");
			System.exit(0);
		}
		
		
	}
	
	//Other Methods
	
	// Method that writes tohe ship name and launch date for the user in the terminal.
	
	public String toString()
	{
		return "Ship Name: " + this.getShipname()
				+ "Launch Date: " + this.Launchdate;
	}
	
}
