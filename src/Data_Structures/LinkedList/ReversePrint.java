package Data_Structures.LinkedList;

import java.util.*;

public class ReversePrint {
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

    private static void reversePrint(SinglyLinkedListNode head) {
        List<Integer> arrList = new ArrayList<Integer>();
        SinglyLinkedListNode data = head;

        while (data != null) {
            arrList.add(0, (data.data));
            data = data.next;
        }
        arrList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList llist = new SinglyLinkedList();
        int llistCount = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < llistCount; i++) {
            int llistItem = Integer.parseInt(sc.nextLine());
            llist.insertNode(llistItem);
        }

        reversePrint(llist.head);
        sc.close();
    }
}