// program to demonstrate counter with or without static 
// variable

public class StaticExample {
	
	/* Without static counter: 
	 * 
	 * int count = 0;
	 * StaticExample() {
	 * 	count++;
	 * 	System.out.print(count);
	 * }
	 */

	static int count = 0;
	StaticExample() {
		count++;
		System.out.println(count);
	}
	public static void main(String... args) {
		StaticExample s1 = new StaticExample();
		StaticExample s2 = new StaticExample();
		StaticExample s3 = new StaticExample();
	}
}
