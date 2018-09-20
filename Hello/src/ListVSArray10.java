import java.util.Arrays;
import java.util.Scanner;

public class ListVSArray10 {

	public static void main(String[] args) {
		int n = 10;
		int[] fl = new int[23];
		int[] f = new int[n]; // array of ints
		f[0] = 0;
		f[1] = 1;
		for (int i = 2; i < f.length; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		for (int i = 0; i < f.length; i++)
			System.out.print(f[i] + ",");
		System.out.println(Arrays.toString(f));

		int[] a = new int[10];
		double[] b = new double[100];
		String[] s = new String[5];
		int[] m = { 1, 2, 3, 4, 5 };
		String[] t = { "mo", "ji" };
		m = new int[] { 1, 2, 3 }; // 2nd time have to use full form

		int sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i];
		}
		System.out.println(sum);
		
		sum = 0;
		for (int e : m) {
			sum += e;
		}
		System.out.println(sum);
		
		int[][] x = { {1,2,3},{4,5,6}};
		sum = 0;
		for (int  i=0; i<x.length; i++) {
			for (int j=0;j<x[i].length;j++) {
				sum += x[i][j];
			}
		}
		System.out.println(sum);
		sum = 0;
		for (int[] row: x) {
			for (int e : row) {
				sum += e;
			}
		}
		System.out.println(sum);
		System.out.println(Arrays.deepToString(x));
		int[] r = new int[5];
		r[r.length-1]+=1;
	}

}
