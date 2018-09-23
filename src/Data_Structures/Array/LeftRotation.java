package Data_Structures.Array;

import java.util.*;

public class LeftRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);
        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        for (int x = 0; x < d; x++) {
            int z = a[0];

            for (int y = 0; y < n - 1; y++) {
                a[y] = a[y + 1];
            }
            a[n - 1] = z;
        }

        for (int m : a) {
            System.out.print(m + " ");
        }
        scanner.close();
    }
}
