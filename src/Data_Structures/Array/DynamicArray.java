package Data_Structures.Array;

import java.util.*;

public class DynamicArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());
        List<List<Integer>> lists = new ArrayList<>();

        for (int x = 0; x < n; x++){
            List<Integer> list = new ArrayList<>();
            lists.add(list);
        }

        int lastAnswer = 0;
        int q = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < q; i++) {
            String[] query = sc.nextLine().split(" ");
            int firstNum = Integer.valueOf(query[0]);
            int x = Integer.valueOf(query[1]);
            int y = Integer.valueOf(query[2]);
            int z = (x ^ lastAnswer)%n;
            List<Integer> myList = lists.get(z);

            if(firstNum == 1) {
                myList.add(y);
            } else {
                lastAnswer = myList.get(y % myList.size());
                System.out.println(lastAnswer);
            }
        }
        sc.close();
    }
}
