/**
 * 0
 * 909
 * 89098
 * 7890987
 * 678909876
 * 56789098765
 * 4567890987654
 * 345678909876543
 * 23456789098765432
 * 1234567890987654321
 */
public class Pattern8 {
	public static void main(String... args) {
		int n = 10;
		int temp;
		for(int i = n; i >= 1; i--) {
			for(int j = n; j >= 1; j--) {
				if((n-i+1) >= j){
					if(n-j+1 == 10) 
						System.out.print("0");
					else
						System.out.print(n-j+1);
				}
			}
			for(int j = n-1; j >= 1; j--) {
				if(j >= i)
					System.out.print(j);
			
			}
			System.out.println();
		}
	}
}
