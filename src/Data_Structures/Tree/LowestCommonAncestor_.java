package Data_Structures.Tree;

import java.util.*;

public class LowestCommonAncestor_ {
    private static Node v1Node;
    private static Node v2Node;

    public static Node lca(Node root, int v1, int v2) {
        preOrder(root,v1,v2);
        System.out.println(v1Node.data+" "+v2Node.data);
        return root;

    }

    public static void preOrder(Node root, int value1, int value2) {
        if(root == null) {
            return;
        }
        if(root.data == value1) {
            v1Node = root;
        }

        if(root.data == value2) {
            v2Node = root;
        }
        preOrder(root.left,value1,value2);
        preOrder(root.right,value1,value2);
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
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        scan.close();
        Node ans = lca(root,v1,v2);
//        System.out.println(ans.data);
    }
}
