// Austin Harrelson
import java.util.Scanner; // Importing a Scanner for user input
public class Homework02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in); // Scanner key set to accept user input
		
		/* Print statement to explain that we are going to predict South Carolina's Football record and whether or not they make it to the bowl game or college football championship.
		* In which case we will ask the user to enter the score for each game and based off the input that will determine if they go to a bowl game or not.
		*/
		System.out.println("Lets predict and see if South Carolina will make it to the college football championship."); 
		
		/* Initializing the win,losses and tie variable to keep track of South Carolina's 
		 * record which will determine which bowl game they go to.
		 */
		int win = 0; 
		
		int losses = 0;
		
		int tie = 0;
		
		// Next we asked the user to enter the score for each football game this season to determine South Carolina's record.
		System.out.println("Enter the score of the South Carolina Vs. Old Dominion football game? Please enter South Carolina's total points:");
		
		int USCscore1 = key.nextInt();
		
		System.out.println("Please enter Old Dominion's total points:");
		
		int Oduscore = key.nextInt();
		
		// if statement to make sure user input cannot be negative at the begining of each if else statement after the user enters a score
		
		if ( USCscore1 < 0 || Oduscore < 0) {
			System.out.println("Invalid score entered! exiting the program");
			System.exit(0);
			}
		else if (USCscore1 > Oduscore){
			System.out.println("USC wins");
			win = win + 1;
			
		}
		else if (USCscore1 < Oduscore){
			System.out.println("USC looses");
			losses = losses + 1;
			
		}
		else if (USCscore1 == Oduscore){
			System.out.println("The game is a tie");
			tie = tie + 1;
			
		}
		
		System.out.println("Enter the score of the South Carolina Vs. Kentucky football game? Please enter South Carolina's total points:");
		
		int USCscore2 = key.nextInt();
		
		System.out.println("Please enter Kentucky's total points:");
		
		int Kentuckyscore = key.nextInt();
		
		if (USCscore2 < 0 || Kentuckyscore < 0) {
			System.out.println("Invalid score entered! exiting the program");
			System.exit(0);
			}
		else if (USCscore2 > Kentuckyscore){
			System.out.println("USC wins");
			win = win + 1;
			
		}
		else if (USCscore2 < Kentuckyscore){
			System.out.println("USC looses");
			losses = losses + 1;
			
		}
		else if (USCscore2 == Kentuckyscore){
			System.out.println("The game is a tie");
			tie = tie + 1;
			
		}
		
		System.out.println("Enter the score of the South Carolina Vs. LSU football game? Please enter South Carolina's total points:");
		
		int USCscore3 = key.nextInt();
		
		System.out.println("Please enter LSU's total points:");
		
		int LSUscore = key.nextInt();
		
		if (USCscore3 < 0 || LSUscore < 0) {
			System.out.println("Invalid score entered! exiting the program");
			System.exit(0);
			}
		else if(USCscore3 > LSUscore){
			System.out.println("USC wins");
			win = win + 1;
			
		}
		else if (USCscore3 < LSUscore){
			System.out.println("USC looses");
			losses = losses + 1;
			
		}
		else if (USCscore3 == LSUscore){
			System.out.println("The game is a tie");
			tie = tie + 1;
			
		}
		
		System.out.println("Enter the score of the South Carolina Vs. Akron football game? Please enter South Carolina's total points:");
		
		int USCscore4 = key.nextInt();
		
		System.out.println("Please enter Kentucky's total points:");
		
		int Akronscore = key.nextInt();
		
		if (USCscore4 < 0 || Akronscore < 0) {
			System.out.println("Invalid score entered! exiting the program");
			System.exit(0);
			}
		else if(USCscore4 > Akronscore){
			System.out.println("USC wins");
			win = win + 1;
			
		}
		else if (USCscore4 < Akronscore){
			System.out.println("USC looses");
			losses = losses + 1;
			
		}
		else if (USCscore4 == Akronscore){
			System.out.println("The game is a tie");
			tie = tie + 1;
			
		}
		
		System.out.println("Enter the score of the South Carolina Vs. Ole Miss football game? Please enter South Carolina's total points:");
		
		int USCscore5 = key.nextInt();
		
		System.out.println("Please enter Ole Miss's total points:");
		
		int Olemiss_score = key.nextInt();
		
		if (USCscore5 < 0 || Olemiss_score < 0) {
			System.out.println("Invalid score entered! exiting the program");
			System.exit(0);
			}
		else if(USCscore5 > Olemiss_score){
			System.out.println("USC wins");
			win = win + 1;
			
		}
		else if (USCscore5 < Olemiss_score){
			System.out.println("USC looses");
			losses = losses + 1;
			
		}
		else if (USCscore5 == Olemiss_score){
			System.out.println("The game is a tie");
			tie = tie + 1;
			
		}
		
		System.out.println("Enter the score of the South Carolina Vs. Alabama football game? Please enter South Carolina's total points:");
		
		int USCscore6 = key.nextInt();
		
		System.out.println("Please enter Alabama's total points:");
		
		int Alabamascore = key.nextInt();
		
		if (USCscore6 < 0 || Alabamascore < 0) {
			System.out.println("Invalid score entered! exiting the program");
			System.exit(0);
			}
		else if(USCscore6 < 0 || Alabamascore < 0) {
			System.out.println("Invalid score entered! exiting the program");
			System.exit(0);
			}
		else if (USCscore6 > Alabamascore){
			System.out.println("USC wins");
			win = win + 1;
		}
		else if (USCscore6 < Alabamascore){
			System.out.println("USC looses");
			losses = losses + 1;
		}
		else if (USCscore6 == Alabamascore){
			System.out.println("The game is a tie");
			tie = tie + 1;
		}
		System.out.println("Enter the score of the South Carolina Vs. Oklahoma football game? Please enter South Carolina's total points:");
		
		int USCscore7 = key.nextInt();
		
		System.out.println("Please enter Oklahoma's total points:");
		
		int Oklahomascore = key.nextInt();
		
		if (USCscore7 < 0 || Oklahomascore < 0) {
			System.out.println("Invalid score entered! exiting the program");
			System.exit(0);
			}
		else if(USCscore7 > Oklahomascore){
			System.out.println("USC wins");
			win = win + 1;
		}
		else if (USCscore7 < Oklahomascore){
			System.out.println("USC looses");
			losses = losses + 1;
		}
		else if (USCscore7 == Oklahomascore){
			System.out.println("The game is a tie");
			tie = tie + 1;
		}
		
		System.out.println("Enter the score of the South Carolina Vs. Texas A&M football game? Please enter South Carolina's total points:");
		
		int USCscore8 = key.nextInt();
		
		System.out.println("Please enter Texas A&M's total points:");
		
		int Texasscore = key.nextInt();
		
		if (USCscore8 < 0 || Texasscore < 0) {
			System.out.println("Invalid score entered! exiting the program");
			System.exit(0);
			}
		else if(USCscore8 > Texasscore){
			System.out.println("USC wins");
			win = win + 1;
		}
		else if (USCscore8 < Texasscore){
			System.out.println("USC looses");
			losses = losses + 1;
		}
		else if (USCscore8 == Texasscore){
			System.out.println("The game is a tie");
			tie = tie + 1;
		}
		System.out.println("Enter the score of the South Carolina Vs. Vanderbilit football game? Please enter South Carolina's total points:");
		
		int USCscore9 = key.nextInt();
		
		System.out.println("Please enter Vanderbilit's total points:");
		
		int Vanderbiltscore = key.nextInt();
		
		if (USCscore9 < 0 || Vanderbiltscore < 0) {
			System.out.println("Invalid score entered! exiting the program");
			System.exit(0);
			}
		else if(USCscore9 > Vanderbiltscore){
			System.out.println("USC wins");
			win = win + 1;
		}
		else if (USCscore9 < Vanderbiltscore){
			System.out.println("USC looses");
			losses = losses + 1;
		}
		else if (USCscore9 == Vanderbiltscore){
			System.out.println("The game is a tie");
			tie = tie + 1;
		}
		System.out.println("Enter the score of the South Carolina Vs. Missouri football game? Please enter South Carolina's total points:");
		
		int USCscore10 = key.nextInt();
		
		System.out.println("Please enter Missouri's total points:");
		
		int Missouriscore = key.nextInt();
		
		if (USCscore10 < 0 || Missouriscore < 0) {
			System.out.println("Invalid score entered! exiting the program");
			System.exit(0);
			}
		else if (USCscore10 > Missouriscore){
			System.out.println("USC wins");
			win = win + 1;
		}
		else if (USCscore10 < Missouriscore){
			System.out.println("USC looses");
			losses = losses + 1;
		}
		else if (USCscore10 == Missouriscore){
			System.out.println("The game is a tie");
			tie = tie + 1;
		}
		System.out.println("Enter the score of the South Carolina Vs. Wofford football game? Please enter South Carolina's total points:");
		
		int USCscore11 = key.nextInt();
		
		System.out.println("Please enter Wofford's total points:");
		
		int Woffordscore = key.nextInt();
		
		if (USCscore11 < 0 || Woffordscore < 0) {
			System.out.println("Invalid score entered! exiting the program");
			System.exit(0);
			}
		else if (USCscore11 > Woffordscore){
			System.out.println("USC wins");
			win = win + 1;
		}
		else if (USCscore11 < Woffordscore){
			System.out.println("USC looses");
			losses = losses + 1;
		}
		else if (USCscore11 == Woffordscore){
			System.out.println("The game is a tie");
			tie = tie + 1;
		}
		System.out.println("Enter the score of the South Carolina Vs. Clemson football game? Please enter South Carolina's total points:");
		
		int USCscore12 = key.nextInt();
		
		System.out.println("Please enter Clemson's total points:");
		
		int Clemsonscore = key.nextInt();
		
		if (USCscore12 < 0 || Clemsonscore < 0) {
			System.out.println("Invalid score entered! exiting the program");
			System.exit(0);
			}
		else if(USCscore12 > Clemsonscore){
			System.out.println("USC wins");
			win = win + 1;
		}
		else if (USCscore12 < Clemsonscore){
			System.out.println("USC looses");
			losses = losses + 1;
		}
		else if (USCscore12 == Clemsonscore){
			System.out.println("The game is a tie");
			tie = tie + 1;
		}
		
	//  The by using if else statements the input determine if USC will go to a bowl game this season.
		
		System.out.println("USC has " + win + " wins and has " + losses + " losses and " + tie + " ties.");
	
	//  Comparing a string expression asking the user if USC had a winning season. After this code it then states if USC will or will not go to a bowl game.
		System.out.println("Contestant: Does USC have a winning record based off of the results? Enter \"yes\" or \"no\":");
		
		String response = key.next();
		
		if(response.equalsIgnoreCase("yes")) {
			System.out.println("Congragulations you have had a winning season!"); 
		}
		else if(response.equalsIgnoreCase("no")) {
			System.out.println("Unfortantley USC did not have a winning season. Good Luck Next Year!");
		}
		else {
			System.out.println("You Entered a invalid response! Exiting the program");
			System.exit(0);
		}
		
		if (win <= 5 || tie >= 7) {
			System.out.println("USC will not go to a bowl game");
		}
		else if(win == 6){
			System.out.println("You will go to the AutoZone Liberty Bowl");
		}
		else if (win > 6 && win <=7){
			System.out.println("USC will go to the Transperfect Music City Bowl");
		}
		else if (win >= 8 && win <=9) {
			System.out.println("USC will go to the tax slayer bowl game");
		}
		else if (win > 9 && win <11) {
			System.out.println("USC will go to the orange bowl or the sugar bowl");
		}
		// in this case if South Carolina has 11 or 12 wins they go further to play a bowl game that could take them to the college football championship.
			if (win == 12) {
				System.out.println("USC will go to the peach bowl game");
				System.out.println("Please enter a random opponet to play in the peach bowl");
				String opponet1 = key.next();
				System.out.println("Please enter South Carolina's total points:");
				
				int USCscore13 = key.nextInt();
				
				System.out.println("Please enter " + opponet1 + "'s total points:");
				
				int opponetscore = key.nextInt();
				
				if (USCscore13 > opponetscore){
					System.out.println("USC wins and will play in the college football championship");
				}
				else if (USCscore13 < opponetscore){
					System.out.println("USC looses and will not play in the college football championship");
				}
			}
			else if (win == 11) {
				System.out.println("USC will go to the fiesta bowl game");
				System.out.println("Please enter a random opponet to play in the fiesta bowl");
				String opponet2 = key.next();
				System.out.println("Please enter South Carolina's total points:");
				
				int USCscore14 = key.nextInt();
				
				System.out.println("Please enter " + opponet2 + "'s total points:");
				
				int opponetscore = key.nextInt();
				
				if (USCscore14 > opponetscore){
					System.out.println("USC wins and will play in the college football championship");
				}
				else if (USCscore14 < opponetscore){
					System.out.println("USC looses and will not play in the college football championship");
				}
			}
			// User input validation
			else if (win < 0 || win > 14 || tie > 12) {
				System.out.println("Invalid record acheived! exiting the program");
				System.exit(0);
			}
		}
}
