package Data_Structures.LinkedList;

import java.util.*;

public class FindMergePoint {

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

    private static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        List<Integer> arrList = new ArrayList<Integer>();
        SinglyLinkedListNode data1 = head1;
        while (data1 != null) {
            arrList.add(data1.data);
            data1 = data1.next;
        }

        List<Integer> arrList2 = new ArrayList<Integer>();
        SinglyLinkedListNode data2 = head2;
        while (data2 != null) {
            arrList2.add(data2.data);
            data2 = data2.next;
        }

        int result = 0;
        for (int x = 1; x < arrList2.size(); x++) {
            if (arrList2.get(arrList2.size() - x).equals(arrList.get(arrList.size() - x))) {
                result = arrList2.get(arrList2.size() - x);
                if (arrList.size() - x == 0) {
                    break;
                }
            } else {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = Integer.parseInt(sc.nextLine());

        SinglyLinkedList llist1 = new SinglyLinkedList();
        int llist1Count = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < llist1Count; i++) {
            int llistItem = Integer.parseInt(sc.nextLine());
            llist1.insertNode(llistItem);
        }

        SinglyLinkedList llist2 = new SinglyLinkedList();
        int llist2Count = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < llist2Count; i++) {
            int llistItem2 = Integer.parseInt(sc.nextLine());
            llist2.insertNode(llistItem2);
        }

        SinglyLinkedListNode ptr1 = llist1.head;
        SinglyLinkedListNode ptr2 = llist2.head;

        for (int i = 0; i < llist1Count; i++) {
            if (i < index) {
                ptr1 = ptr1.next;
            }
        }

        for (int i = 0; i < llist2Count; i++) {
            if (i != llist2Count - 1) {
                ptr2 = ptr2.next;
            }
        }

        ptr2.next = ptr1;
        int result = findMergeNode(llist1.head, llist2.head);
        System.out.println(result);
        sc.close();
    }
}
