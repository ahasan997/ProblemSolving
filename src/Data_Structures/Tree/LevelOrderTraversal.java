package Data_Structures.Tree;

import java.util.*;

public class LevelOrderTraversal {
    private static void levelOrder(Node root) {
        if (root == null) {
            System.out.println(0);
        } else {
            Queue<Node> myQueue = new LinkedList<>();
            myQueue.add(root);

            while (!myQueue.isEmpty()) {
                Node current = myQueue.peek();
                System.out.println(current.data + " ");
                if (current.left != null) {
                    ((LinkedList<Node>) myQueue).add(current.left);
                }
                if (current.right != null) {
                    ((LinkedList<Node>) myQueue).add(current.right);
                }
                myQueue.remove();
            }
        }
    }

    private static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        levelOrder(root);
    }
}