
import java.util.Scanner;

public class SelectionIfElse7 {
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("m = ");
		int m = kb.nextInt();		
		if (m==4||m==6||m==9||m==11) {
			System.out.println("end with yon");
			System.out.println("OK?");
		}
		else if(m==2) {
			System.out.println("Feb");
		}
		else {
			System.out.println("Kom"); //if there only one line { } is not necessary
		}
		int a = (5 >= 2) ? 6 : 3;
		System.out.println(a);
	}

}
