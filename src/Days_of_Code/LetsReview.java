package Days_of_Code;

import java.util.Scanner;

public class LetsReview {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int count = input.nextInt();
        input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] result = new String[count];

        for (int x = 0; x < count; x++) {

            String element = input.nextLine();

            result[x] = element;

        }

        for(int x = 0; x < result.length; x++) {

            splitChar(result[x]);
        }

    }

    private static void splitChar (String s) {

        String word = s;

        int len = word.length();

        String[] c = word.split("");

        String even = c[0];

        String odd = "";

        for (int x = 1; x < len; x++) {

            if(x % 2 == 0) {

                even += (c[x]);
            }
            else {

                odd += (c[x]);
            }
        }

        System.out.println(even+" "+odd);
    }

}