package easy;

public class EvaluateExpressionTree {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(-1);
        tree.left = new BinaryTree(-2);
        tree.left.left = new BinaryTree(-4);
        tree.left.right = new BinaryTree(2);
        tree.left.left.left = new BinaryTree(2);
        tree.left.left.right = new BinaryTree(3);

        tree.right = new BinaryTree(-3);
        tree.right.left = new BinaryTree(8);
        tree.right.right = new BinaryTree(3);

        System.out.println(new EvaluateExpressionTree().evaluateExpressionTree(tree));
    }

    public int evaluateExpressionTree(BinaryTree tree) {
        if (tree.value >= 0) {
            return tree.value;
        }

        int leftValue = evaluateExpressionTree(tree.left);
        int rightValue = evaluateExpressionTree(tree.right);

        if (tree.value == -1) {
            return leftValue + rightValue;
        } else if (tree.value == -2) {
            return leftValue - rightValue;
        } else if (tree.value == -3) {
            return leftValue / rightValue;
        } else {
            return leftValue * rightValue;
        }
    }

    static class BinaryTree {
        int value;
        BinaryTree left = null;
        BinaryTree right = null;

        BinaryTree(int value) {
            this.value = value;
        }
    }
}
