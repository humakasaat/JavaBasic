import java.util.Scanner;

public class InputTask3 {

	public static void main(String[] args) {
	/*
	 * You are a loan specialist and you need to ask user what is the amount of loan is needed. 
	 * If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
		/*
		 *
		 */
		

		Scanner a = new Scanner( System.in);
		
		System.out.println( " the amount of loan is needed ");
		 
		
		
		double amountOfloan= a.nextDouble();
		
		if( amountOfloan<= 200000) {
			
			System.out.println( " reject");
		}
		else {
			System.out.println( "  would lend the money");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
