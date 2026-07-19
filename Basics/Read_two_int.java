package Basics;
import java.util.Scanner;
public class Read_two_int {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        System.out.println("You entered: " + "First " + num1 + " and " + "Second " + num2);
    }
}
