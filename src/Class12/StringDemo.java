package Class12;

public class StringDemo {

	public static void main(String[] args) {
		
		// it counts a number a character in a string including the spaces
		// proper way of creating an object
		String str= new String( " Java");
		// simple and shorter way provided by Java
		String name= " Asma Alfadhli the Great"; // only works for String and Wrapper
		
		System.out.println( str.length());
		
		System.out.println( name.length());
		if ( name.length()>15) {
			System.out.println( " Name can't be more than 15 characters");
		}
	}

}
