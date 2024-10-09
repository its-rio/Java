package daythree;

import java.util.Scanner;

public class SixthDowhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n, sum = 0;

		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number: ");

		

			do {

				n = sc.nextInt();

				sum = n + sum;

				System.out.println("Sum = " + sum);

				System.out.println("Enter next number ");

			}while(n != 0);

			

		System.out.println("Invalid Input -> Last Sum is " + sum);

		

		sc.close();
	}

}
