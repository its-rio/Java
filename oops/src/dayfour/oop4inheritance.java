package dayfour;

// Multiple inheritance => one child & more than one parents achieved by interface in java

interface parent{
	void input();
}
interface parent2{
	void output();
}

class showable1 implements parent, parent2{
	public void input() {
		System.out.println("Give Input");
	}
	
	public void output() {
		System.out.println("Show Output");
	}
}

public class oop4inheritance {

	public static void main(String[] args) {
		
		showable1 sh = new showable1();
		sh.input();
		sh.output();
	}

}
