package Data_Structures.LinkedList;

import java.util.*;

public class CompareTwoLinkedList {

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

        int equal = 1;

        LinkedListNode nNode = llist.head;
        LinkedListNode nNode2 = llist2.head;

        while (nNode != null) {
            if(nNode.data != nNode2.data){
                equal = 0;
            }
            nNode = nNode.next;
            nNode2 = nNode2.next;
        }

        System.out.println(equal);
    }
}