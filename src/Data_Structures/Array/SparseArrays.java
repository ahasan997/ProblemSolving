package Data_Structures.Array;

import java.util.*;
import java.io.*;

public class SparseArrays {

    static int[] matchingStrings(String[] strings, String[] queries) {

        int stLen = strings.length;
        int qrLen = queries.length;
        int[] rslt = new int[qrLen];
        int counter = 0;

        for (int x = 0; x < qrLen; x++) {
            counter = 0;

            for(int y = 0; y < stLen; y++) {
                if(queries[x].equals(strings[y])) {
                    counter++;
                }
            }
            rslt[x] = counter;
        }

        return rslt;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int stringsCount = Integer.parseInt(scanner.nextLine().trim());
        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = Integer.parseInt(scanner.nextLine().trim());
        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            System.out.println((res[i]));
            if (i != res.length - 1) {
                System.out.println("");
            }
        }

        scanner.close();
    }
}