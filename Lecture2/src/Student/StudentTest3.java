package Student;

public class StudentTest3 {
	public static void main(String[] args) {
		// หนึ่งลูกมีได้แค่หนึ่งแม่
		// upcasting (automatically) เปลี่ยนจากลูกไปเป็นแม่
		Student s1 = new GraduateStudent("Nat"); //สร้างแบบGraduate ใช้งานแบบ Student
		s1.printName();
		// downcasting (manually) � may have problem
		Student s = new Student("Luck");
		UndergraduateStudent s2 = (UndergraduateStudent) s; // แม่มาเป็นลูก จะกำกวม ต้องเติม Casting
		//ทำเพื่อใช้ของลูกได้
	}
}
