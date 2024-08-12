package Stacks;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedStack {

    Node TOP = null;
    int size = 0;

    void push(int data) {
    }

    int pop() {
        return -1;
    }

    int peek() {
        return -1;
    }

    boolean isEmpty() {
        return false;
    }

    boolean isFull() {
        return false;
    }

    int size() {
        return this.size;
    }
}

public class LinkedStacks {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        System.out.println(stack.size());
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(9);
        System.out.println("First stack: ");
        // stack.display(); // 2 3 5 6 7 9
        System.out.println(stack.size()); // 6
        stack.pop();
        System.out.println(stack.size()); // 5
        System.out.println("Second stack: ");
        // stack.display(); // 2 3 4 5 6 7
        System.out.println(stack.isEmpty()); // false
        System.out.println(stack.isFull()); // false
    }
}
