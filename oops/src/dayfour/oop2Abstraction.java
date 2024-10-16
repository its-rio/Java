package dayfour;

abstract class bank{
	abstract void RBI(); //only defined method
}

class SBI extends bank{
	void RBI() {
		System.out.println("Reserve Bank of india is an monetory reserve in india");
	}
}

// Add one non-abstract class 
class Rajasthan{
	public void state() {
		System.out.println("Rajasthan is a state in india");
	}
}



public class oop2Abstraction {

	public static void main(String[] args) {
		SBI s = new SBI();
		s.RBI();
		
		// Another technique 
		bank b = new SBI();
		b.RBI();
		
		// call non-abstract class
		Rajasthan r = new Rajasthan();
		r.state();
	}

}
