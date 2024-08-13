package Queue;

public class Array_Implementation {
    static class Arrayqueue {
        int front = -1;
        int rear = -1;
        int[] array = new int[5];
        int size = 0;

        public void add(int val) {
            if (rear == array.length - 1) {
                System.out.println("Queue is Overflow");
                return;
            } else if (front == -1 && rear == -1) {
                front = rear = 0;
                array[rear] = val;
            } else {
                array[++rear] = val;
            }
            size++;
        }

        public int remove() {
            if (front == -1 && rear == -1) {
                System.out.println("Queue underflow");
                return -1;
            } else if (front == rear) {
                System.out.println("Deleted last item from queue");
                front = rear = -1;
                return 0;
            } else {
                front++;
                size--;
                return array[front - 1];
            }
        }

        public int peek() {
            if (front == -1 && rear == -1) {
                System.out.println("Queue underflow");
                return -1;
            }
            return array[front];
        }

        public boolean isEmpty() {
            return this.size == 0;
        }

        public void display() {
            if (front == -1 && rear == -1) {
                System.out.println("Queue underflow");
                return;
            }
            for (int i = front; i <= rear; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Arrayqueue queue = new Arrayqueue();
        System.out.println(queue.isEmpty()); // true
        System.out.println(queue.remove()); // Queue underflow , -1
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        if (!queue.isEmpty()) {
            System.out.println("size: " + queue.size); // 5
        }

        queue.display(); // 1 2 3 4 5
        System.out.println(queue.remove()); // 1
        System.out.println(queue.remove()); // 2
        queue.display(); // 3 4 5
    }
}
