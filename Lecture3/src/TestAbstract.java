import java.util.ArrayList;

public class TestAbstract {
	public static void main(String[] args) {
		
		Object o = new Circle(5,"A");
		
		Shape s1 = new Circle(5,"A");
		Shape s2 = new Circle(5,"A");
		System.out.println(s1.equals(s2)); // false because memory location is not
		// Line 101 can make this true when checking information inside
		
		ArrayList<Shape> list = new ArrayList<>();
		list.add(new Circle(5,"A"));
		list.add(new Square(6,"B"));
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).perimeter());
		}
		// Shape sh = new Shape(); // Shape cannot create a new object itself.
		//Shape shape = new Circle(2.5d, "Circle A");
		//System.out.println(shape);
		//shape = new Square(4.5d, "Squre D");
		//System.out.println(shape);
		
		//Circle c = (Circle) shape;
		//double d = c.diameter();
		//System.out.println(d);
		// System.out.println(cir.toString());
		// System.out.println("Diameter = "+cir.diameter());
		// System.out.println(sqr.toString());

		// Circle cir2 = new Circle(2.5d, "Circle B");
		// System.out.println(cir2.toString());
		// System.out.println("Diameter = " + cir2.diameter());
		
		Shape s = new Shape() { //Anonymous inner class no-name but has body (one-time use)
			int side=5;

			@Override
			double perimeter() {
				return side*5;
			}	
		};
	}
	
	public static String getType(Shape s) {
		if(s instanceof Circle) {
			Circle c = (Circle) s;
			return "My diameter is "+((Circle) s).diameter();
		}
		return "null";
	}
	
	public static class MySquare extends Shape{
		int side=5;

		@Override
		double perimeter() {
			return side*5;
		}	
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

abstract class Polygon extends Shape {
	int dimension;
	abstract int getDimension();
}

class Circle extends Shape {
	double radius;

	public Circle(double r, String n) {
		this.radius = r;
		this.name = n;
	}

	@Override
	double perimeter() {
		return 2 * Math.PI * this.radius;
	}

	double diameter() {
		return 2 * this.radius;
	}

	@Override
	public boolean equals(Object obj) {
		Circle c = (Circle) obj;
		if (this.radius == c.radius && this.name == c.name) {
			return true;
		}
		else {
			return false;
		}
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