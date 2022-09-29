import java.util.Scanner;

public class InputFromKeyBord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner( System.in);
		System.out.println(" Pleas enter your age");
		
		int age= scanner.nextInt();// we use nextint we we want an int type of data
		if ( age<18) {
			 System.out.println(" You should studay");
		}
		else {
			System.out.println(" You should start working");
			
		}
	}

}
