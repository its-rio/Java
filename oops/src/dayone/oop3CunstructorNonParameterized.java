package dayone;
// Prameterised constructor
class Student{
	public Student() {
		System.out.println("Studying");
	}
	public Student(String Lang) {
		System.out.println(Lang);
	}
}

public class oop3CunstructorNonParameterized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Student s1 = new Student("JAVA");
	}

}
