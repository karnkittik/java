
import java.util.Scanner;

public class KeyboardInput5 {
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		double b = kb.nextDouble();
		String c = kb.nextLine(); //next til end of line
		System.out.println(a+","+b+","+c);
		
	}

}