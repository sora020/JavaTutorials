/**
 * *                          *
 *
 * *  *                    *  *
 *
 * *  *  *              *  *  *
 * 
 * *  *  *  *        *  *  *  *
 * 
 * *  *  *  *  *  *  *  *  *  *
 *
 * *  *  *  *  *  *  *  *  *  *
 * 
 * *  *  *  *        *  *  *  *
 * 
 * *  *  *              *  *  *  
 *
 * *  *                    *  *
 *
 * *                          *
 */

public class Pattern1 {
	public static void main(String... args) {
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*  ");
			}
			for(int k = n - i; k >= 1; k--) {
				System.out.print("   ");
			}
			for(int k = 1; k <= n - i; k++) {
				System.out.print("   ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*  ");
			}	
			System.out.println("\n");
		}
		for(int i = n; i >= 1; i--) {
			for(int j = i; j >= 1; j--) {
				System.out.print("*  ");
			}
			for(int k = 1; k <= n - i; k++) {
				System.out.print("   ");
			}
			for(int k = 5 - i; k >= 1; k--) {
				System.out.print("   ");
			}
			for(int j = i; j >= 1; j--) {
				System.out.print("*  ");
			}	
			System.out.println("\n");
		}
	}
}
