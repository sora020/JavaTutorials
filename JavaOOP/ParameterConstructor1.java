/* Java Program in which we have created the constructor
 * of Student class that have two parameters. We can 
 * have any number of parameters in the constructor. 
 */

public class ParameterConstructor1 {
	int id;
	String name;
	ParameterConstructor1(int i, String n) {
		id = i;
		name = n;
	}
	void printData() {
		System.out.printf("%d %s\n", id, name); //you can use printf function also
	}
	public static void main(String... args) {
		ParameterConstructor1 pc1 = new ParameterConstructor1(100, "sora");
		ParameterConstructor1 pc2 = new ParameterConstructor1(110, "sora10");	
		pc1.printData();
		pc2.printData();
	}
}
