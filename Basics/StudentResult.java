package Basics;
import java.util.Scanner;
public class StudentResult {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name of Student:");

        String name = sc.nextLine();

        System.out.println("Enter marks of student:");

        int marks = sc.nextInt();

        System.out.println("Student name:"+name);
        System.out.println("Student marks:"+marks);

        if(marks<40){
            System.out.println("Fail");
        } else if (marks>=40 && marks<=100) {
            System.out.println("Pass");
            
        }else{
            System.out.println("Invalid Marks Entered");
        }
    sc.close();
    }
}
