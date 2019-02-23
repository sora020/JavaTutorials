public class FactorialRecursion {
	static int fact = 1;
	public static int factorialCheck(int n) {
		if(n > 0) {
			fact = fact * n;
			factorialCheck(n-1);
		}
		return fact;
	}
	public static void main(String... args) {
		int n = 5; //Enter your number here to check
		System.out.println(factorialCheck(n));
	}
}
