/**
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 */
public class Pattern13 {
	public static void main(String... args) {
		int n = 5;
		for(int i = 1; i <= 5; i++) {
			for(int k = 1; k <= i; k++) 
				System.out.print(" ");
			for(int j = i; j <= 2*n-i; j++) 
				System.out.print("*");
			System.out.println();
		}
	}
}
