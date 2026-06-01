import java.util.Scanner;

public class AveragePositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, sum = 0, count = 0;

        System.out.println("Enter positive numbers (enter 0 to stop):");

        num = sc.nextInt();

        while (num != 0) {
            if (num > 0) {
                sum += num;
                count++;
            }
            num = sc.nextInt();
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average = " + average);
        } else {
            System.out.println("No positive numbers entered.");
        }
    }
}
