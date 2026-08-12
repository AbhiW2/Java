package Basics;
import java.util.Scanner;

public class Find_sum_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Digit:");
        int n = sc.nextInt();

        int sum=0;
        while(n!=0){
            int digit = n %10;
            sum = sum+digit;
            n=n/10;

        }
        System.out.println("Sum Of Digit is:"+sum);
    }
}
