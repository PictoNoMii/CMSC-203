/**
   This program demonstrates how numeric types and operators behave in Java
*/
import java.util.Scanner;
public class NumericTypes {
	public static void main (String [] args) {
		Scanner keyboard = new Scanner(System.in); //TASK #2 Create a Scanner object here 
		//identifier declarations
		double x = 9;
		final double NUMBER = 2; // number of scores
		int score1 = 100; // first test score
		int score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		int temp; //Task #2 declare a variable to hold the user’s temperature
		System.out.print("What is your first scrore?"); //Task #2 prompt user to input score1
		score1 = keyboard.nextInt(); //Task #2 read score1 
		System.out.print("What is your second score?"); //Task #2 prompt user to input score2
		score2 = keyboard.nextInt(); //Task #2 read score2 
		// Find an arithmetic average
		average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = 5*(BOILING_IN_F - 32) /x;
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		System.out.print("Enter another temperature in Fahrenheit"); //Task #2 prompt user to input another temperature
		temp = keyboard.nextInt(); //Task #2 read the user’s temperature in Fahrenheit
		fToC = 5*(temp - 32) /x; //Task #2 convert the user’s temperature to Celsius
		output = temp + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);//Task #2 print the user’s temperature in Celsius
		keyboard.close();
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}