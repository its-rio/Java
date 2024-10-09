package daytwo;

import java.util.Scanner;

public class SecondEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Simple even odd

				Scanner sc = new Scanner(System.in);

				System.out.println("Enter Number ");

				int num = sc.nextInt();

				

				if(num % 2 == 0) {

				System.out.println("Number is EVEN");

				}

				else {

					System.out.println("Number is ODD");

				}

				

				sc.close();
	}

}
