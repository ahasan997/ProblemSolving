package Data_Structures.Array;

import java.util.*;

public class ArrayManipulation {

    static long arrayManipulation(int n, int[][] queries) {
        int querieLength = queries.length;
        long[] newArray = new long[n];
        long result = 0;
        int x = 0;

        while (x < querieLength) {
            int startFrom = queries[x][0];
            int endTo = queries[x][1];
            int counts = endTo - startFrom;
            int y = 0;

            while (y != counts + 1) {
                newArray[(startFrom + y) - 1] += queries[x][2];
                long dc = newArray[(startFrom + y) - 1];
                result = Math.max(result, dc);
                y++;
            }
            x++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] queries = new int[3][3];
        int n = 5;

        for (int i = 0; i < 3; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);
        System.out.println(String.valueOf(result));

        scanner.close();
    }
}