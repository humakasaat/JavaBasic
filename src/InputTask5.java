import java.util.Scanner;

public class InputTask5 {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask user to input city and temperature. Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ” 
		 */
		Scanner a= new Scanner( System.in);
		
		 System.out.println( " Enter your city name");
		 
		String city = a.nextLine();
		
		 System.out.println( " Enter tempreature in F");
		 
		 float temp = a.nextFloat();
		 
		 
		float c = (temp - 32f)*(5f/9f);
		
		 System.out.println( "The template in the city " + city + " is " + c + " C.");
		 
				

	}

}
