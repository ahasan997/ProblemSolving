package Data_Structures.LinkedList;

import java.util.*;

public class InsertNodeAtTail {

    static class LinkedListNode {
        public int data;
        public LinkedListNode next;

        public LinkedListNode(int ndata) {
            this.data = ndata;
            this.next = null;
        }
    }

    static class MyLinkedList {
        public LinkedListNode head;

        MyLinkedList() {
            this.head = null;
        }
    }

    public static void printLinkedList(LinkedListNode node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static LinkedListNode insertNodeAtTail(LinkedListNode head, int value) {
        LinkedListNode node = new LinkedListNode(value);
        if (head == null) {
            head = node;
        } else {
            head.next = insertNodeAtTail(head.next, value);
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine().trim());
        MyLinkedList llist = new MyLinkedList();

        for (int x = 0; x < count; x++) {
            int a = Integer.valueOf(sc.nextLine());
            LinkedListNode llist_head = insertNodeAtTail(llist.head, a);
            llist.head = llist_head;
        }
        printLinkedList(llist.head);
        sc.close();
    }
}