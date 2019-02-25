/**
 * 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2
 * 1
 */
public class Pattern12 {
	public static void main(String... args) {
		int n = 5;
		for(int i = 1; i <= n; i++) {
			int num = 1;
			for(int j = n; j >= i; j--) {
				System.out.print(num + " ");
				num++;
			}	
			System.out.println();
		}
	}
}
