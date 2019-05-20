// Java program to demonstrate use of static method

public class StaticExample2 {
	static int cube(int x) {
		return x*x*x;
	}
	public static void main(String... args) {
		int x = 10;
		System.out.println(StaticExample2.cube(x));
	}
}
