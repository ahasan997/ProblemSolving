package Data_Structures.LinkedList;

import java.util.*;

public class InsertNodeAtSPosition {

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
        public LinkedListNode tail;

        MyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNodeAtTail(int value) {
            LinkedListNode node = new LinkedListNode(value);

            if (head == null) {
                head = node;
            } else {
                tail.next = node;
            }

            tail = node;
        }

        public void insertNodeAtSPosition(int value, int position) {
            LinkedListNode node = new LinkedListNode(value);

            if (position == 0) {
                LinkedListNode oHead = head;
                head = node;
                head.next = oHead;
            } else {
                tail = head;
                for (int x = 1; x < position; x++) {
                    tail = tail.next;
                }
                LinkedListNode oHead = tail.next;
                tail.next = node;
                node.next = oHead;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine().trim());
        MyLinkedList llist = new MyLinkedList();

        for (int x = 0; x < count; x++) {
            llist.insertNodeAtTail(Integer.valueOf(sc.nextLine()));
        }

        LinkedListNode data2 = llist.head;
        while (data2 != null) {
            System.out.println(data2.data);
            data2 = data2.next;
        }

        int newElement = Integer.valueOf(sc.nextLine().trim());
        int newPosition = Integer.valueOf(sc.nextLine().trim());

        llist.insertNodeAtSPosition(newElement,newPosition);

        LinkedListNode nNode = llist.head;
        while (nNode != null) {
            System.out.println(nNode.data);
            nNode = nNode.next;
        }
    }
}