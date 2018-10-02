package Data_Structures.Array;

import java.util.*;
import java.util.stream.IntStream;

public class DynamicArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] count = sc.nextLine().split(" ");
        int n = Integer.parseInt(count[0]);
        int q = Integer.parseInt(count[1]);
        int lastAnswer = 0;
        int j = 0;

        List<List<Integer>> lists = new ArrayList<>();

        IntStream.range(0,n)
                .forEach(i -> {
                    List<Integer> list = new ArrayList<>();
                    lists.add(list);
                });

        while (j < q) {
            String[] query = sc.nextLine().split(" ");
            int firstNum = Integer.valueOf(query[0]);
            int x = Integer.valueOf(query[1]);
            int y = Integer.valueOf(query[2]);
            int z = (x ^ lastAnswer)%n;
            List<Integer> myList = lists.get(z);

            switch (firstNum) {
                case 1:
                    myList.add(y);
                    break;
                case 2:
                    lastAnswer = myList.get(y % myList.size());
                    System.out.println(lastAnswer);
                    break;
            }
            j++;
        }
        sc.close();
    }
}