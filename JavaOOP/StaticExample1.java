// Java program to demonstrate staic method can change static variable value

public class StaticExample1 {
	private int id;
	private String name = "";
	private static String desc = "male";
	public static void change() { 
		desc = "info not available";
	}
	StaticExample1(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void print() {
		System.out.println(id + " " + name + " " + desc);
	}
	public static void main(String... args) {
		change();
		StaticExample1 s1 = new StaticExample1(61, "sora");
		StaticExample1 s2 = new StaticExample1(1, "john doe");
		StaticExample1 s3 = new StaticExample1(2, "foobar");
		s1.print();
		s2.print();
		s3.print();
	}
}
