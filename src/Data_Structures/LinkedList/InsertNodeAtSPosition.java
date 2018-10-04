package Data_Structures.LinkedList;

import java.util.*;

public class InsertNodeAtSPosition {
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

    private static void printSinglyLinkedList(SinglyLinkedListNode node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    private static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);

        if (position == 0) {
            SinglyLinkedListNode oHead = head;
            head = node;
            head.next = oHead;
        } else {
            SinglyLinkedListNode tail = head;
            for (int x = 1; x < position; x++) {
                tail = tail.next;
            }
            SinglyLinkedListNode oHead = tail.next;
            tail.next = node;
            node.next = oHead;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList llist = new SinglyLinkedList();
        int llistCount = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < llistCount; i++) {
            int llistItem = Integer.parseInt(sc.nextLine());
            llist.insertNode(llistItem);
        }

        int data = Integer.parseInt(sc.nextLine());
        int position = Integer.parseInt(sc.nextLine());

        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);
        printSinglyLinkedList(llist_head);
        sc.close();
    }
}