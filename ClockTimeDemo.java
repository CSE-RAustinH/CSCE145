//Austin Harrelson
import java.util.Scanner;
public class ClockTimeDemo {
											// Extends Previous Program Time Exception
	public static void main(String[] args) throws TimeException {
		
		Scanner key = new Scanner(System.in);
		
		Timeconverter T1 = new Timeconverter();
		
		boolean loop = true;
		// While loop used to ask if the user would like to convert time more the once then once the loop is false the program will end
		while (loop = true){
			System.out.println("Convert military into 12-hours clock time!!!");
		
			System.out.println("Enter the hours on the military clock: ");
			
			int hours = key.nextInt();
			
			key.nextLine();
			System.out.println("Enter the minutes on the military clock: ");
			
			int minutes = key.nextInt();
			
			key.nextLine();
			System.out.println("Enter the seconds on the military clock: ");
			
			int seconds = key.nextInt();
			
			key.nextLine();
			// Updates user input by passing through the variables as given by user input
			T1.updateTime(hours, minutes, seconds);
			
			System.out.println("12-Hour Clock Time -> ");
			
			T1.displayTime();
		
			//Changes time from military time to regular time
			System.out.println("Enter 24 hour clock time in the format “hours:minutes:seconds”");
			
			String clocktime = key.next();
			
			Timeconverter T2 = new Timeconverter();
			
			T2.updateTime(clocktime);
			
			T2.displayTime();
			
			System.out.println("Would you like to do this again? Enter Yes or no");
			String anwser = key.next();
			
			if (anwser.equalsIgnoreCase("yes"))
			{
				loop = true;
			}
			else if(anwser.equalsIgnoreCase("no"))
			{
				loop = false;
				System.out.println("Exiting the Program!");
				System.exit(0);
				
			}
		
		}
		
		
	}
}
