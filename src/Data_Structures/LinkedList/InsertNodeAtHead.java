package Data_Structures.LinkedList;

import java.util.*;

public class InsertNodeAtHead {

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

        public void insertNodeAtHead(int value) {
            LinkedListNode node = new LinkedListNode(value);

            if (head == null) {
                head = node;
            } else {
                LinkedListNode oHead = head;
                head = node;
                head.next = oHead;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine().trim());
        MyLinkedList llist = new MyLinkedList();


        for (int x = 0; x < count; x++) {
            llist.insertNodeAtHead(Integer.valueOf(sc.nextLine()));
        }

        LinkedListNode nNode = llist.head;
        while (nNode != null) {
            System.out.println(nNode.data);
            nNode = nNode.next;
        }
    }
}
