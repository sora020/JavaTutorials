/**
 * 1     1
 *  2   2
 *   3 3
 *    4
 *   3 3
 *  2   2
 * 1     1
 */
public class Pattern5 { 
	public static void main(String... args) {
		int n = 8;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n/2; j++) {
				if(j == i) 
					System.out.print(j);
				else if((i > n/2) && (j == n - i))
					System.out.print(j);
				else
					System.out.print(" ");
			}
			for(int j = (n/2)-1; j >= 1; j--) {
				if(j == i) 
					System.out.print(j);
				else if((i > n/2) && (j == n - i))
					System.out.print(j);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
