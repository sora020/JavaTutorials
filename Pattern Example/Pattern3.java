/**
 * *000*000*
 * 0*00*00*0
 * 00*0*0*00
 * 000***000
 */
public class Pattern3 {
	public static void main(String... args) {
		int n = 4;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(j == i) 
					System.out.print("*");
				else
					System.out.print("0");
			}
			System.out.print("*");
			for(int j = n; j >= 1; j--) {
				if(j == i) 
					System.out.print("*");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}
}
