package Data_Structures.LinkedList;

import java.util.*;

public class ReverseALinkedList {

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

        public void reverseALinkedList() {
            List<Integer> arrList = new ArrayList<Integer>();
            LinkedListNode data = head;

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

        LinkedListNode data = llist.head;
        while (data != null) {
            System.out.println(data.data);
            data = data.next;
        }
    }
}
