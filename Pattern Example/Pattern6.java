/**
 *  1  2  3  4  5
 * 16           6
 * 15           7
 * 14           8
 * 13 12 11 10 9
 */
public class Pattern6 {
	public static void main(String... args) {
		int no = 1, left = 0;
		int upto = 16;
		int n = upto/4 + 1;
		int right = n;
		int[][] mat = new int[n][n];
		for(int i = 1; i <= n/2; i++) {
			if(no <= upto){
				for(int k = left; k < right; k++) {
					mat[left][k] = no;
					no++;
				}
				for(int k = left + 1; k < right; k++) {
					mat[k][right-1] = no;
					no++;
				}
				for(int k = right - 2; k >= left; k--) {
					mat[right-1][k] = no;
					no++;
				}
				for(int k = right - 2; k > left; k--) {
					mat[k][left] = no;
					no++;
				}
				left++;
				right--;
			} 
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(mat[i][j] == 0) 
					System.out.print("    ");
				else if(mat[i][j] > 9)
					System.out.print(mat[i][j] + " ");
				else
					System.out.print(mat[i][j] + "  ");
			}
			System.out.println();
		}

	}
}
