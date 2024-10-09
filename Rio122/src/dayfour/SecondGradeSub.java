package dayfour;

import java.util.Scanner;

public class SecondGradeSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter marks of maths ");

		float math = sc.nextInt();

		

		System.out.println("Enter marks of science ");

		float sci = sc.nextInt();

		

		System.out.println("Enter marks of english ");

		float eng = sc.nextInt();

		

		float percent = (math + sci + eng) / 300 * 100;

		System.out.println(percent);

		

		if(percent >= 90.00 & percent < 100) {

			System.out.println("Grade A+");

		}

		else if(percent >= 80.00 & percent < 90.00) {

			System.out.println("Grade A");

		}

		else if(percent >= 70.00 & percent < 80.00) {

			System.out.println("Grade B+");

		}

		else if(percent >= 60.00 & percent < 70.00) {

			System.out.println("Grade B");

		}

		else if(percent >= 50.00 & percent < 60.00) {

			System.out.println("Grade C");

		}

		else if(percent > -1 & percent < 50) {

			System.out.println("FAIL");

		}

		else

		{

			System.out.println("Invalid Input");

		}

		

		sc.close();
	}

}
