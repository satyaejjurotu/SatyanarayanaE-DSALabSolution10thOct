import java.util.ArrayList;

public class App {

    static class Node {
        Node left;
        Node right;
        int data;
    }

    static Node newNode(int data) {
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;
        return node;
    }

    static ArrayList<Integer> longestPath(Node root) {
        if (root == null) {
            ArrayList<Integer> output = new ArrayList<>();
            return output;
        }

        // Recurrsive
        ArrayList<Integer> right = longestPath(root.right);

        // Reccursive
        ArrayList<Integer> left = longestPath(root.left);

        if (right.size() < left.size()) {
            left.add(root.data);
            return left;
        } else {
            right.add(root.data);
            return right;
        }
    }

    public static void main(String[] args) throws Exception {
        Node root = newNode(100);
        root.left = newNode(20);
        root.right = newNode(130);
        root.left.left = newNode(10);
        root.left.right = newNode(50);
        root.right.left = newNode(110);
        root.right.right = newNode(140);
        root.left.left.left = newNode(5);

        ArrayList<Integer> output = longestPath(root);
        System.out.print(output.get(output.size()-1));
        for (int i = output.size() - 2; i >= 0; i--) {
            System.out.print(" -> " + output.get(i));
        }
    }
}
