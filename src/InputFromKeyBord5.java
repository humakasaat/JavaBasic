import java.util.Scanner;

public class InputFromKeyBord5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		 Scanner scanner=new Scanner(System.in);
		 
	        

	        boolean solvedAnyRepls=scanner.nextBoolean();

	        if(solvedAnyRepls)
	        {
	            System.out.println("How many Repls you solved");
	            
	            int noOfReplsSolved=scanner.nextInt();


	            if(noOfReplsSolved>=17) 
	            {
	                System.out.println("you are doing great");
	                
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


