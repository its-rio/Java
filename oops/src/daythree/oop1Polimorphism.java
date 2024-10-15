package daythree;
// compile time polymorphism / Method overloading => 
                                       //same name of function with different parameters

public class oop1Polimorphism {
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public void sum(double c, double d) {
		System.out.println(c+d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oop1Polimorphism poly = new oop1Polimorphism();
		poly.sum(23, 12);
		poly.sum(12.45, 25.32);
	}

}
