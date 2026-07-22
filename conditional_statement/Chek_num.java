package conditional_statement;
import java.util.Scanner;
public class Chek_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("Positive Number:"+num);
        } else if (num<0) {
            System.out.println("Negative number:"+num);
        }else{
            System.out.println("Nor Positive nor negavite number:"+num);
        }
    }
}
