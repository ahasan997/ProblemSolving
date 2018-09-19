package Days_of_Code;
import java.util.*;

public class DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int j;
        double e;
        String t;

        j = Integer.parseInt(scan.nextLine());

        e = Double.parseDouble(scan.nextLine());

        t = scan.nextLine();

        System.out.println(i+j);
        System.out.println(d+e);
        System.out.println(s.concat(t));

    }
}
