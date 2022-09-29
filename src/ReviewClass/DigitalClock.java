package ReviewClass;

public class DigitalClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int h=00; h<=23; h++) {
	           for (int m=1; m<=59 ; m++) {

	           if (h<=9 && m<=9) {
	               System.out.println("0"+h+":"+"0"+m);
	           }else if (h>9 && m<=9) {
	               System.out.println(h+":"+"0"+m);
	           }else if (h<=9 &&m>9) {
	               System.out.println("0"+h+":"+m);
	           }

	           else {
	               System.out.println(h+":"+m);
	           }
	           }
	}

}}
