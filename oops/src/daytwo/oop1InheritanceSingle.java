package daytwo;

// Single Inheritance => parent -> child

class Animal{
	public void sound() {
		System.out.println("Animals create sound");
	}
}

class Lion extends Animal{
	public void roar() {
		System.out.println("Lions are Roar loudly");
	}
}

public class oop1InheritanceSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l1 = new Lion();
		l1.sound();
		l1.roar();
	}

}
