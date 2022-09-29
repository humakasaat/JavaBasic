package Class11;

public class Hw1Phone {
 //Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel,
	//Samsung with specific  attributes and behaviors.
	
	String make;
	String model;
	String color;
	int storage;
	double size;
	void call() {
		System.out.println( "Make a call using........");
	}
	void takingpicture(){
		System.out.println(" Taking pictures");
	}
	public static void main( String[]arg) {
		Hw1Phone iphone= new Hw1Phone();
		iphone.make= " Apple";
		iphone.model=" iphone 14 plus";
		iphone.color="Blue ";
		iphone.storage=128;
		iphone.size=6.7;
		
		System.out.println("Make"+iphone.make+ " Model"+ iphone.model);
		iphone.takingpicture();
		System.out.println( "********");
		Hw1Phone pixel= new Hw1Phone();
		pixel.make=" Google";
		pixel.model=" Pixel 6a";
		pixel.color="Charcoal ";
		pixel.storage=128;
		pixel.size=6.1;
		System.out.println( " Whit"+ pixel.model+ " You can enjoy Rich and vibrant photos come out at night" +" made by"
		+ pixel.make);
		Hw1Phone samsung= new Hw1Phone();
		samsung.make="Samsung ";
		samsung.model=" Galaxy z fold4";
		samsung.color="Graygreen ";
		samsung.storage=256 ;
		samsung.size= 6.2;
		System.out.println(  samsung.make+ samsung.model+" color "+ samsung.color+ " size "+ samsung.size+"  storage " +samsung.storage);
		
	}

}
