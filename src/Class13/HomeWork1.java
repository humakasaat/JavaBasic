package Class13;

public class HomeWork1 {

	public static void main(String[] args) {
		//5 TODO Auto-generated method stub
		String a = "any sentence";
        String[] arr = a.split(" ");
// reverse each character
        for (int k = 0; k < arr.length; k++) {
            for (int m = arr[k].length() - 1; m >= 0; m--) {
                System.out.print(arr[k].charAt(m));
            }
            System.out.print(" ");
	}

}}///6 How would you check if String is palindrome or not? aba=> true
//Abbc =>false
String a = "anna";
char[] b = a.toCharArray();
String c = "";

for (int i = b.length - 1; i >= 0; i--) {
    c += b[i];
}
System.out.println(c.equals(a));
}//String str1 = "chop";
String str2 = "non";
System.out.println("str1: "+str1);
System.out.println("str2: "+str2);

str1 = str1+str2;  // LifeBeautiful
System.out.println("-->After Swap<--");

str2=str1.substring(0,str1.length()-str2.length());
str1 = str1.substring(str2.length());



System.out.println("str1: "+str1);
System.out.println("str2: "+str2);
}
