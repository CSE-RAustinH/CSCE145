//Austin Harrelson
import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		//imports a scanner to allow user input
		Scanner key= new Scanner(System.in);
		
		// Asking the user to input their first name
		System.out.println("What is your first name?");
		
		String firstname = key.nextLine();
		
		// Asking the user to input their last name
		System.out.println("What is your last name?");
		
		String lastname = key.nextLine();
		
		//Asking the user to input their age
		System.out.println("What is your age?");
		
		int currentage = key.nextInt();
		
		//Asking the user to input the current year so that later on in the program, I can calculate their birth year
		System.out.println("Enter the current year: ");		
		
		int currentyear = key.nextInt();
		
		//Math equation to calculate the birth year
		int birthyear = currentyear - currentage;
		
		//Asking the user to enter today's date in a specific format
		System.out.println("Enter todays date (using the format: mm/dd/yyyy):");
		
		key.nextLine();
		
		String date;
		
		date = key.nextLine();
		
		//Assigned a specific substring for each part of the year so it can be converted into another format
		String day = date.substring(0,2);
		
		String month = date.substring(3,5);
		
		String year = date.substring(6,10);
			
		//Asking the user to input their phone number
		System.out.println("What is your phone number?");
		
		String phone = key.nextLine();
		
		/*
		 * I assigned a substring to the digits given by a phone number and separated those into three separate substrings.
		 */		
		String areacode = phone.substring(0,3);
		
		String firstthree = phone.substring(3,6);
		
		String lastfour = phone.substring(6,10);
		
		//Asking the user to input their major
		System.out.println("What is your major?");
		
		String major;
		
		major = key.nextLine();
		
		//Asking the user to input their year in college
		System.out.println("What is your year in college?");
		
		String yearinschool;
		
		yearinschool = key.nextLine();
		
		//Asking the user to input their favorite genre of music
		System.out.println("What is your favorite genere of music?");
		
		String music;
		
		music = key.nextLine();
		
		//Asking their user for their favorite number
		System.out.println("What is your favriote number?");
		
		String number;
		
		number = key.nextLine();
		
		//Asking the user to input their favorite subject in school
		System.out.println("What is your favorite subject in school?");
		
		String subject;
		
		subject = key.nextLine();
		
		//Gives an intro of the user based on their input
		System.out.print("Here's a quick intro for: " + firstname +" " + lastname + "\n	You are " + currentage + " years old. Your favorite subject in school is " + subject + " and your favorite genre of music is " + music + ".\nYour favorite number is " + number + ". You are a " + yearinschool + " at USC majoring in " + major + ".\nYou can be reached at: (" + areacode + ")"  + firstthree + "-" + lastfour + ". You are now officially a Gamecock!\nLast Updated: " + day + "." + month + "." + year);
		}
	}
