package easy;

public class ClosesValueInBST {

    public static void main(String[] args) {
        BST tree = new BST(10);
        tree.left = new BST(5);
        tree.right = new BST(15);
        tree.left.left = new BST(2);
        tree.left.right = new BST(5);
        tree.right.left = new BST(13);
        tree.right.right = new BST(22);
        tree.right.left.right = new BST(14);
        tree.right.right.right = new BST(30);
        int target = 12;
        int closest = 0;

        System.out.println(tree.right.right + " " + tree.right.right.right.value);
        System.out.println(findClosestValueInBst(tree, target, closest));
    }

    public static int findClosestValueInBst(BST tree, int target, int closest) {
        BST currentNode = tree;
        while (currentNode != null) {
            if (Math.abs(target - closest) > Math.abs(target - currentNode.value)) {
                closest = currentNode.value;
            }
            if (target < currentNode.value) {
                currentNode = currentNode.left;
            } else if (target > currentNode.value) {
                currentNode = currentNode.right;
            } else {
                break;
            }
        }

        return closest;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
