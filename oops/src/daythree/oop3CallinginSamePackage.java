package daythree;
import daythree.oop3Encapsulation;

public class oop3CallinginSamePackage {

	public static void main(String[] args) {
		// In same package we can able  to import the public and protected methods
		oop3Encapsulation em = new oop3Encapsulation();
		em.methodpublic();
		em.methodprotected();
	} 

}
