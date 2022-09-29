package Class7;

import java.util.Scanner;

public class JobDemo2 {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner ask = new Scanner(System.in);
	        String ans;
	        System.out.println(" Did you get a job" );
	        

	        do {
	            System.out.println("Did you get a job?");
	            ans = ask.nextLine();

	    }while(!ans.equalsIgnoreCase("Yes"));
	        System.out.println("Congratulations!!");

	}

}
