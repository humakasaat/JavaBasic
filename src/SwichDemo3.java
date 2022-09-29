import java.util.Scanner;

public class SwichDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we need to ask a user where she/he is from
		//
		
	 Scanner in= new Scanner( System.in);
	 System.out.println( "Please tell me where are you from");
	 String country= in.nextLine();
	 String favoriteFood;
	 switch( country) {
	 case "USA":
         favoriteFood= "burgers andfries";
         break;

     case "Moldova":
         favoriteFood="mamaliga";
         break;

     case "Turkey":
         favoriteFood="arepa";
         break;
     case "India":
         favoriteFood="chicken curry";
         break;
     case "Yemen":
         favoriteFood="mandi";
         break;
     case "Morocco":
         favoriteFood="couscous";
         break;
     case "Afganistan":
         favoriteFood="qaboli palow";
         break;
     default:
         favoriteFood="Unknown";
         break;
     }
     System.out.println("You are from " + country+ " and your favorite food is "+ favoriteFood);
     }

 

	 }
	 

	


