//Austin Harrelson
import java.util.Scanner;
public class CoffeeTester {
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		boolean loop = false;
		
		//This loop runs the program inside of it while the loop is true
		do
		{
			// Asks the user for the name of the coffee and how much caffine is in each coffee
			System.out.println("Welcome to Coffee hour!");
			
			System.out.println("What's the name of the first coffee?");
			
			String name1 = key.nextLine();
			
			System.out.println("How much Caffine is in the first coffee?");
			
			double Amount1 = key.nextDouble();
			key.nextLine();
			
			Coffee c1 = new Coffee(name1, Amount1);
			
			System.out.println("It would take " + c1.riskyAmount() + " cups of " + name1 + " before it's dangerous to drink more.");
			
			System.out.println("What's the name of the second coffee?");
			
			String name2 = key.nextLine();
			
			System.out.println("How much Caffine is in the second coffee?");
			
			double Amount2 = key.nextDouble();
			key.nextLine();
			
			Coffee c2 = new Coffee(name2, Amount2);
			
			System.out.println("It would take " + c2.riskyAmount() + " cups of " + name2 + " before it's dangerous to drink more.");
			
			//Checks to see if both coffees are the same
			
			System.out.println("Are both coffee’s the same? " + c1.equals(c2));
			
			//Asks the user if they want to keep keep the loop going or end the loop
			
			System.out.println("Do you want to create more coffe objects? Enter “Yes” or “No”:");
			
			String answer = key.nextLine();
			
			if(answer.equalsIgnoreCase("yes"))
			{
				loop = true;
			}
			else if(answer.equalsIgnoreCase("no"))
			{
				loop = false;
			}
			else
			{
				System.out.println("Unexpected situation encountered!");
				System.exit(0);
			}
			
		}while(loop == true);
	}
}

