public class NestedCondation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int time= 9;
		String day= "Monday";
		
		
		// outer condation
		 if( day.equals(" Sunday")) {       // it is called outer if condition if it is true only inner condition will be checked , if it is false  nothing will executed
			 
		
	// as string is an non primitive we can't use == sign we have to use . equals 
			 
			 // inner condition
			 if (time> 7) {
				 System.out.println(" lets go to office");
				if( time< 6) {
						System.out.println(" let's sleep more");
				}			 
			}
		 }
	}

}