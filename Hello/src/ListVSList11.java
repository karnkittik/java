import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ListVSList11 {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();	
		
		for (int i=0;i<5;i++)
			a.add(i);
		System.out.println(a);
		a.add(0,999); //index, value
		System.out.println(a);
		a.set(2, 2222);
		a.set(3, a.get(3)+10000);
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		
		List<Integer> b = Arrays.asList(1,2,3,4,5);
		System.out.println(b);
		a.addAll(0,b);
		System.out.println(a);
		for (int x: a)
			System.out.print(x+" ");
		
	}

}
