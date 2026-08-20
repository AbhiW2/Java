package string;
import java.util.HashMap;

public class First_non_repeated {
    public static void main(String[] args) {

        String str = "aabbcde";

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first non-repeated character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.get(ch) == 1) {
                System.out.println("First non-repeated character = " + ch);
                break;
            }
        }
    }
}