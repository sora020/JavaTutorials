/* Java Program to initialize the object through a reference variable
 *
 * Since class Student in same directory as this file no import is 
 * needed
 * The class is declared in ClassExample2.java
 */

public class ObjectInit1 {
	public static void main(String... args) {
		Student s = new Student();
		s.id = 61;
		s.name = "sora";
		System.out.println(s.id + " " + s.name);
	}
}
