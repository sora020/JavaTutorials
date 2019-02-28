/* Java Program to create multiple objects and store information in it
 * through reference variable
 *
 * Since class Student class is already in the same directory, no import
 * is needed to call it.
 * It is declared in the ClassExample2.java
 */

public class ObjectInit2 {
	public static void main(String... args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.id = 61;
		s1.name = "sora";
		s2.id = 2;
		s2.name = "Dirt Rally";
		System.out.println("First object: " + s1.id + " " + s1.name);
		System.out.println("Second object: " + s2.id + " " + s2.name);
	}
}
