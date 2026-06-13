package conditional_statement;
import java.util.Scanner;


public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        if (b != 0) {
            int quotient = a / b;
            int remainder = a % b;

            System.out.println("Quotient = " + quotient);
            System.out.println("Remainder = " + remainder);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}