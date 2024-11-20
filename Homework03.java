// Austin Harrelson
import java.util.Scanner;
import java.util.Random;
public class Homework03 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		Random r = new Random();
		
		String response = "";
		
		do { // Created a loop that runs if the user wants to play rock,paper,scissors again. If yes it will run the loop if no it will end the program.
			
			int humanwin = 0;
			
			int computerwin = 0;
		
			System.out.println("Welcome to Rock,Paper,Scissors! for todays math we will be playing best 2 out of 3. You versuse the Computer!");
			
		do {	
			// Asks the user if they want to play rock paper or scissors against the computer.
			System.out.println("Please Enter \"rock\", \"paper\" or \"scissors\":\"");
			
			String humanresponse = key.next();
		
			int computer = r.nextInt(3);
		
			String computerresponse = "";
		
		switch (computer) // A switch statement the determines the computers play against the user buy using a random component and switch statement.
		
			{
			case 0:
				computerresponse = "rock";
				break;
			case 1:
				computerresponse = "paper";
				break;
			case 2:
				computerresponse = "scissors";
				break;
		default: //Default so if none of the cases are true this program will run and exit the program entirely!.
			System.out.println("The computer inputed a invalid value! Exiting the program");
			System.exit(0);
		}
			// A string of if else statements to determine the outcome of any rock paper scissors matchup then award the winner points based on thier result. The first to 2 wins!
			if(humanresponse.equalsIgnoreCase(computerresponse)){
				System.out.println("You picked: " + humanresponse);
				System.out.println("The computer picked: " + computerresponse);
				System.out.println("The Game ended in a tie. No points awarded");
			}
			else if (humanresponse.equalsIgnoreCase("rock") && computerresponse.equalsIgnoreCase("scissors")) {
				System.out.println("You picked: " + humanresponse);
				System.out.println("The computer picked: " + computerresponse);
				System.out.println("You win! You gain 1 point: ");
				humanwin ++;
			}
			else if (humanresponse.equalsIgnoreCase("rock") && computerresponse.equalsIgnoreCase("paper")) {
				System.out.println("You picked: " + humanresponse);
				System.out.println("The computer picked: " + computerresponse);
				System.out.println("You lost! The computer gains 1 point: ");
				computerwin ++;
			}
			else if (humanresponse.equalsIgnoreCase("paper") && computerresponse.equalsIgnoreCase("rock")) {
				System.out.println("You picked: " + humanresponse);
				System.out.println("The computer picked: " + computerresponse);
				System.out.println("You win! You gain 1 point: ");
				humanwin ++;
			}
			else if (humanresponse.equalsIgnoreCase("paper") && computerresponse.equalsIgnoreCase("scissors")) {
				System.out.println("You picked: " + humanresponse);
				System.out.println("The computer picked: " + computerresponse);
				System.out.println("You lost! The computer gains 1 point: ");
				computerwin ++;
			}
			else if (humanresponse.equalsIgnoreCase("scissors") && computerresponse.equalsIgnoreCase("paper")) {
				System.out.println("You picked: " + humanresponse);
				System.out.println("The computer picked: " + computerresponse);
				System.out.println("You win! You gain 1 point: ");
				humanwin ++;
			}
			else if (humanresponse.equalsIgnoreCase("scissors") && computerresponse.equalsIgnoreCase("rock")) {
				System.out.println("You picked: " + humanresponse);
				System.out.println("The computer picked: " + computerresponse);
				System.out.println("You lost! The computer gains 1 point: ");
				computerwin ++;
			}
		} while(humanwin < 2 && computerwin < 2);// runs this code inside of the do while loop while either the computer or the user has less then 2 points
		
		if (humanwin == 2) {
			System.out.println("Congragulations You win!");
		}
		else if (computerwin == 2) {
			System.out.println("Unfortantley you did not win! Thanks for playing!");
		}
		System.out.println("Would you like to play again? Please Enter \"yes\" or \"no\":");
			response = key.next();
		
		}while(response.equalsIgnoreCase("yes"));
	}

}
