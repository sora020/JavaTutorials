//continue statement demonstrated here
public class ContinueExample {
    public static void main(String... args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                /*the loop where i = 5 is
                 * continued so it doesn't print it
                 */
                continue;
            }
            System.out.println(i);
        }
    }
}
