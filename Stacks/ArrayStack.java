package Stacks;

/*
class Stack<T> {
    int STACK_SIZE;
    ArrayList<T> stack = new ArrayList<T>();

    public Stack(int size) {
        this.STACK_SIZE = size;
    }

}
 */
class Stack {
    private int[] arr = new int[50];
    private int idx = 0;

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is Full!");
            return;
        }
        this.arr[idx] = data;
        this.idx++;
    };

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        int top = arr[idx - 1];
        arr[idx - 1] = 0;
        idx--;
        return top;
    };

    public int peek() {
        if (this.isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }

        return arr[this.idx - 1];
    };

    public void display() {
        if (this.isEmpty()) {
            System.out.println("Stack is Empty!");
            return;
        }
        for (int i = 0; i < this.size(); i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int size() {
        return this.idx;
    }

    public boolean isEmpty() {
        if (idx == 0)
            return true;
        return false;
    }

    public boolean isFull() {
        if (idx == arr.length)
            return true;
        return false;
    }

    public int capacity() {
        return this.arr.length;
    }
}

public class ArrayStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.size());
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(9);
        System.out.println("First stack: ");
        stack.display(); // 2 3 5 6 7 9
        System.out.println(stack.size()); // 6
        stack.pop();
        System.out.println(stack.size()); // 5
        System.out.println("Second stack: ");
        stack.display(); // 2 3 4 5 6 7
        System.out.println(stack.isEmpty()); // false
        System.out.println(stack.isFull()); // false

    }

}
