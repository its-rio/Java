package assignment;

public class program1 {

	public static void main(String[] args) {
		// 1) Write a Java program to print the sum of 1 to 10 th natural numbers.
		int sum = 0;
		
		for(int i=1; i<=10; i++)
		{
			sum = i + sum;
		}
		System.out.println(sum);
	}

}
