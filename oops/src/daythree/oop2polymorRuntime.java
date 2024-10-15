package daythree;

//Run time polymorphism / Method Overriding => 
//same name of function with same parameters achieve by inheritance

class Employee{
	public void upgrade() {
		System.out.println("Upgradation of the content");
	}
}

class Student extends Employee{
	public void upgrade() {
		System.out.println("Upgradation");
	}
}

public class oop2polymorRuntime {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sc = new Student();
		sc.upgrade(); 
	}

}
