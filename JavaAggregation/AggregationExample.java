//Square of Circle
class Square {
	double sq(double r) {
		return r*r;
	}
}

class Circle {
	Square obj; //aggregation
	double pi = 3.14d;
	double area(double rad) {
		obj = new Square();
		double rsq = obj.sq(rad);
		return pi*rsq;
	}
}
public class AggregationExample {
	public static void main(String... args) {
		Circle c = new Circle();
		double res = c.area(10d);
		System.out.println(res);
	}
}

