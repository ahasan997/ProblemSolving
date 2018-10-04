package Data_Structures.LinkedList;

import java.util.*;
import java.util.stream.IntStream;

public class ReverseALinkedList {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        private SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        private SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        private void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    private static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        List<Integer> arrList = new ArrayList<Integer>();
        SinglyLinkedListNode data = head;

        while (data != null) {
            arrList.add(data.data);
            data = data.next;
        }

        int n = arrList.size();
        SinglyLinkedList nList = new SinglyLinkedList();
        IntStream.range(1,n+1)
                .forEach(i -> {
                    nList.insertNode(arrList.get(n-i));
                });
        return nList.head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList llist = new SinglyLinkedList();
        int llistCount = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < llistCount; i++) {
            int llistItem = Integer.parseInt(sc.nextLine());
            llist.insertNode(llistItem);
        }

        SinglyLinkedListNode llist1 = reverse(llist.head);
        printSinglyLinkedList(llist1);
        sc.close();
    }
}
