package Class12;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
		Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

		 */
		String userName=" user1";
		String password= "pass123";
		String conformPasword= "pass123";
		if( userName.isEmpty ()&& password.isEmpty()) {
			System.out.println( " user name and password cannot be empty");
			
		} else if( password.length()<8){
			System.out.println( " password is too short");
			
			
		} else if(password.contains(userName)  ) {
			System.out.println( " password can not contain user name");
			
		} else if(  !password.equals(conformPasword)) {
			
			System.out.println( " password do not match");
		} else {
			System.out.println( " Your username and password has been created");
		}

	}

}
