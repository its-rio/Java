package assignment;

import java.util.Scanner;

public class program10 {

	public static void main(String[] args) {
		// 10) Write a Java Program to Swap two numbers without using third variable.

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // Displaying numbers before swap
        System.out.println("Before swap: a = " + a + ", b = " + b);

        // Swapping without using a third variable
        a = a + b;  
        b = a - b;  
        a = a - b;  

        // Displaying numbers after swap
        System.out.println("After swap: a = " + a + ", b = " + b);

        sc.close();
	}

}
