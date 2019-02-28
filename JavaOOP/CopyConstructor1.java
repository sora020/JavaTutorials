//Java program to demonstrate the work of Copy Constructor

public class CopyConstructor1 {
	int id;
	String name;
	CopyConstructor1(int i, String n) {
		id = i;
		name = n;
	}
	CopyConstructor1() {
	}
	void print() {
		System.out.printf("%d %s\n", id, name);
	}
	public static void main(String... args) {
		CopyConstructor cc1 = new CopyConstructor(61, "sora");
		CopyConstructor cc2 = new CopyConstructor(cc1);
		cc2.id = cc1.id;
		cc2.name = cc1.name;
		cc1.print();
		cc2.print();
	}
}
