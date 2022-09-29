package ArrayDemo;

public class loopForEach {

	public static void main(String[] args) {
		//only when we deal with arrays or collections 
		//we can use for each loop, enhanced for loop, Advanced loop
		String[] iceCream= { "Vanila", "chocolate", " pistashio", " kulfi" , " mango"};
		for( String flavor: iceCream) {
		 System.out.println( flavor);
		 
		 
		
		}
 
		System.out.println( "----------------------------------------------------");
		 char []letters= { 'A', 'B' , 'C' , 'D'} ;
		 for( char letter:letters ) {
			 System.out.print( letter+ " ");
				}
		 System.out.println( "----------------------------------------------------");
			
		 int[]numbers= { 12, 56, 346, 1, 0, 9}; 
		 for( int i=0; i< numbers.length; i++) {
			 System.out.print( numbers[i]+ " ");
		 }
		 for( int num: numbers) {
			 System.out.print( num +" ");
				
		 }
	}

}
