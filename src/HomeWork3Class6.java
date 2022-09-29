import java.util.Scanner;

public class HomeWork3Class6 {
 public static void main( String[]arg) {
 // Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
// Please complete this assignment in 2 ways: using if statement and switch case.
   Scanner scan= new Scanner( System.in);
   System.out.println( " please enter two numbers and operater");
   int num1=  scan.nextInt();
   char operater= scan.next().charAt(0);
   int num2= scan.nextInt();
   if (operater=='+') {
	   System.out.println( num1+num2);
   } else  if(operater=='-') {
	   System.out.println( num1-num2);
	   } else if (operater=='*') {
			   System.out.println( num1*num2);
	   } else if(operater=='/') {
		   System.out.println( num1/num2);
		   System.out.println( "-----------------------------------");
   int result;
    switch  (operater ){
    case'+':
    	result= num1+num2;
    	break;
    case'-':
    	result= num1-num2;
    	break;
    case'*':
    	result= num1*num2;
    	break;
    case'/':
    	result= num1/num2;
    	break; 		
    }
    
    System.out.println( " please enter two numbers and operater");
	
}


	
}}
