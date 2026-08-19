package string;

public class Print_First_Char  {
    public static void main(String[] args) {
        String s1 = "Hello Abhijeet";

        for (int i = 0; i < s1.length(); i++) {
            System.out.println("First character = " + s1.charAt(i));
            break;
        }
    }
}


