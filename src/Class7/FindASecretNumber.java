package Class7;

import java.util.Scanner;

public class FindASecretNumber {

	public static void main(String[] args) {
		//Find a secret number
		int secretNumber = 7;

        Scanner scan = new Scanner(System.in);
        int input;

        do {
        System.out.println("Guess the number");
        input = scan.nextInt();

        }while (input != secretNumber );
        System.out.println("You won!");
   }
	}


