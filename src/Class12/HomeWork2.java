package Class12;

import java.util.Arrays;

public class HomeWork2 {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday → yadnuS).
		String str= " Sunday";
		
		char[] ch= str.toCharArray();
		String reve=" ";
		for( int i= ch.length-1; i>0; i--) {
			reve+=ch[i];
			System.out.print(ch [i]);
			
			
			
		}
		
		
	}

}
