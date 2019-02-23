public class DoWhileExample {
	public static void main(String... args) {
		int i = 1;
		do {
			System.out.println(i);
			++i;
		} while (i <= 10);

		/* How do while Differs from other loops
		 * It Executes 1st loop without checking
		 * the condition
		 */

		int a = 11;
		do {
			System.out.println("\n" + a);
			a++;
		} while (a <= 10);
	}
};  
