package Doubly_Linked_Lists;

// public void display(Node head) {
// Node temp = head;
// while (temp != null) {
// System.out.println(temp.data + " ");
// temp = temp.next;
// }
// System.out.println();
// }

// public class Implementation {
// public static void main(String[] args) {
// Node a = new Node(1);
// Node b = new Node(2);
// Node c = new Node(3);
// Node d = new Node(4);
// Node e = new Node(5);

// a.next = b;
// b.previous = a;
// b.next = c;
// c.previous = a;
// c.next = d;
// d.previous = c;
// d.next = e;
// e.previous = d;
// }
// }
class Node {
    int data;
    Node next;
    Node previous;

    Node(int data) {
        this.data = data;
    }
}

public class Implementation {
    static void displayByHead(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void displayByTail(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.previous;
        }
        System.out.println();
    }

    static void displayByAnyNode(Node node) {
        // find head by the node
        // traverse through the head till tail
        Node temp = node;
        while (temp.previous != null) {
            temp = temp.previous;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node insertAtHead(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
        return newNode;
    }

    static Node insertAtTail(Node head, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.previous = temp;
        temp = newNode;
        return newNode;
    }

    static void insertAtIndex(Node head, int index, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        newNode.previous = temp.previous;
        temp.previous.next = newNode;
        newNode.next = temp;
        temp.previous = newNode;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b; // 1 -> 2
        b.previous = a; // 1 <=> 2
        b.next = c;
        c.previous = b;
        c.next = d;
        d.previous = c;
        d.next = e;
        e.previous = d;

        displayByHead(a);
        displayByTail(e);
        displayByAnyNode(d);
        Node newHead = insertAtHead(a, 10);
        displayByHead(newHead);
        Node newTail = insertAtTail(e, 11);
        displayByTail(newTail);
        displayByHead(newHead);
        insertAtIndex(newHead, 2, 100);
        displayByHead(newHead);
    }
}