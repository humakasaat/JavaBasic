import java.util.Scanner;

public class ClassFiveHomeWork1 {
 public static void main ( String[] arg) {
	//HW: 1. Write a program that will ask user to input inputs the current time (use 24 hour format).
	// Based on the given time define:
		// if hour is between 1-11 --> Morning
		// if hour between 12-15 --> Afternoon
		// if hour between 16-20 --> Evening
		// if hour between 21-24 --> Night
	 System.out.println( "What time is it?");
	 Scanner scan= new Scanner( System.in);
	 int time= scan.nextInt();
	 if ( time>=1 && time<=11) {
		 System.out.println( " It is morining"); 
	 } else if ( time>=12 && time<= 15) {
		 System.out.println( "It is afternoon");
	 } else if( time>=16 && time<=20) {
		 System.out.println( "It is evening");
	 } else if ( time>= 21&& time<= 24) {
		 System.out.println( " It is night");
	 } else {
		 System.out.println( " Invalid number");
	 }
	 
	
	
	
	
	 
 }
}
