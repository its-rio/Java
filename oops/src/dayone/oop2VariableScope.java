package dayone;

public class oop2VariableScope {
	int a = 20; //Global variable access everywhere 
	
	static int b = 10;   // static varible cannot changable & no need of object to call
	
	public void localvariable() {
		int c = 40;    // local variable is accessible in only local scope
		System.out.println("Localvarible=> " + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oop2VariableScope vr = new oop2VariableScope();
		System.out.println("Global Variable => " + vr.a);
		
		System.out.println("Static variable => " + b);
		
		vr.localvariable();
	}

}
