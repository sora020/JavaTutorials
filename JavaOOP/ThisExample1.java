/* Using 'this' keyword to invoke method. It is automatic 
 * process.
 */
class TestThis {
	void foo() {
		System.out.println("hello foo"); 
	}
	void bar() {
		System.out.println("hello bar");
		this.foo();
	}
}
public class ThisExample1 {
	public static void main(String... args) {
		TestThis tt = new TestThis();
		tt.bar();
	}
}
