package Class7;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double coffee = 2.25;
        double pay;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("Please pay your order: ");
            pay = sc.nextDouble();

            if (pay > coffee) {
                System.out.print("Please give less. ");

                System.out.println();
            }

            else if (pay < coffee) {
                System.out.println("Please give more. ");

                System.out.println();

            } else
                System.out.println("Enjoy your coffee.");

            System.out.println();

        } while (coffee != pay);

    }


	}


