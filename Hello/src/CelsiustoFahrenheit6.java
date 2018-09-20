

import java.util.Scanner;

public class CelsiustoFahrenheit6 {
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("c = ");
		double c = kb.nextDouble();
		double f = 9.0/5*c + 32;
		System.out.println("f = "+f);
		
	}

}
