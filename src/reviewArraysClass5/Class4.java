package reviewArraysClass5;

import java.util.Arrays;
import java.util.Scanner;

public class Class4 {

	public static void main(String[] args) {
		// 
		Scanner scanner= new  Scanner(System.in);
		System.out.println( " Please enter the number of dresses you want to buy");
		int size= scanner.nextInt();
		double [] prices=new  double[size];
		for( int i=0; i<size; i++) {
			System.out.println( " Please enter the price of dress no" +(i+1));
			prices[i] = scanner.nextDouble();
		}
		 System.out.println( Arrays.toString( prices));
		 double sum=0;
		 for( double price: prices) {
			 sum+=price;
			 
		 }
		 System.out.println( " Total for all the dresses ="+ sum);
		 // limitation of enhanced  for loop 
		 // we can only go one direction
		 //we can't skip the elements
		 // we can't use enhanced  for loop to update the elements in an array
		 // we can only use it to access the element
	}

}
