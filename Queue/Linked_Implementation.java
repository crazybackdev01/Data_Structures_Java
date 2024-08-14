package Queue;

public class Linked_Implementation {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class LinkedQueue {

        private int size = 0;
        private Node front = null;
        private Node rear = null;

        public void add(int data) {
            Node newNode = new Node(data);
            if (size == 0) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
            size++;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return 0;
            }
            return front.data;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue underflow");
                return 0;
            } else {
                Node temp = front;
                front = front.next;
                size--;
                return temp.data;
            }
        }

        public int size() {
            return size;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return;
            } else {
                Node temp = front;
                while (temp != null) {
                    System.out.println(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }

        public boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
    }
}
