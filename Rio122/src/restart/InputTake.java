package restart;

import java.util.Scanner;

public class InputTake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a and b");
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Sum is " + (a+b));
		
		sc.close();
	}

}
