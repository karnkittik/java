package Student;

public class CastingTest {

	public static void main(String[] args) {
		int a = 10;
		long b = 20; //8bytes
		int c = (int) b;  //4bytes เก็บใหญ่ใส่ในเล็กไม่ได้ ต้องใช้ casting operator
		long d = a; //เก็บเล็กใส่ในใหญ่ได้
		float f = (float) 7.5f; //default จะมองเป็นdouble 8bytes ต้องเติม literal or casting operator
	}

}
