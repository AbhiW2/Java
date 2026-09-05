package Arrays;

public class Check_Two_Arrays_Equal {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 2, 3, 4, 5, 6};

        int n = array1.length;
        int m = array2.length;

        boolean equal = true;

        if (n != m) {
            equal = false;
        } else {

            for (int i = 0; i < n; i++) {
                if (array1[i] != array2[i]) {
                    equal = false;
                    break;
                }
            }
        }

        if (equal) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}