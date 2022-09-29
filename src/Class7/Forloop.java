package Class7;

public class Forloop {

	public static void main(String[] args) {
		// print Hello 5 times

		for( int i= 1; i<= 5; i++) {
			System.out.println( " Hello");
		}
		System.out.println( " -------------------");
		// lets print num30 to 10
		for( int i=30;  i>=10; i--  ) {
			System.out.print( i+" ");
		}
		System.out.println( " -------------------");
		// lets print i 1-10 even number
		for( int i=0; i<=10; i+=2) {
			System.out.print( i+" ");	
		}
		System.out.println( " -------------------");
		int sum=0;
		for( int i= 1; i<=6; i++) {
			sum+=i;
		}
		System.out.print( sum);
	}

}
