package Trees;

import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        Scanner sc = new Scanner(System.in);
        root = createTree(sc);
    }

    private Node createTree(Scanner sc) {
        int data = sc.nextInt();
        // base case
        if (data == -1) {
            return null;
        }
        // Recursive case
        Node newNode = new Node(data);
        newNode.left = createTree(sc);
        newNode.right = createTree(sc);
        return newNode;
    }
}

public class Basics {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        System.out.println(tree.root.data);
        System.out.println(tree.root.left.data);
        System.out.println(tree.root.right.data);
    }
}
