//Program for For-each Loop Example below
public class ForExample1 {
	public static void main(String... args) {
		/* Syntax:
		 * for(Type variable : array)
		 * {
		 *	*code here executed*
		 * }
		 */

		//declaring array
		int[] array = {12, 23, 44, 56, 78};

		//printing array using for-each loop
		for (int i : array) {
			System.out.println(i);
		}
	}
}
