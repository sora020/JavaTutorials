/**
 *      1
 *     1 1
 *    1 2 1
 *   1 3 3 1
 *  1 4 6 4 1  
 * 1 5 10 10 5 1
 */
public class Pattern14 {
	public static int factorial(int n) {
		int fact = 1;
		for(int i = 1; i <= n; i++) 
			fact = fact * i;
		return fact;
	}	

	public static int ncr(int n, int r) {
		return (factorial(n)/(factorial(n-r)*factorial(r)));
	}

	public static void main(String... args) {
		int n = 6;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) 
				System.out.print(" ");
			for(int j = 1; j <= i; j++) 
				System.out.print(ncr(i-1, j-1) + " ");
			System.out.println();
		}
	}
}
