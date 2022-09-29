import java.util.Scanner;

public class HomeWork2Class6 {

	public static void main(String[] args) {
		// Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		//A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		//At the end your program should print which grade was entered by a user with explanation.
		Scanner input= new Scanner( System.in);
		System.out.println(" Enter your grade"); 
		String grade=input.nextLine();
		String result;
		switch (grade) {
		case( "A"):
			result=("Excelent");
		    break;
		case( "B"):
			result=("Good");
		    break;
		case( "C"):
			result=("Average");
		    break;
		case( "D"):
			result=("Bad");
		    break;
		    default:
		    result=" unknown";
		}
		
		System.out.println(" Your gradeis "+ grade+ " and result is " + result);
		
		
	}

}
