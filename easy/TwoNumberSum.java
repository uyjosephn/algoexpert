package easy;

import java.util.*;

class TwoNumberSum {
    public static void main(String[] args) {
        int[] array = { 3, 5, -4, 8, 11, 1, -1, 6 };
        int targetSum = 10;
        int[] result = twoNumberSum(array, targetSum);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        HashMap<Integer, Integer> twoNumMap = new HashMap<>();

        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            int difference = targetSum - array[i];
            if (twoNumMap.containsKey(array[i])) {
                result[0] = array[i];
                result[1] = twoNumMap.get(array[i]);
                return result;
            }
            twoNumMap.put(difference, array[i]);
        }

        return new int[0];
    }
}
