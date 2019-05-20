// Reusing Constructor using 'this' keyword
class Student3 {
	private int roll;
	private String name,course;
	float fee;
	Student3(int roll, String name, String course) {
		this.roll = roll;
		this.name = name;
		this.course = course;
	}
	Student3(int roll, String name, String course, float fee) {
		this(roll, name, course);
		this.fee = fee;
	}
	void print() {
		System.out.printf("%d %s %s %.2f\n", roll, name, course, fee);
	}
}
public class ThisExample3 {
	public static void main(String... args) {
		Student3 s1 = new Student3(7, "Ronaldo Fan", "Engineering");
		Student3 s2 = new Student3(10, "Messi Fan", "Arts", 10000f);
		s1.print();
		s2.print();
	}
}
