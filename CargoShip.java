//Austin Harrelson
public class CargoShip extends Ship{

	//Instance Variables
	
	private double DeadWeight;
	private double MaxSpeed;
	
	//Default Constructor
	
	public CargoShip()
	{
		this.DeadWeight = 0;
		this.MaxSpeed = 0;
	}
	
	//Parameterized Constructor
	
	public CargoShip(String xShipname, String xLaunchdate, double xDoubleWeight, double xMaxSpeed)
	{
		super(xShipname, xLaunchdate);
		
		this.setDeadWeight(xDoubleWeight);
		this.setMaxSpeed(xMaxSpeed);
		
	}
	
	//Accesors
	

		public double getDeadWeight()
		{
			return this.DeadWeight;
		}
		
		public double getMaxSpeed()
		{
			return this.MaxSpeed;
		}
		
		//Mutators
		
		private void setDeadWeight(double xDeadWeight)
		{
			this.DeadWeight = xDeadWeight;
		}
		
		private void setMaxSpeed(double xMaxSpeed)
		{
			this.MaxSpeed = xMaxSpeed;
		}

		
		//Other Methods

		
		
		public String toString()
		{
			return "Ship's Name: " + this.getShipname() + 
					"\nThe Dead Weight Tonnage is " + this.DeadWeight + " kg"
					 + "\nand its Maximum Speed is: " + this.MaxSpeed + " Mph.";
		}
	
}
