package Stacks;

import java.util.Scanner;
import java.util.Stack;

//Move the elements of One stack into another stack in the same Order...
public class CloningStack {
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

        System.out.println("Stack in the Order: " + stack);
        Stack<Integer> reverseStack = new Stack<Integer>();
        while (stack.size() > 0) {
            reverseStack.push(stack.pop());
        }
        System.out.println("Copied Stack in Reverse Order: " + reverseStack);
        Stack<Integer> sameOrderStack = new Stack<Integer>();
        while (reverseStack.size() > 0) {
            sameOrderStack.push(reverseStack.pop());
        }
        System.out.println("Copied Stack in Same Order: " + sameOrderStack);
        sc.close();
    }
}
