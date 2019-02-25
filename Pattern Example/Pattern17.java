/**
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 */
public class Pattern17 {
	public static void main(String... args) {
		int n = 5;
		for(int i = 1; i <= n; i++) {
			int num = 1;
			for(int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
}
