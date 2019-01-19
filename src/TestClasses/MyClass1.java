package TestClasses;

import java.util.*;

public class MyClass1 {

    public static void main(String[] args) {

        Scanner bc = new Scanner(System.in);
        String nLine = bc.nextLine();
        bc.close();

        System.out.println("Hello, World.\n" + nLine);

    }
}