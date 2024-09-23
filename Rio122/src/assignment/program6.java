package assignment;

import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		// 6) Write a Java program to check whether the entered number is Prime or not. 
		
		int n,count=0,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        n = sc.nextInt();
        i=1;

        while(i<=n){
            if(n % i == 0)
                count = count + 1;
            i = i + 1;
               
        }
        if(count == 2){
            System.out.println("Num is Prime");
        }else {
            System.out.println("Num is not Prime");
        }

        sc.close();
	}

}
