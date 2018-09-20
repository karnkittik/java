package Super;
// 1 file can have many class but only one public class
class Vehicle1 {
	int speed = 50;
}

class Bike1 extends Vehicle1 {
	int speed = 100;

	void display() {
		System.out.println(super.speed);// will print speed of Vehicle now
		System.out.println(this.speed);// will print speed of Bike now
		System.out.println(speed);//if cannot find speed, will print Parent speed
	}

	public static void main(String args[]) {
		Bike1 b = new Bike1();
		b.display();
	}
}