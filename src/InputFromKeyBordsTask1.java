import java.util.Scanner;

public class InputFromKeyBordsTask1 {

	public static void main(String[] args) {
		/*
		 * Write a program to store a boolean value of whether user has diploma or not. 
		 * If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree. 
		 * Then if user has a degree program should check a gpa score. If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”, otherwise →
		 *  “You should have studied harder” .
		 
		 */

		 
		 Scanner scanner= new Scanner( System.in);
		 
		 System.out.println("Do you have a diploma or not please enter true or false");
		 
		 boolean haveDiploma= scanner.nextBoolean();
		 
		 if( haveDiploma)
		 {
			 
			 System.out.println("Congratulation");	
			 
			 // ask the user for their gpa score and store it in a var
			 System.out.println("Please enter your gpa: ");
			 float gpa = scanner.nextFloat();
			 
			 if(gpa >= 3.5) {
				 System.out.println("You are elgible for a scholarship.");
			 }
			 else {
				 System.out.println("You should have studied harder to get a scholarship.");
			 }
		 }
		 else 
		 {
			 System.out.println("Please get a degreee.");
		 }
	}	 	
}
