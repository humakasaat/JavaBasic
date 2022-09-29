package ReviewClass;

import java.util.Scanner;

public class LoopDemo3 {

	public static void main(String[] args) {
		// 
		Scanner input= new Scanner( System.in);
		
		System.out.println( " Enter a number");
		
		int i= input.nextInt();
		
		while ( i!=10) {
			System.out.println(i);
			int a= input.nextInt();
		}
		
 
	}

}
