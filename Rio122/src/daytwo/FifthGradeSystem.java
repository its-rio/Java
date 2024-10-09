package daytwo;

import java.util.Scanner;

public class FifthGradeSystem {

	public static void main(String[] args) {
		// 90-100=A+ 80-90=A 70-80=B+ 60-70=B <60=fail

				Scanner sc = new Scanner(System.in);
 
				System.out.println("Enter your marks: ");

				int marks = sc.nextInt();

				

				if(marks > 90 & marks < 100) {

					System.out.println("Grade A+");

				}

				else if(marks > 80 & marks < 90) {

					System.out.println("Grade A");

				}

				else if(marks > 70 & marks < 80) {

					System.out.println("Grade B+");

				}

				else if(marks > 60 & marks < 70) {

					System.out.println("Grade B");

				}

				else if(marks > 50 & marks < 60) {

					System.out.println("Grade C");

				}

				else if(marks > -1 & marks < 50) {

					System.out.println("FAIL");

				}

				else

				{

					System.out.println("Invalid Input");

				}

				

				sc.close();
		
	}

}
