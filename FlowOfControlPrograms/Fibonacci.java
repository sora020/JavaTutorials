/* Write a java program to print fibonacci series without using
 * recursion.
 */
public class Fibonacci {
    public static void main(String... args) {
        int n = 10, a = 0, c = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
};
