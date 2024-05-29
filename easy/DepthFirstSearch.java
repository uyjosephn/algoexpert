package easy;

import java.util.*;

public class DepthFirstSearch {

    public static void main(String[] args) {
        Node node = new Node("A");
        node.addChild("B").addChild("C").addChild("D");
        node.children.get(0).addChild("E").addChild("F");
        node.children.get(2).addChild("G").addChild("H");
        node.children.get(0).children.get(1).addChild("I").addChild("J");
        node.children.get(2).children.get(0).addChild("K");

        System.out.println(node.depthFirstSearch(new ArrayList<String>()));
    }

    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }

        public List<String> depthFirstSearch(List<String> array) {
            array.add(this.name);
            for (int i = 0; i < children.size(); i++) {
                children.get(i).depthFirstSearch(array);
            }
            return array;
        }

    }
}
