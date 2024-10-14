package daytwo;

//Hirarchichal Inheritance => one parent many child

class RBI{
	public void rateOfinterest() {
		System.out.println("RBI Rate of Interest 7% to 10%");
	}
}

class BOB extends RBI{
	public void bobROI() {
		System.out.println("8%");
	}
}

class SBI extends RBI{
	public void sbiROI() {
		System.out.println("9%");
	}
}

public class oop3InheritanceHirarchichal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOB bk = new BOB();
		bk.bobROI();
		bk.rateOfinterest();
		
		SBI sk = new SBI();
		sk.sbiROI();
		sk.rateOfinterest();
	}

}
