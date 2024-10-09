package daytwo;

import java.util.Scanner;

public class ThirdSimpleIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Simple if

				Scanner sc = new Scanner(System.in);

				System.out.println("Enter your Age ");

				int age = sc.nextInt();

				

				if(age >= 18) {

				System.out.println("Eligible for voting");

				}

				else {

					System.out.println("You are not eligible for voting");

				}

				

				sc.close();
	}

}
