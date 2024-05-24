package easy;

import java.util.ArrayList;
import java.util.List;

public class BranchSum {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(1);
        tree.left = new BinaryTree(2);
        tree.right = new BinaryTree(3);
        tree.left.left = new BinaryTree(4);
        tree.left.right = new BinaryTree(5);
        tree.left.left.left = new BinaryTree(8);
        tree.left.left.right = new BinaryTree(9);
        tree.left.right.left = new BinaryTree(10);

        tree.right.left = new BinaryTree(6);
        tree.right.right = new BinaryTree(7);

        List<Integer> result = branchSum(tree);

        result.forEach(i -> {
            System.out.println(i);
        });
    }

    public static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSum(BinaryTree tree) {
        List<Integer> sums = new ArrayList<>();
        calculateBranchSum(tree, 0, sums);
        return sums;
    }

    public static void calculateBranchSum(BinaryTree tree, int runningSum, List<Integer> sums) {
        if (tree == null)
            return;

        int newRunningSum = runningSum + tree.value;
        if (tree.right == null && tree.left == null) {
            sums.add(newRunningSum);
            return;
        }

        calculateBranchSum(tree.left, newRunningSum, sums);
        calculateBranchSum(tree.right, newRunningSum, sums);
    }
}
