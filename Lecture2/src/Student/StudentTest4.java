package Student;

public class StudentTest4 {
	public static void main(String[] args) {
		Student s;
		GraduateStudent g = new GraduateStudent("Nat");
		UndergraduateStudent u = new UndergraduateStudent("Toey");		
		s = g; //belongs to GraduateStudent
		s.printName();		
		s = u; //belongs to UndergraduateStudent
		s.printName(); //Dynamic Binding: same code different result depends on what it belongs to
	}
}
