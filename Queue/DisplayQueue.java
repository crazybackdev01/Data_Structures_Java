package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class DisplayQueue {
    static void display(Queue<Integer> queue) {
        Queue<Integer> duplicateQueue = new LinkedList<>();
        while (queue.size() > 0) {
            System.out.print(queue.peek() + " ");
            duplicateQueue.add(queue.poll());
        }
        while (duplicateQueue.size() > 0) {
            queue.add(duplicateQueue.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        display(queue);
    }
}
