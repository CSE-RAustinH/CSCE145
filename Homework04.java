//Austin Harrelson
import java.util.Scanner;
public class Homework04 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
			
		System.out.println("Please enter a number of circles: ");
		
		//Stores the number of circle that was provided from the user.
		int circlenum = key.nextInt();
		
		// User input validation
		if (circlenum == 0)
		{
			System.out.println("No circles to sort.");
			System.exit(0);
		}
		
		// Array variables that are used when sorting
		double [] radiusArray = new double [circlenum];
		
		double [] areaArray = new double [circlenum];
		
		//Storing user input
		for(int i = 0; i < radiusArray.length; i++)
		{
			int pos = i + 1;
			System.out.println("Enter the radius for circle " + pos);
			radiusArray[i] = key.nextInt();
		}
		
		for(int i = 0; i < areaArray.length; i++)
		{
			double area = Math.pow(radiusArray[i], 2) * 3.14;
			areaArray[i] = area;
			System.out.print(area + " ");
		}
		
		key.nextLine();
		
		boolean input = true;
		
		while(input == true)
		//Asks the user what they would like to do with the information of the circles given by the user.
			{
			System.out.print("\nWhat do you want to determine using the areas of the circles?\n"
					+ "Please enter \"small\" to sort the from smallest to largest.\n"
					+ "Please enter \"large\" to sort the from largest to smallest.\n"
					+ "Please enter \"unique\" to sort and find unique circles. \n"
					+ "or Please enter \"quit\" to quit the program");
			String anwser = key.nextLine();
		
			
		//The overall if else statement loops are used to sort the circles in a specific format based on the users input
			
			//The first if else statement prints the circle smallest to largest.
			if(anwser.equalsIgnoreCase("small"))
			{
				System.out.println("You have chosen to sort the circles from smallest to largest");
			
				//Selection sort
				for(int i = 0; i < areaArray.length; i++)
				{
					int minIndex = i;
					double smallest = areaArray[i];
				
					for(int j = i+1; j < areaArray.length; j ++)
					{
						if(areaArray[j] < smallest)
						{
							smallest = areaArray[j];
							minIndex = j;
						}
					
					}
				
					if(smallest < areaArray[i])
					{
						double temp = areaArray[i];
						areaArray[i] = areaArray[minIndex];
						areaArray[minIndex] = temp;
					}
				}
			
				//print the contents of the array
				for(int i = 0; i < areaArray.length; i ++)
				{
					System.out.print(areaArray[i] + " ");
				}
			
			}
			// the second statement sorts the circle from largest to smallest
			else if(anwser.equalsIgnoreCase("large"))
			{
				System.out.println("You have chosen to sort the circles from largest to smallest");
				//Selection sort
				for(int i = 0; i < areaArray.length; i++)
				{
					int minIndex = i;
					double largest = areaArray[i];
				
					for(int j = i + 1; j < areaArray.length; j ++)
					{
						if(areaArray[j] > largest)
						{
							largest = areaArray[j];
							minIndex = j;
						}
					
					}
				
					if(largest > areaArray[i])
					{
						double temp = areaArray[i];
						areaArray[i] = areaArray[minIndex];
						areaArray[minIndex] = temp;
					}
				}
			
				//print the contents of the array
				for(int i = 0; i < areaArray.length; i ++)
				{
					System.out.print(areaArray[i] + " ");
				}
			
			
			}
			// this statement sorts the unique circles form circles with similar values
			else if(anwser.equalsIgnoreCase("unique"))
			{
				System.out.println("You have chosen to sort and find the unique circles");
			
				for(int i = 0; i < areaArray.length; i++)
				{
					int number = 0;
					for(int j = 0; j < areaArray.length; j++)
					{
						if (areaArray[i] == areaArray[j] && i != j)
						{
							number++;
							break;
						}
					}
					if(number == 0)
					{
						System.out.print(areaArray[i] + " ");
					}
				}
			}
			// This statement Giving the user the ability to quit the program
			else if(anwser.equalsIgnoreCase("quit"))
			{
				System.out.println("You have chosen quit the program!");
				System.exit(0);
			}
			else
			{
			System.out.println("Invalid anwser! please try again");
			
			}
		
		}	
	}
}

