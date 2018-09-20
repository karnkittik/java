import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DictVSMap14 {

	public static void main(String[] args) {
		//TreeMap HashMap
		Map<String,String> d = new HashMap<>();
		d.put("Mo", "Monday");
		d.put("Tu", "Tuesday");
		System.out.println(d);
		System.out.println(d.get("Mo"));
		
		if(d.containsKey("We"))
			System.out.println(d.get("We"));
		else
			System.out.println("????");
		if(d.containsValue("Monday"))
			System.out.println(d.get("Mo"));
		
		for (String x :d.keySet()) {
			System.out.println(x);
		}
		
		for (Entry<String, String> y :d.entrySet()) {
			System.out.println(y);
		}
		

	}

}
