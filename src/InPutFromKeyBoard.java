import java.util.Scanner;

public class InPutFromKeyBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Scanner is a class that helps us take the input from the Keybord
		 * it contians many 
		 */
		
		
		Scanner input= new Scanner( System.in);
		
		System.out.println( " please inter your name");
		
		 String name= input.next();
		 
		 System.out.println( " Hello" + name);
	}

}
