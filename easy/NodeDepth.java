package easy;

public class NodeDepth {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree(1);
        tree.left = new BinaryTree(2);
        tree.right = new BinaryTree(3);
        tree.left.left = new BinaryTree(4);
        tree.left.right = new BinaryTree(5);
        tree.right.left = new BinaryTree(6);
        tree.right.right = new BinaryTree(7);
        tree.left.left.left = new BinaryTree(8);
        tree.left.left.right = new BinaryTree(9);

        System.out.println(nodeDepth(tree));
    }

    public static int nodeDepth(BinaryTree tree) {
        return calculateDept(tree, 0);
    }

    public static int calculateDept(BinaryTree tree, int depth) {
        if (tree == null) {
            return 0;
        }
        return depth + calculateDept(tree.left, depth + 1) + calculateDept(tree.right, depth + 1);
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}
