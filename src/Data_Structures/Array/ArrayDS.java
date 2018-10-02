package Data_Structures.Array;

import java.util.*;
import java.io.*;

public class ArrayDS {

    static int[] reverseArray(int[] a) {

        int aLen = a.length;
        int[] nArray = new int[aLen];

        for (int x = 0; x < aLen; x++) {
            nArray[x] = a[aLen - (x + 1)];
        }

        return nArray;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int arrCount = Integer.parseInt(scanner.nextLine().trim());
        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] res = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);

            if (i != res.length - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }

}