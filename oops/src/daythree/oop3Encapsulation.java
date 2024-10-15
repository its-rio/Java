package daythree;

// private method only accessible from main class of file
class A{
	private void methodprivate2() {
		System.out.println("Showing private method");
	}
}

public class oop3Encapsulation {
	public void methodpublic() {
		System.out.println("Showing public method");
	}
	
	protected void methodprotected() {
		System.out.println("Showing protected method");
	}
	
	private void methodprivate() {
		System.out.println("Showing private method");
	}

	// private method only accessible within a same class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oop3Encapsulation en = new oop3Encapsulation();
		en.methodpublic();
		en.methodprotected();
		en.methodprivate();
		
		A a1 = new A();
		//a1.methodprivate2();
	}

}
