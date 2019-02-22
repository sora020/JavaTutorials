//Converting float to int
public class Variable1 {
    public static void main(String... args) {
        float f = 100.55f;
        /*compile time error
         * int a = f;
         */
        int a = (int) f;
        System.out.println(f);
        System.out.println(a);
    }
}
