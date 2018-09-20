import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class String9 {
	public static void main(String[] args) {
		String s = "   I am a string ";
		char c = 'x';
		String t = s + s;
		t = s + 2 + 3;
		System.out.println(t); //s23
		t = 2 + 3 + s;
		System.out.println(t); //5s

		int k = s.length();
		String j = s.trim();
		System.out.println(j);
		j = s.toUpperCase();
		System.out.println(j);
		j = s.toLowerCase();
		System.out.println(j);

		k = s.indexOf("am");
		System.out.println(k);
		k = s.indexOf("am", 10);
		System.out.println(k);
		boolean b = s.contains("I");
		if (s.contains("OK")) {
			// ....
		}
		if (s.indexOf("OK") >= 0) {
			// ...
		}

		String u = "OK";
		String v = "ok".toUpperCase();
		String w = "O" + "K";
		System.out.println(u == "OK");
		System.out.println(u == v); // false should not use "=" to compare
		System.out.println(u == w); // should use .equals() instead
		System.out.println(u + "," + v + "," + w);
		boolean y = u.equals("OK");
		System.out.println(y);
		if (u.compareTo(v) == 0) { //u == v

		}
		if (u.compareTo(v) < 0) { //u < v

		}
		if (u.compareTo(v) > 0) { //u > v

		}
		
		//Char
		String h = "abcdefghijk";
		for (char o : h.toCharArray()) { // can use if with char
			if (o > 'b' && o < 'e')
			System.out.print(o+"-");
		}
		System.out.println();
		String tt;
		tt = s.substring(2, 3); // s[2]
		tt = s.substring(2, 8); // s[2:8]
		tt = s.substring(2); // s[2:]
		tt = s.substring(s.length()-1); // s[-1]
		char cc = s.charAt(4); // s[4]
		
		Scanner kb =new Scanner(System.in);
		System.out.println(">>");
		String r = kb.nextLine();
		int count = 0;
		for (char e :r.toUpperCase().toCharArray()) {
			if( e == 'A' || e == 'E' ||e == 'I' ||
					e == 'O' ||e == 'U') //("AEIOU".indexOf(e)>=0)
			{
				count++;
			}
		}
		System.out.println(count);
			
		
		
		
		

		
		
	}

}
