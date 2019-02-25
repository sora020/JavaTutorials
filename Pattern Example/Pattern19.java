/**
 */
public class Pattern19 {
	public static void main(String... args) {
		int n = 10, num = 1;
		int left = 0, right = n;
		int[][] mat = new int[n][n];
		for(int i = left; i < right; i++) {
			for(int j = left; j < right; j++) {
				mat[left][j] = num;
				num++;
			}
			for(int j = left+1; j < right; j++) {
				mat[j][right-1] = num;
				num++;
			}
			for(int j = right-2; j >= left; j--) {
				mat[right-1][j] = num;
				num++;
			}	
			for(int j = right-2; j > left; j--) {
				mat[j][left] = num;
				num++;
			}
			left++;
			right--;
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++)
				System.out.print(mat[i][j] + " ");
		System.out.println();
		}
	}
}
