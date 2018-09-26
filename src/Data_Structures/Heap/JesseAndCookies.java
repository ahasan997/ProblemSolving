package Data_Structures.Heap;

import java.util.*;

public class JesseAndCookies {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] element = sc.nextLine().split(" ");

        int count = Integer.valueOf(element[0]);
        int k = Integer.valueOf(element[1]);
        boolean kHeighest = false;
        int opration = 0;

        ArrayList<Integer> arr = new ArrayList<Integer>();
        String[] ArrMembers = sc.nextLine().split(" ");

        for(int x = 0; x < count; x++){
            int value = Integer.valueOf(ArrMembers[x]);
            arr.add(value);

            if(k > value){
                kHeighest = true;
            } else {
                kHeighest = false;
            }
        }

        int min = arr.get(0);

        for(int x: arr){
            min = Math.min(min,x);
        }

        if(!kHeighest){
            while (k > min){
                int sweetness = arr.get(0)+2*arr.get(1);
                arr.remove(0);
                arr.remove(0);

                int len = arr.size();
                int z = 0;

                for (int x = 0; x < len; x++){
                    if(sweetness > arr.get(x)){
                        z++;
                    }
                }

                arr.add(z,sweetness);
                min = arr.get(0);

                for (int x: arr){
                    min = Math.min(min,x);
                }
                opration++;
            }
        }

        if(opration == 0){
            System.out.println(-1);
        } else {
            System.out.println(opration);
        }
    }
}