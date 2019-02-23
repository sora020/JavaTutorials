public class Armstrong {
	static int remainder, order = 0, sum = 0;

	public static void main(String... args) {
		int n = 153; // Enter number here to check (0, 1, 153, 
		// 370, 371, 407, 1634, 8208
		int temp = n;
		while (temp > 0) {
			temp = temp / 10;
			order++;
		}
		System.out.println("Order: " + order);
		temp = n;
		while (temp > 0) {
			remainder = temp % 10;
			temp = temp / 10;
			sum = sum + (int) (Math.pow(remainder, order));
		}
		if (n == sum)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
	}
}
