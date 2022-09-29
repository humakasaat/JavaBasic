import java.util.Scanner;

public class InputTask6 {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if user has a credit card or not. 
		 * If you user does not have a credit card then offer them. If they do have one ask what is balance on the card? If balance of the card is larger than 1000, tell them to pay off immediately,
		 *  otherwise you can tell them that they can spend more.
		 */

		Scanner a= new Scanner( System.in);
		
		 System.out.println( " Do you have  credit card or not?");
		 
		boolean haveCreditCard = a.nextBoolean();
		
		if(haveCreditCard) {
			System.out.println("What's the balance on the card? ");
			double balance = a.nextDouble();
			
			if(balance > 1000) {
				System.out.println("Please pay off immediately.");
			} else {
				System.out.println("You have can spend more.");
			}
		} else {
			System.out.println("I'd like to offer a credit card for you.");
		}
		
	
	}

}
