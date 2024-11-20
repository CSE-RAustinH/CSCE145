//Austin Harrelson
import java.util.Scanner;
public class ShipNavigator extends Ship{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Welcome to Ship Navigator!!!");
		
		boolean loop = true;
		
		// While loop to ask the program if they would like to create another ship
		
		while(loop == true)
		{
		
		// Ask the user for input of required information
			System.out.println("Enter the Name of the Ship:");
		
			String name = key.nextLine();
		
			System.out.println("Enter it's Launch Date (mm/dd/yyyy):");
		
			String date = key.nextLine();
		
			System.out.println("Is it a cruise ship or a cargo ship?");
		
			String anwser = key.nextLine();
		
			if(anwser.equalsIgnoreCase("cruise ship"))
			{
				System.out.println("Enter the ship's passenger capacity: ");
			
				int capacity = key.nextInt();
				key.nextLine();
			
				System.out.println("How many crew members are on this ship?");
			
				int crewMembers = key.nextInt();
				key.nextLine();
			
				System.out.println("Creating a cruise ship ... ");
			// Calls the method from CruiseShip.Java and users those factors to write out the required information on the screen.
				CruiseShip CS1 = new CruiseShip(name, date, capacity, crewMembers);
			
				System.out.println("Printing out Ship Details: ");
			
				System.out.println(CS1.toString());
			
			}
			else if(anwser.equalsIgnoreCase("cargo ship"))
			{
				System.out.println("Enter the ship's tonnage (DWT):");
			
				double weight = key.nextDouble();
				key.nextLine();
			
				System.out.println("Enter the maximum speed of the ship (in mph):");
			
				double speed = key.nextDouble();
				key.nextLine();
			
				System.out.println("Creating a cargo ship ... ");
			// Calls CargoShip.java and runs the program while taking variables from the user and printing those details of the cargo ship.
				CargoShip Cs1 = new CargoShip(name, date, weight, speed);
			
				System.out.println("Printing out Ship Details: ");
			
				System.out.println(Cs1.toString());
			
			}
			else
			{
				System.out.println("Invalid Anwser Entered!");
				System.exit(0);
			}
			
			// Asks to see if the user wants to create another ship object
			System.out.println("Do you want to construct another ship object? Enter yes or no:");
		
			String repeatAnwser = key.nextLine();
			
			if(repeatAnwser.equalsIgnoreCase("yes"))
			{
				loop = true;
			}
			else if(repeatAnwser.equalsIgnoreCase("no"))
			{
				loop = false;
			}
		
		}
		
	}

}
