package dayfour;

import java.util.Scanner;

public class ThirdArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array: ");

		int size = sc.nextInt();

		

		int array[] = new int[size];

		

		System.out.println("Enter elements of array");

		

		for(int i=0; i<size; i++) {

			array[i] = sc.nextInt();

		}

		System.out.println("array elements");

		for(int i=0; i<size; i++) {

			System.out.println(array[i]);

		}

		sc.close();
	}

}
