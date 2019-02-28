class Rectangle {
	double area;
	private
	double length, breadth;

	Rectangle(double l, double b) {
		length = l;
		breadth = b;
	}

	double area() {
		return length * breadth;
	}

	private void print() {
		System.out.println(length * breadth);
	}
}

public class RectangleMain {
	public static void main(String... args) {
		Rectangle r1 = new Rectangle(10.0d, 30.0d);
		Rectangle r2 = new Rectangle(23.0d, 21.0d);
		Rectangle r3 = new Rectangle(10.34215d, 10.12431234d);
		r1.print();
		r2.print();
		r3.print();
	}
}

