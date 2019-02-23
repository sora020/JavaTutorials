/* Write a java program to print fibonacci series with using
 * recursion.
 */
public class FibonacciRecursion {
    public static int a = 0, b = 1, c = 0;

    public static void fibonacci(int n) {
        if (n > 0) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            fibonacci(n - 1);
        }
    }

    public static void main(String... args) {
        int n = 10;
        System.out.print(a + " " + b);
        fibonacci(n - 2);
    }
};
