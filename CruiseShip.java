//Austin Harrelson
public class CruiseShip extends Ship{

	//Instance Variables
	
	private int PassengerCap;
	private int CrewMembers;
	
	//Default Constructor
	
	public CruiseShip()
	{
		this.PassengerCap = 0;
		this.CrewMembers = 0;
	}
	
	//Parameterized Constructor
	
	public CruiseShip(String xShipname, String xLaunchdate, int xPassengerCap, int xCrewMembers)
	{
		super(xShipname, xLaunchdate);
		
		this.setPassengerCap(xPassengerCap);
		this.setCrewMembers(xCrewMembers);
		
	}
	
	
	//Accesors
	

		public int getPassengerCap()
		{
			return this.PassengerCap;
		}
		
		public int getCrewMembers()
		{
			return this.CrewMembers;
		}
		
		//Mutators
		
		private void setPassengerCap(int xPassengerCap)
		{
			this.PassengerCap = xPassengerCap;
		}
		
		private void setCrewMembers(int xCrewMembers)
		{
			this.CrewMembers = xCrewMembers;
		}

		
		//Other Methods
		
		public boolean equals(CruiseShip cs)
		{
			return this.PassengerCap == (cs.getPassengerCap()) 
			&& this.CrewMembers == (cs.getCrewMembers()); 
		}
		
		public String toString()
		{
			return "Ship's Name: " + this.getShipname() + 
					"\nThe Passenger Capacity is " + this.PassengerCap
					+ "\nCrew Members: " + this.CrewMembers;
		}
	
	
	
}
