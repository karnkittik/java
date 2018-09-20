
public class TypeConversion3 {
	public static void main(String[]args) {
		int x = 2;
		String a = Integer.toString(x);
		String b = Double.toString(2.3);
		String c = Boolean.toString(true);
		a = "" + 3; 
		c = "A"+"Q";
		int y = (int) 2.3; 
		double z = (double) 2;  //String is class cannot use like this
		y = 3;
		int i = Integer.parseInt("12");
		double j = Double.parseDouble("2.3");
		boolean k = Boolean.parseBoolean("true");
			
		
		
	}

}
