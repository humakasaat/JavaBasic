import java.util.Scanner;

public class HomeWorkClass6 {

	public static void main(String[] args) {
		Scanner input= new Scanner( System.in);
		System.out.println( " Please enter your country");
        String country= input.nextLine();
        String language;
        switch( country) {
        case "India":
        	language="Hindi";
        	break;
        case "USA":
        	language="English";
        	break;
        	
        case "China":
        	language="chinese";
        	break;
        
        case "Afghanistan":
        	language="Pashtoo";
        	break;
        default:
        	language="Unknow";
        	break;	
        	
        }
        System.out.println( "You are from "+ country+ ", and your language is "+ language);

	}  
}
