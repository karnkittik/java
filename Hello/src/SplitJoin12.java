import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SplitJoin12 {
	public static void main(String[]args) {
		String s = "A BB CCC";
		String[] t = s.split(" ");
		List<String> t1 = Arrays.asList(t);
		System.out.println(t1);
		String u = String.join(",", t1);
		System.out.println(u);
		
		Scanner kb = new Scanner(System.in);
		System.out.println(">>");
		String s1 = kb.nextLine();
		List<String> t2 = Arrays.asList(s1.split(" "));
		List<String> u1 = new ArrayList<>();
		for (String w: t2) {
			if (!u1.contains(w))
				u1.add(w);
			
		}
		System.out.println(String.join(",", u1));
		
	}

}
