package Data_Structures.Heap;

import java.util.*;

public class Qheap1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> myHeap = new PriorityQueue<>();
        int count = sc.nextInt();
        int type = 0;
        int value = 0;
        while(count-->0) {
            type = sc.nextInt();
            switch(type){
                case 1:
                    value = sc.nextInt();
                    myHeap.add(value);
                    break;
                case 2:
                    value = sc.nextInt();
                    myHeap.remove(value);
                    break;
                case 3:
                    System.out.println(myHeap.peek());
            }
        }
    }
}