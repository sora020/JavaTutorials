public class PrimeMethod {
    public static int prime = 1;

    public static String checkPrime(int n) {
        if (n == 0 || n == 1)
            return " is neither composite nor prime";
        else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = 0;
                    break;
                } else
                    prime = 1;
            }
            if (prime == 0)
                return " is not a Prime Number";
            else
                return " is a prime number";

        }
    }

    public static void main(String... args) {
        int n = 1; //Enter your own value to check
        System.out.println(n + checkPrime(n));
    }
}
