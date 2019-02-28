/* Java Program to demontrate object initializtion using
 * constructor
 */
class Student2 {
	String name;
	private
	int id;

	public Student2(int i, String n) {
		id = i;
		name = n;
	}

	public void print() {
		System.out.println(id + " " + name);
	}
}

public class ObjectInit4 {
	public static void main(String... args) {
		Student2 s = new Student2(61, "sora");
		s.print();
	}
}

