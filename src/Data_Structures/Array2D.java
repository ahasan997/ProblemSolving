package Data_Structures;
import java.util.*;
import java.io.*;

public class Array2D {

    static int hourglassSum(int[][] arr) {

        int[] allSum = new int[16];

        int i = 0;

        for (int x = 0; x < 4; x++)
        {

            for (int y = 0; y < 4; y++)
            {

                int m = arr[x][y]+arr[x][y+1]+arr[x][y+2]+arr[x+1][y+1]+arr[x+2][y]+arr[x+2][y+1]+arr[x+2][y+2];

                allSum[i] = m;

                i++;

            }

        }

        int j = allSum[0];

        for (int n = 1; n < allSum.length; n++)
        {
            if (allSum[n] > j)
            {
                j = allSum[n];

            }

        }

        return j;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {

            String[] arrRowItems = scanner.nextLine().split(" ");

            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {

                int arrItem = Integer.parseInt(arrRowItems[j]);

                arr[i][j] = arrItem;

            }

        }

        int result = hourglassSum(arr);

        System.out.println(result);

        scanner.close();

    }

}