package Class12;

public class phoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  /*
         * if class whos object we are creating
         * is present inside the same package
         * we don't need to import it.
         */
        Phone iphone=new Phone();
        iphone.make="Apple";
        iphone.model="Iphone 14 Pro Max";
        iphone.year=2022;
        iphone.storage=128;
        iphone.makeCall();

        //new Phone() => To Create the object
        Phone samsungPhone=new Phone();
        samsungPhone.model="S22 Ultra";
        samsungPhone.make="Samsng";
        samsungPhone.year=2022;
        samsungPhone.makeCall();

	}

}