package Student;
public class StudentTest1 {
	public static void main(String[] args) {
		Student s1 = new UndergraduateStudent("Toey");
		Student s2 = new GraduateStudent("Nat");
		Student s3 = new Student("Jump");
		
		//Polymorphism
		s1.printName();
		s2.printName();
		s3.printName();
		//s1.computCourseGrade ไม่ได้จะใช้ได้แค่ของ Student
		UndergraduateStudent s4 = new UndergraduateStudent("Titang");
		s4.computeCourseGrade();
	}
}
