package Class13;

import java.util.Arrays;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Today is Sunday";
		String day= str.substring(9);
		System.out.println(str.substring(6,8));
		System.out.println(day);
		char c= str.charAt(4);// Calling the method charAt on str object
		System.out.println(c );
		char[] charArr= str.toCharArray();
		System.out.print(Arrays.toString( charArr) );
		int index=str.indexOf("a");
		System.out.println(index);
		System.out.println(str.indexOf("a",6));
	}

}
