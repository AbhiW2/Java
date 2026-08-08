package Arrays;

public class Find_positive_neg_zero_elements {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, -6, 7, -2, 0};
        int n = array.length;
        int pos_count = 0;
        int neg_count = 0;
        int zero_count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                pos_count++;
            } else if (array[i] < 0) {
                neg_count++;
            } else {
                zero_count++;
            }
        }
        System.out.println("Positive Count:"+pos_count);
        System.out.println("Negative Count:"+neg_count);
        System.out.println("Zero Count:"+zero_count);
    }
}

