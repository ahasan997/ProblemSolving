package Data_Structures.LinkedList;

import java.util.*;

public class DeleteNodeByPosition {
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

        public void deleteNodeByPosition(int dPosition) {
            if (dPosition == 0 && head.next == null) {
                head = null;
            } else if (dPosition == 0 && head.next != null) {
                head = head.next;
            } else if (dPosition == 1) {
                tail = head;
                for (int x = 0; x <= dPosition; x++) {
                    tail = tail.next;
                }
                head.next = tail;
            } else {
                tail = head;
                for (int x = 0; x <= dPosition; x++) {
                    tail = tail.next;
                }
                LinkedListNode nextNode = tail;
                tail = head;
                for (int x = 0; x < dPosition - 1; x++) {
                    tail = tail.next;
                }
                tail.next = nextNode;
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

        int toDeletePosition = Integer.valueOf(sc.nextLine().trim());
        llist.deleteNodeByPosition(toDeletePosition);

        LinkedListNode nNode = llist.head;
        while (nNode != null) {
            System.out.print(nNode.data + " ");
            nNode = nNode.next;
        }
    }
}