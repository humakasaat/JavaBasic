
public class NestedConditions {

	public static void main(String[] args) {
		int time = 5;
		String day = "Monday";
		
		
		// outer condition
		if(day.equals("Monday"))
		{
			// it is called outer if condition if it is true only inner condition will be checked , if it is false  nothing will executed
			 
			// as string is an non primitive we can't use == sign we have to use . equals 
			 
			// inner condition
			if (time > 7) {
				System.out.println(" lets go to office");
			}
			
			if(time < 6) {
				System.out.println(" let's sleep more");
			}
		 }
		 else {
			 System.out.println("Something else");
		 }
	}

}
