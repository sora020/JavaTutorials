/* Java Program to demonstrate object initialization using method
 */

class Student1 { 
	private
		int id;
		String name;
	public
		void initialize(int i, String n) {
			id = i;
			name = n;	
		}
		void print() {
			System.out.println(id + " " + name);	
		}
}
public class ObjectInit3 {
	public static void main(String... args) {
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		s1.initialize(100, "One Hundred");
		s2.initialize(61, "sora");
		s1.print();
		s2.print();
	}
}
