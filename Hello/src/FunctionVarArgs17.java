
public class FunctionVarArgs17 {

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println(prod(1.0, 2));
		System.out.println(prod(1, 2, 3));
		System.out.println(produ(1, 2, 3, 4));
		System.out.println(produ(1, 2, 3, 4, 5, 6, 7));
		for (String k : args) {
			System.out.print(k+" "); //main varargs
		}
	}

	// method overloading
	static double prod(double a, double b) {
		return a * b;
	}

	static double prod(double a, double b, double c) {
		return a * b * c;
	}

	// varargs in Java 
	static double produ(double a, double... args)// array
	{
		double p = a;
		for (double x : args) {
			p *= x;
		}
		return p;
	}
}
