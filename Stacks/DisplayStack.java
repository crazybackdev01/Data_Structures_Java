package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class DisplayStack {
    public static void displayStackReverseRecursively(Stack<Integer> s) {
        if (s.size() == 0)
            return;
        int top = s.pop();
        System.out.println(top);
        displayStackReverseRecursively(s);
        s.push(top);
    }

    public static void displayStackRecursively(Stack<Integer> s) {
        if (s.size() == 0)
            return;
        int top = s.pop();
        displayStackRecursively(s);
        System.out.println(top);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the " + i + " number element");
            int x = sc.nextInt();
            stack.push(x);
        }

        Stack<Integer> copyStack = new Stack<Integer>();
        while (stack.size() > 0) {
            copyStack.push(stack.pop());
        }

        System.out.println("Entered Elements in the Same orderby Stack: ");
        while (copyStack.size() > 0) {
            System.out.print(copyStack.peek());
            stack.push(copyStack.pop());
        }
        System.out.println();
        int[] array = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            array[i] = stack.pop();
        }
        System.out.println("Entered elements in the same order by Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            stack.push(array[i]);
        }
        System.out.println();
        System.out.println(stack);
        displayStackRecursively(stack);
        displayStackReverseRecursively(stack);
        sc.close();
    }
}
