
public class SwichDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char choice= 'Y';
		 
		String answer = null;
		
		switch(choice) {         // can not work with boolean
	
		 
		case 'Y':                //can not work with decimals
			answer= " Yes";
			                     //   can't work with    logical operators
			break;
		 
		case'N':
			 answer=" No";
			 
			 break;
		 
		case 'M':
			
			answer=" Mabye";
			
			break;
			 
		default:
			answer="Unknow";
			break;
				
			
		}
		
		
		
		System.out.println(answer );
		
	}

}
