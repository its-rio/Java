package daytwo;

//Multilevel Inheritance => grand parent -> parent -> child

class Car{
	public void vehicle() {
		System.out.println("We Can Drive");
	}
}

class Maruti extends Car{
	public void affordable() {
		System.out.println("Ertiga is veri affordable car");
	}
}

class Tata extends Maruti{
	public void trust() {
		System.out.println("Tata is a SHAAN of India");
	}
}

public class oop2InheritanceMultilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tata tr = new Tata();
		tr.vehicle();
		tr.affordable();
		tr.trust();
	}

}
