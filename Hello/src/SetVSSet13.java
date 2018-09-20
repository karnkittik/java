import java.util.HashSet;
import java.util.Set;

public class SetVSSet13 {

	public static void main(String[] args) {
		//TreeSet HashSet
		Set<Integer> s = new HashSet<>();
		for (int i=0; i<6;i++) {
			s.add(i);
		}
		s.remove(3);
		System.out.println(s);
		
		if (s.contains(4)) {
			//...
		}
		for (int x : s)
			System.out.print(x+" ");
	}
	
		//print is not arrange same as python
		//but TreeSet arrange
}
