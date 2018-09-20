package Days_of_Code;
import java.util.*;

public class Loops {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int x = 1;
        int y = 0;

        do{
            y = n * x;
            System.out.println(n+" x "+x+" = "+y);
            x++;
        }
        while (x <= 10);

        scanner.close();

    }

}
