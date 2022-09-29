package ArrayDemo;

public class Class1 {

	public static void main(String[] args) {
		int[] array= new int[4];
		array[0]= 10;
		array[1]= 20;
		array[2]= 30;
		array[3]= 40;
		// accessing elements from the array
		System.out.println( array[2]); //30
		System.out.println( array[1]+ array[2]);
		
		// 
		String[] names= new String[5];
		names[0]= " Shah";
		names[1]= " Vera";
		names[2]= " Roman";
		names[3]= " Guljan";
		names[4]= " Huma";
		System.out.println( " Hello"+ names[1]);
		
		
	}

}
