package assignment;

import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {
		// 4) Write a Java program to print the Reverse of a number. 
		
		int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter the number: ");
        num = sc.nextInt();
        int rev = 0;
        while(num>0){
            rev = (rev * 10)+ num % 10;
            num = num/10;
        }
        System.out.println("Reverse value: "+rev);

        sc.close();
	}

}
