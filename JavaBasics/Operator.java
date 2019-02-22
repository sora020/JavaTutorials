public class Operator {
    public static void main(String... args) {
        //unary operator
        System.out.println("Unary Operator: ");
        int x2 = 10;
        System.out.println(x2++);
        System.out.println(++x2);
        System.out.println(x2--);
        System.out.println(--x2);

        int a = 10, b = 10;
        System.out.println(a++ + ++a);
        System.out.println(b++ + b++);

        int a1 = 10, b1 = -10;
        boolean c = true, d = false;
        System.out.println(~a1);
        System.out.println(~b1);
        System.out.println(!c);
        System.out.println(!d);

        //arithemetic operator
        System.out.println("\nArithmetic Operator: ");
        int a2 = 10, b2 = 5;
        System.out.println(a2 + b2);
        System.out.println(a2 - b2);
        System.out.println(a2 * b2);
        System.out.println(a2 / b2);
        System.out.println(a2 % b2);
        System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);

        //shift operator
        System.out.println("\nShift Operator: ");
        //left shift
        System.out.println(10 << 2); //10*2^2 = 10*4 = 40
        System.out.println(15 << 4); //15*2^4 = 15*16 = 240
        //right shift
        System.out.println(10 >> 2); //10/2^2 = 10/4 = 2
        System.out.println(20 >> 3); //20/2^3 = 20/8 = 2

        //>> vs >>>
        //For positive number, >> and >>> works same
        System.out.println(20 >> 2);
        System.out.println(20 >>> 2);
        //For negative number, >>> changes parity bit
        //(MSB) to 0
        System.out.println(-20 >> 2);
        System.out.println(-20 >>> 2);

        //Logical and bitwise AND Operator
        System.out.println("\n&& and & operator: ");
        int a3 = 10, b3 = 5, c3 = 20;
        System.out.println(a3 < b3 && a3 < c3); //false && true = false
        System.out.println(a3 < b3 & a3 < c3); //false & true = false
        //Logical and itwise OR Operator
        System.out.println("\n|| and | Operator: ");
        int a4 = 10, b4 = 5, c4 = 20;
        System.out.println(a4 > b4 || a4 < c4); //true || true = true
        System.out.println(a4 > b4 | a4 < c4); //true | true = true
        //|| vs |
        System.out.println(a4 > b4 || a4++ < c4); //true || true = true
        System.out.println(a4); //10 because second condition is not checked
        System.out.println(a4 > b4 | a4++ < c4); //true | true = true
        System.out.println(a4); //11 because second condition is checked

        //Ternary Operator
        System.out.println("\nTernary Operator: ");
        int a5 = 2, b5 = 5;
        int min = (a5 < b5) ? a5 : b5;
        System.out.println("Minimum: " + min);

        //Assignement Operator
        System.out.println("\nAssignment Operator: ");
        int x = 10, y = 5;
        System.out.println(x);
        x += 3;
        System.out.println(x);
        x -= 3;
        System.out.println(x);
        x *= 3;
        System.out.println(x);
        x /= 3;
        System.out.println(x);
        x += y;
        short x1 = 10, y1 = 10;
        /* x1 = x1 + y1; Wrong (Compile Time Error)
         * x1+ = y1; Operation takesplace internally
         */
        x1 = (short) (x1 + y1); //correct
        System.out.println(x1);
    }
};
