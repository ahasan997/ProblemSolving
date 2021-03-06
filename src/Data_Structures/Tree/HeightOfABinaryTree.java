package Data_Structures.Tree;

import java.util.*;

public class HeightOfABinaryTree {

    public static int getHeight(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftMax = getHeight(root.left);
            int rightMax = getHeight(root.right);

            if (leftMax > rightMax) {
                return (leftMax + 1);
            } else {
                return (rightMax + 1);
            }
        }
    }

    public static int height(Node root) {
        int value = getHeight(root) - 1;
        return value;
    }

    public static Node insert(Node root, int data) {
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
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        sc.close();
        int height = height(root);
        System.out.println(height);
    }
}
