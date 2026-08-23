package Loops;

public class Search_Element_Array {
    public static void main(String[] args) {

        int[] array = {3, 4, 5, 6, 7, 8, 9};
        int target = 5;

        boolean found = false;

        for (int i = 0; i < array.length; i++) {

            if (target == array[i]) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}