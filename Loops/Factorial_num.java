package Loops;
import java.util.Scanner;

public class Factorial_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i = 1;
        long factorial = 1;

        while (i <= n) {
            factorial = factorial * i;
            i++;
        }

        System.out.println("Factorial = " + factorial);
    }
}
