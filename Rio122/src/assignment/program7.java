package assignment;

import java.util.Scanner;

public class program7 {

	public static void main(String[] args) {
		// 7) Write a Java program to check whether the entered number is Odd or Even.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
		sc.close();
	}

}
