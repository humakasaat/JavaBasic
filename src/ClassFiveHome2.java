import java.util.Scanner;

public class ClassFiveHome2 {
	public static void main ( String[] arg) {
		
		/* 2.  Write a program for user to enter his/hers birth month. Based on the month define the season.
              Example: if user is born in March, April, May → season =”Spring”  season =”Summer”  etc …
         *    if user is born in June, July, August → 
                         
		 /*
		  */
		
		 System.out.println( "Enter your birth month");
		 
		 Scanner scan= new Scanner( System.in);
		 String birthMonth;
		 
		 String month= scan.nextLine();
		 
		 if( month.equals("December")|| month.equals("January")|| month.equals("February")) {
			
			 birthMonth= "Winter"; 
		
		 } else if ( month.equals("March")|| month.equals("April")|| month.equals("May")) {
			
			 birthMonth= "Spring";
		 
		 } else if ( month.equals("June")|| month.equals("July")|| month.equals("August")) {
				
			 birthMonth= "Summer";
		 
		 } else if ( month.equals("September")|| month.equals("October")|| month.equals("November")) {
			
			 birthMonth= "Fall";}
		 else {
			 
				 System.out.println( " Month is not valid");}
			 }
		 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
	
		
		
		
		
		
		
		
		
		
	} 
}
