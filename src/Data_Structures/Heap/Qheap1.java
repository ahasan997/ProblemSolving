package Data_Structures.Heap;

import java.util.*;

public class Qheap1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine().trim());

        ArrayList<Integer> myHeap = new ArrayList<Integer>();

        for(int x = 0; x < count; x++){
            String[] element = sc.nextLine().split(" ");

            if (Integer.valueOf(element[0]) == 1){
                if(myHeap.size() == 0){
                    myHeap.add(Integer.valueOf(element[1]));
                }else {
                    myHeap.add(Integer.valueOf(element[1]));
                    int k = myHeap.size()-1;
                    while (k > 0){
                        int p = (k-1)/2;
                        int nItem = myHeap.get(k);
                        int oItem = myHeap.get(p);

                        if(nItem > oItem){
                            myHeap.set(p,nItem);
                            myHeap.set(k,oItem);
                            k = p;
                        } else {
                            break;
                        }
                    }
                }
            } else if(Integer.valueOf(element[0]) == 2 && myHeap.size() != 0){
                int rm = Integer.valueOf(element[1]);
                for(int i = 0; i < myHeap.size(); i++){
                    if(myHeap.get(i) == rm){
                        myHeap.remove(i);
                        break;
                    }
                }
            } else if (Integer.valueOf(element[0]) == 3 && myHeap.size() != 0){
                int min = myHeap.get(0);
                for(int y: myHeap) {
                    min = Math.min(y,min);
                }
                System.out.println(min);
            }
        }
    }
}