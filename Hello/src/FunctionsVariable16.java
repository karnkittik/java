import java.util.Arrays;

public class FunctionsVariable16 {
	//global variable
	static int a = 8; //static variable
	
	static void g() {
		int a = 0; //local variable
		System.out.println(a);
	}
	public static void main(String[] args) {
		int[] d = { 3, 4, 2, 5, 0 };
		bubbleSort(d);
		System.out.println(Arrays.toString(d));
		System.out.println(f(20));
	}

	// static method
	static void bubbleSort(int[] d) {
		int n = d.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (d[j] > d[j + 1]) {
					int t = d[j];
					d[j] = d[j + 1];
					d[j + 1] = t;
				}
			}
		}

	}

	static int f(int n) {
		if (n < 2)
			return n;
		return f(n - 2) + f(n - 1);

	}
	static void h() {
		System.out.println(a+1); // global a+1
		
	}
	

}
