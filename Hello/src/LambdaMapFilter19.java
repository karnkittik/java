import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaMapFilter19 {

	public static void main(String[] args) {
		List<Integer> a,b,c;
		a = Arrays.asList(1,2,3,4,5);
		b = new ArrayList<>();
		c = new ArrayList<>();
		///sol 1
		for (int e : a) 
			{if (e%2==0) b.add(2*e);}
		System.out.println(b);
		///sol 2
		b = a.stream()
				.map(e -> 2*e)
				.collect(Collectors.toList());
		System.out.println(b);
		
		/////
		c = a.stream()
				.filter(e -> e%2==0)
				.map(e -> 2*e)
				.collect(Collectors.toList());
		System.out.println(c);
	}

}
