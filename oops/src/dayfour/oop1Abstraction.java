package dayfour;

abstract class petanimal{
	abstract void cow();
}

class buffalo extends petanimal{
	void cow() {
		System.out.println("Cow is a pet animal");
	}
}

public class oop1Abstraction {

	public static void main(String[] args) {
		buffalo b = new buffalo();
		b.cow();
		
		// This type of calling only allowed in abstraction
		petanimal p = new buffalo();
		p.cow();

	}

}
