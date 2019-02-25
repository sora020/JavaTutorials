/**
 * 1 1 1 1 1 1 1 1 1 1
 * 
 * 1                 1
 *
 * 1                 1
 * 
 * 1                 1
 * 
 * 1                 1
 *
 * 1                 1
 *
 * 1                 1
 *
 * 1                 1
 * 
 * 1                 1
 *
 * 1 1 1 1 1 1 1 1 1 1
 */
public class Pattern11 {
	public static void main(String... args) {
		int n = 10;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i == 1 || i == 10 || j == 1 || j == 10)
					System.out.print("1 ");
				else
					System.out.print("  ");
			}
			System.out.println("\n");
		}
	}
}
