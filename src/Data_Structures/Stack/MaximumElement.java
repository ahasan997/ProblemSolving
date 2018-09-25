package Data_Structures.Stack;

import java.util.*;

public class MaximumElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> MyStack = new Stack<>();

        int count = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < count; i++) {
            String[] element = scanner.nextLine().split(" ");

            if (Integer.valueOf(element[0]) == 1) {
                MyStack.push(Integer.valueOf(element[1]));
            } else if (Integer.valueOf(element[0]) == 2) {
                MyStack.pop();
            } else if (Integer.valueOf(element[0]) == 3) {
                int mSize = MyStack.size();
                if (mSize != 0) {
                    int result = MyStack.peek();
                    for (int z : MyStack) {
                        result = Math.max(result, z);
                    }
                    System.out.println(result);
                }
            }
        }
    }
}

