package Data_Structures;

import java.util.*;

public class LinkedListPrint {

    static class SinglyLinkedList {

        public SinglyLinkedListNode head;

        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {

            this.head = null;

            this.tail = null;

        }

        public void insertNode(int nodeData) {

            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {

                this.head = node;

            } else {

                this.tail.next = node;

            }

            this.tail = node;

        }

    }

    static class SinglyLinkedListNode {

        public int data;

        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {

            this.data = nodeData;

            this.next = null;

        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    static void printLinkedList(SinglyLinkedListNode head) {

        while (head != null) {

            System.out.println(head.data);

            head = head.next;

        }

    }

    public static void main(String[] args) {

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {

            int llistItem = scanner.nextInt();

            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }

        printLinkedList(llist.head);

        scanner.close();


    }

}