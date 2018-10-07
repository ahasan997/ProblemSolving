package Data_Structures.Tree;

import java.util.*;

public class LowestCommonAncestor {
    public static Node lca(Node root, int v1, int v2) {
        Node tmp = root;
        while (true) {
            if (v1 > tmp.data && v2 > tmp.data) {
                tmp = tmp.right;
            } else if (v1 < tmp.data && v2 < tmp.data) {
                tmp = tmp.left;
            } else if (v1 == tmp.data || v2 == tmp.data) {
                root = tmp;
                break;
            } else {
                root = tmp;
                break;
            }
        }
        return root;
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
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        scan.close();
        Node ans = lca(root, v1, v2);
        System.out.println(ans.data);
    }
}
