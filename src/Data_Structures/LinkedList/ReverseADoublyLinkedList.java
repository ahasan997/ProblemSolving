package Data_Structures.LinkedList;

import java.util.*;

public class ReverseADoublyLinkedList {

    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int ndata) {
            this.data = ndata;
            this.next = null;
            this.prev = null;
        }
    }

    static class MyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        MyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNodeAtTail(int value) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(value);

            if (head == null) {
                head = node;
            } else {
                tail.next = node;
                node.prev = this.tail;
            }
            tail = node;
        }

        public void reverseALinkedList() {
            List<Integer> arrList = new ArrayList<Integer>();
            DoublyLinkedListNode data = head;

            while (data != null) {
                arrList.add(0, (data.data));
                data = data.next;
            }
            head = null;
            for (int x : arrList) {
                insertNodeAtTail(x);
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

        llist.reverseALinkedList();

        DoublyLinkedListNode data = llist.head;
        while (data != null) {
            System.out.println(data.data);
            data = data.next;
        }
    }
}
