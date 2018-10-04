package Data_Structures.LinkedList;

import java.util.*;


public class GetNodeValue {
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

    private static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        List<Integer> arrList = new ArrayList<Integer>();
        SinglyLinkedListNode data = head;

        while (data != null) {
            arrList.add(data.data);
            data = data.next;
        }

        if (positionFromTail == 0) {
            return arrList.get(arrList.size() - 1);
        } else {
            return arrList.get((arrList.size() - positionFromTail) - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinglyLinkedList llist1 = new SinglyLinkedList();
        int llistCount = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < llistCount; i++) {
            int llistItem = Integer.parseInt(sc.nextLine());
            llist1.insertNode(llistItem);
        }

        int position = Integer.parseInt(sc.nextLine());
        int result = getNode(llist1.head, position);
        System.out.println(result);
        sc.close();
    }
}