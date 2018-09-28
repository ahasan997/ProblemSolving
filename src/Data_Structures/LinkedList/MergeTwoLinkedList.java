package Data_Structures.LinkedList;

import java.util.*;

public class MergeTwoLinkedList {

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

        public void MergeTwoLinkedList(LinkedListNode mNode, LinkedListNode nNode) {
            tail = mNode;
            tail.next = nNode;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine().trim());
        MyLinkedList llist = new MyLinkedList();
        for (int x = 0; x < count; x++) {
            llist.insertNodeAtTail(Integer.valueOf(sc.nextLine()));
        }

        int count2 = Integer.parseInt(sc.nextLine().trim());
        MyLinkedList llist2 = new MyLinkedList();
        for (int x = 0; x < count2; x++) {
            llist2.insertNodeAtTail(Integer.valueOf(sc.nextLine()));
        }

        LinkedListNode nNode2 = llist2.head;

        while (nNode2 != null) {
            LinkedListNode nNode = llist.head;
            int value = nNode2.data;
            LinkedListNode nNode3 = new LinkedListNode(value);
            LinkedListNode tempNode = new LinkedListNode(0);

            while (nNode != null) {
                tempNode = nNode;
                nNode = nNode.next;
            }

            llist.MergeTwoLinkedList(tempNode, nNode3);
            nNode2 = nNode2.next;
        }

        LinkedListNode xNode = llist.head;
        while (xNode != null) {
            System.out.println(xNode.data);
            xNode = xNode.next;
        }
    }
}
