import java.util.Scanner;

public class ClassTask1 {

	public static void main(String[] args) {
		
		// Prompt the user to enter person heights in inches. Person should be classified as one of the following:
		//• short (under 60 inch)
		//	• medium(between 60 -72 inch)
		//	• tall (over 72 inch)
		
		
		Scanner input= new Scanner( System.in);
		System.out.println(" Enter your height in inches");
		int height= input.nextInt();
		if ( height<60) {
			System.out.println(" You re short");
		}
	   else if ( height>60 && height> 72)
		System.out.println(" You are medium");
		else ( height>72) {
			System.out.println(" You are Tall");
		}
	}

}
