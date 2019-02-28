class Employee {
	private int id;
	private int salary;
	String name;

	Employee() {
	}

	public void initialize(int var1, String var2, int var3) {
		this.id = var1;
		this.name = var2;
		this.salary = var3;
	}

	void print() {
		System.out.println(this.id + " " + this.name + " " + this.salary);
	}
}

public class EmployeeMain {
	public EmployeeMain() {
	}

	public static void main(String... var0) {
		Employee var1 = new Employee();
		Employee var2 = new Employee();
		Employee var3 = new Employee();
		var1.initialize(100, "Sortie1", 45000);
		var2.initialize(101, "Sortie2", 36000);
		var3.initialize(102, "Sortie3", 254000);
		var1.print();
		var2.print();
		var3.print();
	}
}

