package conditional_statement;
import java.util.Scanner;

public class Guard_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter a number: ");

            if (sc.hasNextInt()) {
                number = sc.nextInt();
                break; // Valid input, exit loop
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                sc.next(); // Discard the invalid input
            }
        }

        System.out.println("You entered: " + number);

        sc.close();
    }
}