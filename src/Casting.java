
public class Casting {

	public static void main(String[] args) {
		/*
		 *  Type casting => type= data type casting=> converting
		 *  
		 */
		byte box1= 127;
		short box2= 3333;//  smallest box.double the size of box1 in term of bits  16 bits
		
		int number1= 45454545; //  slightly large box. we can't store the decimal number in a box of type of double 
		long box5=  454545445;// large box most commonly used
		
		float box6= 414564545;// slightly large box
		double box7=  454545454; // largest
		
		int number= (int)15.2;
		System.out.println(number);
		
		byte smallerBox= (byte)box2;
		
		System.out.println( smallerBox);
		
		long smallerBox2= (long)box2;
		
		short biggerBox= box1;
		float Box8= (float)box6;// as box6 is larger it is 
		char a= (char)66;
		// char we single character 
		System.out.println( a);
		int box9= (int) box5;
		System.out.println( box9);

		
	}

}
