package assignment;

import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
		// 3) Write a Java Program to Check if a Number is Positive or Negative or Zero.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("Negative");
		}
		else if(num > 0) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Num is zero");
		}
		
		sc.close();
	}

}
