import java.util.Scanner;

public class InputTask2 {

	public static void main(String[] args) {
		
		/*
		 * Create a Java program and store values of mortgage rate and mortgage price. First, program should check if rate is higher than 4.5 user will not buy a house,
		 *  otherwise user will consider buying. Once user decides to buy a house, if price of the house is larger than 200000 than user will take a loan,
		 *   otherwise user will pay cash
		 */
		
		
		Scanner userInput = new Scanner( System.in);
		
		double rate;
		
		
		System.out.println("Please enter the mortgage rate: ");
		
		rate = userInput.nextDouble();
		
		if( rate > 4.5) {
			
			System.out.println(" will not buy a house. ");
			
		}
		else {
			System.out.println("Please enter price: ");
			
			double price = userInput.nextDouble();
			
			
			if ( price> 200000) {
				
				System.out.println(" you can take a loan ");
				
			} 
			else {
				System.out.println(" you have pay with cash ");
				
				
			}
		}
		

	}

}
