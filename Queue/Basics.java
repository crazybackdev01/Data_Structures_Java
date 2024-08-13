package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Basics {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek()); // Do not throws exception
        System.out.println(queue.element()); // Throws exception
    }
}
