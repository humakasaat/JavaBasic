package ArrayDemo;

public class ArrayHomeWork1 {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.
		int[] num = { -1, 23, 8, 456, -78, -234, -90 };

        int largest = num[0];

        for (int number : num) {
            if (number > largest) {
                largest = number;
            }
        }
        System.out.println(largest);
        
       //--------------------------------------------------------------------
         int largestnum= num[0];
         for( int n: num) {
        	 if( n> largest ) {
        		 largest=n;
        	 }
         }
	}

}
