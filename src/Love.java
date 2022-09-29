import java.util.Scanner;

public class Love {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner=new Scanner(System.in);
		 
	        System.out.println("Do you love me");
	        
	        boolean loveIsReall=scanner.nextBoolean();

	        if(loveIsReall)
	        {
	            System.out.println(" Talk to my parents");
	            
	            int lovePercent=scanner.nextInt();


	            if(lovePercent>=100) 
	            {
	                System.out.println(" Bring rosses every day");
	                
	            }else if(noOfReplsSolved>10) 
	            {
	                System.out.println("you are doing ok Please complete them as soon as possible");
	            }else
	            {
	                System.out.println("You should solve some more repls");
	            }

	        }
	        else
	        {
	            System.out.println("They are very important to learn java please solve them");
	        }
			
		}

	}




	}

}
