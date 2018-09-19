package Days_of_Code;
import java.util.*;

public class ConditionalStatements {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(n % 2 == 0) {

            if(n > 1 & n < 6) {

                System.out.println("Not Weird");

            }

            else if(n > 5 & n < 21) {

                System.out.println("Weird");

            }

            else if(n > 20) {

                System.out.println("Not Weird");

            }

        }

        else {

            System.out.println("Weird");

        }

        scanner.close();
    }
}
