class StudentThis {
	private int roll;
	private String name;
	private float fees;
	StudentThis(int roll, String name, float fees) {
		this.roll = roll;
		this.name = name;
		this.fees = fees;
	}
	void print() {
		System.out.printf("%d %s %.2f\n", roll, name, fees);
	}
}
public class ThisExample {
	public static void main(String... args) {
	StudentThis s1 = new StudentThis(61, "sora", 5000f);
        StudentThis s2 = new StudentThis(16, "aros", 1000f);
	s1.print();
	s2.print();
	}
}
