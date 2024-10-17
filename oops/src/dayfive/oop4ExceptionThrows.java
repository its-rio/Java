package dayfive;

public class oop4ExceptionThrows {
	// Method to check age
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
        
	}

	public static void main(String[] args) {
		
		try {
            checkAge(15); // calling the method
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Exception is caught here
        }
    }

}
