package LinkedLists;

public class Basicsll {

    public static class Nodelocal {
        int data;
        Nodelocal next;

        public Nodelocal(int data) {
            this.data = data;
        }
    }

    // Methods if No class of LinkedList is given only head is given
    public static void traverseListIteratively(Nodelocal head) {
        Nodelocal temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
    }

    public static void traverseListRecursively(Nodelocal head) {
        if (head == null) {
            System.out.println();
            return;
        }
        System.out.print(head.data + "-> ");
        traverseListRecursively(head.next);
    }

    public static void reverseDisplayList(Nodelocal head) {
        if (head == null)
            return;
        reverseDisplayList(head.next);
        System.out.print(head.data + "-> ");
    }

    public static int length(Nodelocal head) {
        Nodelocal temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static void insertAtEndlocal(Nodelocal head, int data) {
        Nodelocal newNode = new Nodelocal(data);
        Nodelocal temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void main(String[] args) {
        NewLinkedList list = new NewLinkedList();
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(8);
        list.insertAtEnd(9);

        System.out.println("Length of list: " + list.size);
        list.displayList();
        list.insertAtHead(19);
        System.out.println();
        System.out.println("Length of list: " + list.size);
        list.displayList();
        System.out.println();
        list.insertAtIndex(2, 14);
        list.insertAtIndex(3, 10);
        System.out.println("Length of list: " + list.size);
        list.displayList();
        System.out.println();
        list.getElementAtIndex(3);
        // list.displayList();
        list.deleteElementAtIndex(3);
        list.displayList();
        /*
         * Node a = new Node(2);
         * Node b = new Node(3);
         * Node c = new Node(4);
         * Node d = new Node(5);
         * Node e = new Node(6);
         * a.next = b;
         * b.next = c;
         * c.next = d;
         * d.next = e;
         * 
         * traverseListIteratively(a);
         * System.out.println();
         * traverseListRecursively(a);
         * System.out.println();
         * reverseDisplayList(a);
         */

        /*
         * Nodelocal a = new Nodelocal(2);
         * Nodelocal b = new Nodelocal(3);
         * Nodelocal c = new Nodelocal(4);
         * a.next = b;
         * b.next = c;
         * 
         * traverseListIteratively(a);
         * System.out.println();
         * insertAtEndlocal(a, 1410);
         * traverseListIteratively(a);
         */
    }
}