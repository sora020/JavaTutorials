class Employee {
	float salary = 40000;
}

class InheritenceExample extends Employee {
	int bonus = 10000;
	public static void main(String... args) {
		InheritenceExample p = new InheritenceExample();
		System.out.println("Salary is: " + p.salary);
		System.out.println("Bonus is: " + p.bonus);
	}
}
