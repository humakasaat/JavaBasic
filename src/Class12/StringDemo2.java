package Class12;

public class StringDemo2 {

	public static void main(String[] args) {
		// 
		String firstName= "Huma";
		
		String lastName="Kasaat";
		
		System.out.println(firstName+lastName);
		
		System.out.println(firstName. concat(" ").concat(lastName) );
		
		String str= " ";
		// isEmpty () returns true if a string is empty this method is this method will return false even if you have a space 
		// in a string variable however this is isBlanlk doesn't count the space 
		
		System.out.println(str.isEmpty ());
		
		System.out.println(str.isBlank ());
	}

}
