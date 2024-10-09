package restart;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		if(num < 0) {
			System.out.println("Number is negative");
		}else if(num > 0) {
			System.out.println("Number is Positive");
		}else {
			System.out.println("Number is zero");
		}
		
		
	}

}
