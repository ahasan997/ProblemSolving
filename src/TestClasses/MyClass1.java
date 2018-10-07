package TestClasses;

import java.util.*;

public class MyClass1 {

    public static void topView(Node root) {

        if (root != null) {
            Queue<Node> myQueue = new LinkedList<>();
            Queue<Integer> queue = new LinkedList<Integer>();
            ((LinkedList<Node>) myQueue).add(root);
            ((LinkedList<Integer>) queue).add(0);
            int hd = 0;
            List<Integer> list1 = new ArrayList<Integer>();
            Hashtable<Integer,List<Integer>> hashtable = new Hashtable<Integer, List<Integer>>();
            list1.add(root.data);
            hashtable.put(hd,list1);

            while (!myQueue.isEmpty()) {
                Node current = myQueue.peek();
//                System.out.print(current.data + " ");
                if (current.left != null) {
                    int lhd = queue.peek() - 1;
                    List<Integer> nList = hashtable.get(lhd);
                    if(nList == null) {
                        nList = new ArrayList<Integer>();
                        hashtable.put(lhd,nList);
                    }
                    nList.add(current.left.data);
                    ((LinkedList<Node>) myQueue).add(current.left);
                }
                if (current.right != null) {
                    int rhd = queue.peek() + 1;
                    List<Integer> nList = hashtable.get(rhd);
                    if(nList == null) {
                        nList = new ArrayList<Integer>();
                        hashtable.put(rhd,nList);
                    }
                    nList.add(current.right.data);
                    ((LinkedList<Node>) myQueue).add(current.right);
                }
                myQueue.remove();
            }
            queue.remove();

            System.out.println(hashtable);
            System.out.println(myQueue);
            System.out.println(queue);
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
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }
}