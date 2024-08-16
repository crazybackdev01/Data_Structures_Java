package Trees;

import java.util.LinkedList;
import java.util.Queue;
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

    public void display() {
        System.out.println("Preorder Traversal: ");
        preorderTraversal(this.root);
        System.out.println();
        System.out.println("Inorder Traversal: ");
        inorderTraversal(root);
        System.out.println();
        System.out.println("Postorder Traversal: ");
        postorderTraversal(root);
        System.out.println();
        System.out.println("Level Order Traversal: ");
        levelorderTraversal(root);
    }

    private void preorderTraversal(Node root) {
        // Base case
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    private void inorderTraversal(Node root) {
        // Base case
        if (root == null) {
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    private void postorderTraversal(Node root) {
        // Base case
        if (root == null) {
            return;
        }

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    private void levelorderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node f = queue.poll();
            System.out.print(f.data + " ");

            if (f.left != null) {
                queue.offer(f.left);
            }
            if (f.right != null) {
                queue.offer(f.right);
            }
        }
        System.out.println();
        return;
    }
}

public class Basics {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        System.out.println(tree.root.data);
        System.out.println(tree.root.left.data);
        System.out.println(tree.root.right.data);

        tree.display();
    }
}
