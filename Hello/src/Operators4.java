

public class Operators4 {
	public static void main(String[]args) {
		int a = 3;
		int b,c,d;
		b = (c = (d = 0)) + 2;
		int x = 2; //cant x,y = 2,3 
		int y = 3;
		int t = x;
		x = y;     //cant x,y = y,x
		y = t;
		int q = 1+2+3-4/5; // quotient is rounded down
		System.out.println(q); 
		double e = 1.0 + 3; //can or int e = (int) 1.0 + 3; //cant int e = 1.0 + 3;
		//error 2**10
		double f = Math.pow(2, 10);
		System.out.println(5%3);
		System.out.println(-5%3);   // all the same +/- depend on the front 
		System.out.println(5%-3);
		System.out.println(-5%-3);
		int w =0;
		w += 1;
		w++;
		++w;
		w = 8;
		int r = ++w; // r=9
		r = w++; // r=8
		w--;
		--w;
		double z = Math.PI;
		z = Math.E;
		z = Math.max(z, 10.0);
		int u = 1/2; //0.5 rounded to 0
		double v = 1.0/2;
	
		
	}

}
