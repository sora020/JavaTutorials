public class PrimeNumber {
    public static void main(String... args) {
        /*Number to be checked (comment the other n
         * declaration
         * int n = 44;
         * int n = 3;
         */
        int n = 10, prime = 1;
        if (n == 0 || n == 1) {
            System.out.println(n + " is neither Composite nor Prime");
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = 0;
                    break;
                } else
                    prime = 1;
            }
            if (prime == 0)
                System.out.println(n + " is Not a Prime Number");
            else
                System.out.println(n + " is a Prime Number");
        }
    }
};
