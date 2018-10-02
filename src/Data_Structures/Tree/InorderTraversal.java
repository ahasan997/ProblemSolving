package Data_Structures.Tree;

import java.util.*;

public class InorderTraversal {
    public static void inOrder(Node root) {
        if(root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node tmp = root;

        while (!stack.isEmpty() || tmp != null) {
            if(tmp != null) {
                stack.push(tmp);
                tmp = tmp.left;
            } else {
                tmp = stack.pop();
                System.out.print(tmp.data+" ");
                tmp = tmp.right;
            }
        }
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
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
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Node root = null;
        for (int x = 0; x < t; x++) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        sc.close();
        inOrder(root);
    }
}
