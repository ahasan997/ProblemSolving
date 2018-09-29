package Data_Structures.LinkedList;

import java.util.*;

public class DeleteDuplicateValue {
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

        public void RemoveDuplicate(LinkedListNode node) {

            List<Integer> arrList = new ArrayList<Integer>();

            LinkedListNode data = node;
            while (data != null) {
                if (!arrList.contains(data.data)) {
                    arrList.add(data.data);
                }
                data = data.next;
            }
            head = null;
            for (int x = 0; x < arrList.size(); x++) {
                insertNodeAtTail(arrList.get(x));
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

        llist.RemoveDuplicate(llist.head);

        LinkedListNode node = llist.head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
