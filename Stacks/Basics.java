package Stacks;

import java.util.Stack;

public class Basics {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(2);
        stack.push(3);
        stack.push(8);
        stack.push(18);
        stack.push(19);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack);

        // To get the element at position K
        /*
         * while(stack.size() > k){
         * stack.pop();
         * }
         * System.out.println(stack.peek());
         * System.out.println(stack);
         */
        // To get the 1st elements at postion 1
        while (stack.size() > 1) {
            stack.pop();
        }
        System.out.println(stack.peek());
        System.out.println(stack);

    }
}