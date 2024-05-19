package easy;

import java.util.List;

public class ValidateSubsequence {

    public static void main(String[] args) {
        List<Integer> array = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = List.of(1, 6, -1, 10);
        System.out.println(isValidSubsequence(array, sequence));
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        // [5, 1, 22, 25, 6, -1, 8, 10]
        // [5, 1, 22, 22, 25, 6, -1, 8, 10]

        int subSequenceIdx = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == sequence.get(subSequenceIdx)) {
                subSequenceIdx++;
            }
            if (subSequenceIdx == sequence.size())
                return true;
        }

        return false;

    }

}
