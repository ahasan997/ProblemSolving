package Data_Structures.LinkedList;

import java.util.*;

public class CompareTwoLinkedList {
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

    private static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        boolean equal = true;
        SinglyLinkedListNode nNode = head1;
        SinglyLinkedListNode nNode2 = head2;

        while (nNode != null) {
            if (nNode2 == null) {
                equal = false;
                break;
            } else {
                if (nNode.data != nNode2.data) {
                    equal = false;
                }
            }
            nNode = nNode.next;
            nNode2 = nNode2.next;
        }
        return equal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinglyLinkedList llist1 = new SinglyLinkedList();
        int llistCount = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < llistCount; i++) {
            int llistItem = Integer.parseInt(sc.nextLine());
            llist1.insertNode(llistItem);
        }

        SinglyLinkedList llist2 = new SinglyLinkedList();
        int llistCount2 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < llistCount2; i++) {
            int llistItem2 = Integer.parseInt(sc.nextLine());
            llist2.insertNode(llistItem2);
        }

        boolean result = compareLists(llist1.head, llist2.head);
        System.out.println(result ? 1 : 0);
        sc.close();
    }
}