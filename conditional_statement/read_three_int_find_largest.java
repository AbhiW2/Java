package conditional_statement;

import java.util.Scanner;

public class read_three_int_find_largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = scanner.nextInt();

        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("The largest integer is: " + largest);
    }
}
