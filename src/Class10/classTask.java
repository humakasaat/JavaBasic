package Class10;

public class classTask {

	public static void main(String[] args) {
		// Create a 2D array (longer way)where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		//After storing values print following String:
			//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
      String[][] bigArray= new String [2][4];
    		//1 row
 	        bigArray[0][0]=" Mr";
 	        bigArray[0][1]="Mrs";
 	        bigArray[0][2]=" Ms";
 	        bigArray[0][3]=" Miss";
 	        //2 row
 	        bigArray[1][0]="Smith ";
 	        bigArray[1][1]=" Obama,";
 	        bigArray[1][2]=" Jackson";
 	        bigArray[1][3]="Jordan";
 	        
         System.out.println(bigArray [0][1] +bigArray [1][2]);
     }
	}


