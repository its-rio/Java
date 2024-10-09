package daythree;

import java.util.Scanner;

public class FirstSwitch {

	public static void main(String[] args) {
		// 01

				System.out.println("Addition = 1, Subtraction = 2, Multiplication = 3, Division = 4");

				Scanner sc = new Scanner(System.in);

				System.out.println("Enter first value");

				int num1 = sc.nextInt();

				

				System.out.println("Enter second value");

				int num2 = sc.nextInt();

				

				System.out.println("Enter operation value");

				int operation = sc.nextInt();

				

				switch(operation)

				{

				case 1:

					System.out.println(num1 + num2);

				break;

				case 2:

					System.out.println(num1 - num2);

				break;

				case 3:

					System.out.println(num1 * num2);

				break;

				case 4:

					System.out.println(num1 / num2);

				break;

				default:

					System.out.println("Invalid Input");

				break;

				}

				

				sc.close();

	}

}
