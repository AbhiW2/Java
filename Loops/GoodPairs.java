package Loops;

import java.util.HashMap;


public class GoodPairs {

    public static int countGoodPairs(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            if (map.containsKey(num)) {
                count += map.get(num);
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 3};

        System.out.println(countGoodPairs(arr)); // Output: 4
    }
}