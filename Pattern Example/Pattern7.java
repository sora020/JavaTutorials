/**
 * 12344321
 * 123**321
 * 12****21
 * 1******1
 */
public class Pattern7 {
	public static void main(String... args) {
		int n = 4;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) { 
				if(j <= (n - i)+1) 
				System.out.print(j);
				else
					System.out.print("*");
			}
			for(int j = n; j >= 1; j--) {
				if(j <= (n - i)+1) 
					System.out.print(j);
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
