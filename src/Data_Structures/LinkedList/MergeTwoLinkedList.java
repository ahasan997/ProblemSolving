package Data_Structures.LinkedList;

import java.util.*;
import java.util.stream.IntStream;

public class MergeTwoLinkedList {
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

    private static void printSinglyLinkedList(SinglyLinkedListNode node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    private static SinglyLinkedListNode mergeList(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null) {
            head1 = head2;
        } else {
            SinglyLinkedListNode tail = head1;
            SinglyLinkedListNode tmpNode = new SinglyLinkedListNode(0);
            while (tail != null) {
                tmpNode = tail;
                tail = tail.next;
            }
            tmpNode.next = head2;
        }

        List<Integer> arrList = new ArrayList<Integer>();
        SinglyLinkedListNode data = head1;

        while (data != null) {
            arrList.add(data.data);
            data = data.next;
        }
        Collections.sort(arrList);

        int n = arrList.size();
        SinglyLinkedList nList = new SinglyLinkedList();
        IntStream.range(0, n)
                .forEach(i -> {
                    nList.insertNode(arrList.get(i));
                });

        return nList.head;
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

        SinglyLinkedListNode llist3 = mergeList(llist1.head, llist2.head);
        printSinglyLinkedList(llist3);
        sc.close();
    }
}