package dayfive;

abstract class bank{
	abstract int rateofinterest(); //only defined method
}

class PNB extends bank{
	int rateofinterest() {
		return 7;
	}
}

class SBI2 extends bank{
	int rateofinterest() {
		System.out.println("Rate is ");
		return 7;
	}
}

public class oop1Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b; 
		b = new PNB();
		System.out.println("Rate of interest is " + b.rateofinterest());
		
		b = new SBI2();
		System.out.print(b.rateofinterest());

	}

}
