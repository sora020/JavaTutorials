/* Using 'this' to invoke current class contructor
 */
class TestThis1 {
	TestThis1() {
		System.out.println("hello Constructor");
	}
	TestThis1(int x) {
		this();
		System.out.println(x);
	}
}
public class ThisExample2 {
	public static void main(String... args) {
		TestThis1 tt = new TestThis1(10);
	}
}
