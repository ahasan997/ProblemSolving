package Data_Structures.LinkedList;

import java.util.*;

public class DeleteNodeByPosition {
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

    private static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode tail = head;
        if (position == 0 && head.next == null) {
            head = null;
        } else if (position == 0) {
            head = head.next;
        } else if (position == 1) {
            for (int x = 0; x <= position; x++) {
                tail = tail.next;
            }
            head.next = tail;
        } else {
            for (int x = 0; x <= position; x++) {
                tail = tail.next;
            }
            SinglyLinkedListNode nextNode = tail;
            tail = head;
            for (int x = 0; x < position - 1; x++) {
                tail = tail.next;
            }
            tail.next = nextNode;
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

        int position = Integer.parseInt(sc.nextLine());
        SinglyLinkedListNode llist1 = deleteNode(llist.head, position);
        printSinglyLinkedList(llist1);
        sc.close();
    }
}