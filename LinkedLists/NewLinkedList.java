package LinkedLists;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class NewLinkedList {
    Node head = null;
    Node tail = null;
    int size = 0; // This will make the operations related to the size O(1)

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (this.head == null) {
            this.head = newNode;
        } else {
            this.tail.next = newNode;
        }
        this.tail = newNode;
        size++;
    }

    // Display
    public void displayList() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    /*
     * public int size() {
     * int count = 0;
     * Node temp = this.head;
     * while (temp != null) {
     * count++;
     * temp = temp.next;
     * }
     * return count;
     * }
     */

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        size++;
    }

    public void insertAtIndex(int index, int data) {
        Node newNode = new Node(data);
        Node temp = this.head;

        // 1 -> 2 -> 3 -> 4
        // 0 1 2 3
        // if index = 4 => Call insertAtEnd(data)
        if (index == this.size) {
            insertAtEnd(data);
            return;
        }

        // 1 -> 2 -> 3 -> 4
        // 0 1 2 3
        // if index = 0 => Call inserAtHead(data)

        if (index == 0) {
            insertAtHead(data);
            return;
        }

        if (index > this.size || index < 0) {
            System.out.println("Wrong index");
            return;
        }

        // for index greater than 0 but less than size (0, size) or [1, size-1]
        // for 1, 2, 3,
        for (int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void getElementAtIndex(int index) {
        Node temp = this.head;

        // index = 0, 1, 2, 3, ,......, size-1, size
        if (index < 0 || index >= this.size) {
            System.out.println("Wrong Index entered");
        }

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        System.out.println("Element at Index " + index + " is: " + temp.data);
    }

    public void deleteElementAtIndex(int index) {
        Node temp = this.head;

        if (index < 0 || index >= this.size) {
            System.out.println("Wrong index");
        }

        for (int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }

        Node deletedNode = temp.next;
        temp.next = deletedNode.next;
        deletedNode.next = null;
        size--;
    }

}

// https://projects.100xdevs.com/tracks/javascript-1/Javascript-101-3