public class TestAbstract {
	public static void main(String[] args) {
		//Shape sh = new Shape(); //error: Shape cannot create a new object itself.
		Shape shape = new Circle(2.5d, "Circle A");
		System.out.println(shape);
		
		Circle c = (Circle) shape;
		double d = c.diameter();
		System.out.println("Diameter: "+d);
	}
}

//-----------------------------------
abstract class Shape {
	String name;

	// abstract double perimeter(){};
	abstract double perimeter();

	public String getName() {
		return this.name;
	}

	public String toString() {
		return this.getName() + "\n\tPerimeter = " + perimeter();
	}
}
abstract class Polygon extends Shape{
	int dimension;
	abstract int getDimension();
	abstract double perimter(); // no need to override when use abstract of abstract
}

class Circle extends Shape {
	double radius;

	public Circle(double r, String n) {
		this.radius = r;
		this.name = n;
	}

	@Override //need to override every method extends from Shape
	double perimeter() {
		return 2 * Math.PI * this.radius;
	}

	double diameter() {
		return 2 * this.radius;
	}
}

class Square extends Shape {
	double height;

	public Square(double h, String n) {
		this.height = h;
		this.name = n;
	}

	@Override
	double perimeter() {
		return 4 * this.height;
	}
}
