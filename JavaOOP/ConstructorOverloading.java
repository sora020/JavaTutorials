//Example of Constructor Overloading

public class ConstructorOverloading {
	int id, age;
	String name;

	ConstructorOverloading(int i, String s) {
		id = i;
		name = s;
	}

	ConstructorOverloading(int i, String s, int a) {
		id = i;
		name = s;
		age = a;
	}

	public static void main(String... args) {
		ConstructorOverloading co1 = new ConstructorOverloading(61, "sora", 21);
		ConstructorOverloading co2 = new ConstructorOverloading(0, "John Doe");
		co1.print();
		co2.print();
	}

	void print() {
		System.out.printf("ID: %d, Name:  %s, Age:  %d\n", id, name, age);
	}
}
