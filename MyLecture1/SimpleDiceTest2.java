//import casino.SimpleDice;
import casino.*;

public class SimpleDiceTest2 {

	public static void main(String[] args) {
		SimpleDice d1 = new SimpleDice();
		d1.setFaceValue(6);
		System.out.println(d1.getFaceValue());
		System.out.println(d1);
		SimpleDice d2 = new SimpleDice(6);
		System.out.println(d1.equals(d2)); //compare memory location
		Dice  c1 = new Dice(5);
		System.out.println(c1);
	}

}
