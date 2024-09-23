package assignment;

import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {
		// 5) Write a Java program to check whether the entered number is Armstrong or not.
		
		int n,z,count=0,digit,pro=1,sum=0; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();
        z = n;
        while(z > 0){
            count = count + 1;
            z = z / 10;
        }

        z=n;
        while(z>0){
            digit = z % 10;
            for(int i=1; i<=count; i++){
            pro = pro * digit;
            sum = sum + pro;
            z = z / 10;
            }
            if(sum == n){
                System.out.println("Its Armstrong Number");
            }else {
                System.out.println("Not Armstrong Number");
            }
        }
        
        sc.close();
	}

}
