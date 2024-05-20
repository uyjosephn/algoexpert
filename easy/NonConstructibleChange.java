package easy;

import java.util.Arrays;

public class NonConstructibleChange {

    public static void main(String[] args) {
        int[] coins = { 5, 7, 1, 1, 2, 3, 22 };
        System.out.println(new NonConstructibleChange().nonConstructibleChange(coins));
    }

    public int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int change = 0;
        for (int coin : coins) {
            if (coin > change + 1) {
                return change + 1;
            }
            change += coin;
        }
        return change + 1;
    }

}
