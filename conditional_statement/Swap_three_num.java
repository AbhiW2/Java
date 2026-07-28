package conditional_statement;
import java.util.Scanner;

public class Swap_three_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Ascending order: " + a + " " + b + " " + c);

        sc.close();
    }
}