package daythree;

import java.util.Scanner;

public class FifthWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n, sum = 0;

		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number: ");

		while((n = sc.nextInt()) != 0)

			{

				sum = n + sum;

				System.out.println("Sum = " + sum);

				System.out.println("Enter next number ");

			}

		System.out.println("Invalid Input -> Last Sum is " + sum);

		

		sc.close();
	}

}
