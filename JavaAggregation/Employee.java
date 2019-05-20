public class Employee {
	int id;
	String name;
	Address address;

	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}
	public static void main(String... args) {
		Address address1 = new Address("kolkata", "west bengal", "India");
		Address address2 = new Address("dubai", "dont know", "Saudi Arabia");
		Address address3 = new Address("Las Vegas", "Nevada", "USA");
		Employee e1 = new Employee(111, "sora1", address1);
		Employee e2 = new Employee(112, "sora2", address2);
		Employee e3 = new Employee(113, "sora3", address3);
		e1.display();
		e2.display();
		e3.display();
	}
}
