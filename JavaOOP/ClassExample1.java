/* Java Program to illustrate how to define a class and fields
 */

public class ClassExample1 {
	int id;
	String name;

	public static void main(String... args) {
		ClassExample1 c = new ClassExample1();
		// not a static variable
		// System.out.println(id);
		// System.out.println(name);
		System.out.println(c.id);
		System.out.println(c.name);
	}
}	
