package Data_Structures.Tree;

import java.util.*;

public class TopView {

    private static void topView(Node root) {
        if (root == null) {
            System.out.println(0);
        } else {
            Queue<Node> labelTraversQueue = new LinkedList<>();
            labelTraversQueue.add(root);
            Queue<Integer> distanceQueue = new LinkedList<Integer>();
            ((LinkedList<Integer>) distanceQueue).add(0);
            Hashtable<Integer,Integer> hashtable = new Hashtable<Integer, Integer>();

            while (!labelTraversQueue.isEmpty()) {
                Node current = labelTraversQueue.peek();
                int hd = distanceQueue.peek();

                if (current.left != null) {
                    ((LinkedList<Node>) labelTraversQueue).add(current.left);
                    ((LinkedList<Integer>) distanceQueue).add(hd-1);
                }
                if (current.right != null) {
                    ((LinkedList<Node>) labelTraversQueue).add(current.right);
                    ((LinkedList<Integer>) distanceQueue).add(hd+1);
                }
                if(hashtable.isEmpty()){
                    hashtable.put(hd,current.data);
                } else {
                    if(!hashtable.containsKey(hd)) {
                        hashtable.put(hd,current.data);
                    }
                }
                labelTraversQueue.remove();
                distanceQueue.remove();
            }
            List<Integer> hashKeys = new ArrayList<Integer>(hashtable.keySet());
            Collections.sort(hashKeys);
            for (Integer values : hashKeys) {
                System.out.print(hashtable.get(values)+" ");
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
        topView(root);
    }
}
