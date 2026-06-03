package Loops;

import java.util.Scanner;

public class Even_num_using_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int i = 2;

        while (i <= n) {
            System.out.println(i);
            i += 2;
        }
    }
} {
    
}
