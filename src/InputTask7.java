import java.util.Scanner;

public class InputTask7 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years and annual salary.
		 *  If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000, 
		 *  otherwise bonus=3000.

		 */

		Scanner a= new Scanner( System.in);
		
		 System.out.println( " Enter the number of your worke year and annual salary");
		 
		int year = a.nextInt();
		 int salary= a.nextInt();
		 
		 if(   year>= 5) {
		
			 System.out.println( "  You are eligble for bounce");
			 
			 if( salary> 50000) {
				 
				 System.out.println( "  Your bounce is 5000");
				 
			 } else {
				 System.out.println( "  Your bounce is 3000");
			 }
			 
		 }
		 else {
			 System.out.println( "  You are not eligble for bounce");
			 
		 }
		 
		 
		
				

		
		
	}

}
