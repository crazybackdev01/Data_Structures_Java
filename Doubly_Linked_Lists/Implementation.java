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
        Node head = temp;
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
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
    }
}