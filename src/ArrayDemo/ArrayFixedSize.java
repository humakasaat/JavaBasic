package ArrayDemo;

public class ArrayFixedSize {

	public static void main(String[] args) {
		
		int[]nums= new int[3];
		nums[0]=12;
		nums[1]=13;
		// by default 0 become 0
		System.out.println( nums[0]);
		 
		String[] colors=new String[4];
		colors[0]=" White";
		colors[1]=" pink";
		colors[2]=" Black";
		colors[3]=" Yellow";
		System.out.println( colors[2]);//.ArrayIndexOutOfBoundsException:3
	}

}
