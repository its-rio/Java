package dayfour;

interface printable{
	void input();
	void output();
}

class showable implements printable{
	public void input() {
		System.out.println("Give Input");
	}
	
	public void output() {
		System.out.println("Show Output");
	}
}

public class oop3Interface {

	public static void main(String[] args) {
		showable sh = new showable();
		sh.input();
		sh.output();
		// Calling methods using parent and child this is applicable in abstraction only
		printable pr = new showable();
		pr.input();
		pr.output();

	}

}
