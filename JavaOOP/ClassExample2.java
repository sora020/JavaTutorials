/* Java Program to demonstrate having the main method in
 * another class
 */

class Student {
	int id;
	String name;
}

public class ClassExample2 {
	public static void main(String... args) {
		Student s = new Student();
		System.out.println(s.id);
		System.out.println(s.name);
	}
}
