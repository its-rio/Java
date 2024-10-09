package restart;

import java.util.Scanner;

public class ArrayofnumInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of array: ");
		size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter value of array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Inputted Array : ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
