package Data_Structures;
import java.util.*;
import java.io.*;

public class SparseArrays {

    static int[] matchingStrings(String[] strings, String[] queries) {

        int stLen = strings.length;

        int qrLen = queries.length;

        int[] rslt = new int[qrLen];

        int counter = 0;

        for (int x = 0; x < qrLen; x++)
        {
            counter = 0;

            for(int y = 0; y < stLen; y++)
            {
                if(queries[x].equals(strings[y]))
                {
                    counter++;
                }
            }

            rslt[x] = counter;
        }

        return rslt;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int stringsCount = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {

            String stringsItem = scanner.nextLine();

            strings[i] = stringsItem;

        }

        int queriesCount = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

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
