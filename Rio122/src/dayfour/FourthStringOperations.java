package dayfour;

public class FourthStringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome";		
		String s1 = "java";		
		String s2 = "Welcome in Java";				
		System.out.println("Find length " + s.length());		
		System.out.println("To uppercase " + s.toUpperCase());		
		System.out.println("To Lowercase " + s2.toLowerCase());				
		
		// Concatination
		
		System.out.println("use concat => " + s.concat(s1));		
		System.out.println("use concat user defined => " + s.concat("to my Home"));				
		
		//equal		
		System.out.println("use of equals => " + s.equals(s1));		
		
		//equalsIgnore		
		System.out.println("use of equalsIgnore => " + s.equalsIgnoreCase("Welcome"));
	}

}
