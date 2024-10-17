package dayfive;

public class oop5ExceptionThrows {
	// Method that declares it can throw an ArithmeticException
    static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            // Throwing an exception if division by zero occurs
            throw new ArithmeticException("Cannot divide by zero.");
        } else {
            System.out.println("Result: " + a / b);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            // Calling the method that declares an exception
            divide(10, 0);
        } catch (ArithmeticException e) {
            // Handling the exception thrown by the method
            System.out.println("Exception caught: " + e.getMessage());
        }

	}

}
