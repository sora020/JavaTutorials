public class Factorial {
	public static void main(String... args) {
		int n = 5; //Enter value here to check
		int fact = 1;
		for(int i = n; i >= 1; i--)
			fact = fact * i;
		System.out.println(fact);
	}
}
