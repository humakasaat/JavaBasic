import java.util.Scanner;

public class InputTask4 {

	public static void main(String[] args) {
		
	
		/*TODO Auto-generated method stub
		You are DMV representative and you need to ask customer their age. 
		If they are 18 and older you will issue a driver licence to them, otherwise you will offer them to get a learners permit.
	
	 */
		

		Scanner a = new Scanner( System.in);
		
		System.out.println( " how old are you? ");
		 
		
		
		double age= a.nextDouble();
		
		if( age>= 18) {
			
			System.out.println( "  issue driver licence");
		}
		else {
			System.out.println( "  get a learner permit");
			
		}
		

	}

}
