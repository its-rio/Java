package dayfive;

// Try...catch block

public class oop2ExceprionHandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12, b = 0;
		try {
			int c = a / b;
			System.out.println("Ans is" + c);
		}
		catch(Exception e) {
			System.out.println("zero is not divisible by any number");
		} 
	}

}
