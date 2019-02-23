//different types of if-else statement
public class IfElse {
    public static void main(String[] args) {
        //If Statement
        System.out.println("If Statement: ");
        int age = 20;
        if (age > 18) {
            System.out.println("Age is Greater than 18");
        }

        //If-Else Statement
        System.out.println("\nIf-Else Statement: ");
        int number = 13;
        if (number % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

        //If-Else Ladder Statement
        System.out.println("\nIf-Else Ladder Statement: ");
        int marks = 65;
        if (marks < 50)
            System.out.println("fail");
        else if (marks >= 50 && marks < 60)
            System.out.println("D grade");
        else if (marks >= 60 && marks < 70)
            System.out.println("C grade");
        else if (marks >= 70 && marks < 80)
            System.out.println("B grade");
        else if (marks >= 80 && marks < 90)
            System.out.println("A grade");
        else if (marks >= 90 && marks < 100)
            System.out.println("A+ grade");
        else
            System.out.println("Invalid!");

        //If-Else Nested Statement
        System.out.println("\nIf-Else Ladder Statement: ");
        int age1 = 25, weight = 48;
        if (age1 >= 18) {
            if (weight > 50) {
                System.out.println("You are eligible for blood donation");
            }
            System.out.println("You are'nt eligible for blood donation");
        } else
            System.out.println("Your age must be over 18");
    }
};
