package conditional_statement;
import java.util.Scanner;

public class Hello_World_Bye {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if (n % 5 == 0 && n % 7 == 0) {
            System.out.println("Hello World");
        } else {
            System.out.println("Bye");
        }
    }
}