//Java program to demonstrate the work of Copy Constructor

public class CopyConstructor {
	int id;
	String name;
	CopyConstructor(int i, String n) {
		id = i;
		name = n;
	}
	CopyConstructor(CopyConstructor obj) {
		id = obj.id;
		name = obj.name;
	}
	void print() {
		System.out.printf("%d %s\n", id, name);
	}
	public static void main(String... args) {
		CopyConstructor cc1 = new CopyConstructor(61, "sora");
		CopyConstructor cc2 = new CopyConstructor(cc1);
		cc1.print();
		cc2.print();
	}
}
