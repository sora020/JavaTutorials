public class Palindrome {
	public static void main(String... args) {
		int n = 12321; //enter value here
		int sum = 0, r, temp;
		temp = n;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = (sum * 10) + r;
		}
		if (sum == temp)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
