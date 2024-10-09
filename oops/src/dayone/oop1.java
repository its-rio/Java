package dayone;

public class oop1 {
//	non-parametirized method
	public void add() {
		int a = 20, b = 40;
		System.out.println("Addition is "+ (a+b));
	}

//	Parameterized method
	public void sum(int c, int d) {
		System.out.println("Sum is " + (c + d));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oop1 mv = new oop1();
		mv.add();
		mv.sum(15, 10);
	}

}
