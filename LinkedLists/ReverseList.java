package LinkedLists;

import LinkedLists.Basicsll.Nodelocal;
// This is imported by this line because Nodelocal is the public static class inside Basicsll class 

public class ReverseList {
    public static Nodelocal reverseRecursively(Nodelocal head) {
        if (head.next == null)
            return head;
        Nodelocal newHead = reverseRecursively(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static Nodelocal reverseIteratively(Nodelocal head) {

        return head;
    }

    public static void main(String[] args) {
        Nodelocal a = new Nodelocal(2);
        Nodelocal b = new Nodelocal(3);
        Nodelocal c = new Nodelocal(5);
        Nodelocal d = new Nodelocal(6);
        Nodelocal e = new Nodelocal(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Basicsll.traverseListRecursively(a);

        a = reverseRecursively(a);

        Basicsll.traverseListRecursively(a);
    }
}
