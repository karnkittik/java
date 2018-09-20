import java.util.Scanner;
public class RepitionWhileFor8 {

	public static void main(String[] args) {
		int n = 2000;
		int b = 0;
		
		while (n>0) {
			b += 1;
			n /= 2;
		}
		System.out.println(b);
		
		int i;
		for(i=0; i<10; i+=2) {
			System.out.println(i);
			if (i==6) break;
		}
		System.out.println(i);
		

	}

}
