package Data_Structures.LinkedList;

import java.util.*;

public class InsertingANodeIntoSortedDList {

    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        private DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        private DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        private void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);
            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }
            this.tail = node;
        }
    }

    private static void printDoublyLinkedList(DoublyLinkedListNode node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    private static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        List<Integer> arrList = new ArrayList<Integer>();
        DoublyLinkedListNode node = head;

        while (node != null) {
            arrList.add(node.data);
            node = node.next;
        }
        arrList.add(data);
        Collections.sort(arrList);
        DoublyLinkedList llist = new DoublyLinkedList();
        for (int x = 0; x < arrList.size(); x++) {
            llist.insertNode(arrList.get(x));
        }

        head = llist.head;
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList llist = new DoublyLinkedList();
        int llistCount = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < llistCount; i++) {
            int llistItem = Integer.parseInt(sc.nextLine());
            llist.insertNode(llistItem);
        }

        int data = Integer.parseInt(sc.nextLine());
        DoublyLinkedListNode llist1 = sortedInsert(llist.head, data);
        printDoublyLinkedList(llist1);
        sc.close();
    }
}
