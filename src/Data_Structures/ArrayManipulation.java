package Data_Structures;

public class ArrayManipulation {

    public static void main(String[] args) {

        int n = 10000000;

        int[][] queries = new int[8][3];

        queries[0][0] = 45812;
        queries[0][1] = 100000;
        queries[0][2] = 900000000;
        queries[1][0] = 36521;
        queries[1][1] = 8000000;
        queries[1][2] = 900012544;
        queries[2][0] = 84512;
        queries[2][1] = 400000;
        queries[2][2] = 900078954;
        queries[3][0] = 98541;
        queries[3][1] = 400000;
        queries[3][2] = 900078954;
        queries[4][0] = 95871;
        queries[4][1] = 400000;
        queries[4][2] = 900078954;
        queries[5][0] = 6859;
        queries[5][1] = 400000;
        queries[5][2] = 900078954;
        queries[6][0] = 95841;
        queries[6][1] = 400000;
        queries[6][2] = 900078954;
        queries[7][0] = 48591;
        queries[7][1] = 400000;
        queries[7][2] = 900078954;

        int qLan = queries.length;

        long[][] tray = new long[qLan+1][n];

        for(int x = 0; x < qLan; x++) {

            int a = queries[x][0];

            int b = queries[x][1];

            int d = b-a;

            int e = 0;

            while (e < n) {

                tray[x+1][e] += tray[x][e];
                e++;
            }

            for(int y = 0; y < d+1; y++) {


                tray[x+1][(a+y)-1] = tray[x][(a+y)-1]+queries[x][2];

            }

        }

        long rslt = tray[1][0];

        for(int f = 0; f < qLan; f++) {

            for(int g = 0; g < n; g++) {

                if(tray[f+1][g] > rslt) {

                    rslt = tray[f+1][g];

                }
            }

        }

        System.out.println(rslt);



    }
}