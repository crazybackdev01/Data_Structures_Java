package Trees;

import java.util.Scanner;

class BinarySearchTree {
    private Node root;

    BinarySearchTree() {
        this.root = buildTree();
    }

    private Node buildTree() {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        Node root = null;

        while (d != -1) {
            root = insertNode(root, d);
            d = sc.nextInt();
        }
        return root;
    }

    // O(H) time complexity
    private Node insertNode(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data <= root.data) {
            root.left = insertNode(root.left, data);
        }

        if (data > root.data) {
            root.right = insertNode(root.right, data);
        }

        return root;
    }

    public void display() {
        inorderDisplay(this.root);
    }

    private void inorderDisplay(Node root) {
        // Base case
        if (root == null) {
            return;
        }

        inorderDisplay(root.left);
        System.out.print(root.data + " ");
        inorderDisplay(root.right);
    }

    boolean search(int data) {
        return searchFunction(this.root, data);
    }

    private boolean searchFunction(Node root, int data) {
        // two Base cases
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        }

        if (root.data >= data) {
            return searchFunction(root.left, data);
        } else {
            return searchFunction(root.left, data);
        }
    }

    void delete(int data) {
        deleteFunction(this.root, data);
    }

    private Node deleteFunction(Node root, int data) {
        // Base case (There is no node with given data)
        if (root == null) {
            return null;
        }
        // Recursive case
        if (data > root.data) {
            root.right = deleteFunction(root.right, data);
        } else if (data < root.data) {
            root.left = deleteFunction(root.left, data);
        } else {
            // Case 1: No children
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: 1 children
            else if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            }
            // Case 3: 2 children
            else {
                // find the Maximum node in the Left subtree
                Node temp = root.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                // Replace the root's value with the Max Node value
                root.data = temp.data;
                root.left = deleteFunction(root.left, temp.data);
            }

        }

        return root;
    }
}

public class BST {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.display();
        boolean flag = tree.search(3);
        System.out.println();
        if (flag) {
            System.out.println("Element founded");
        } else {
            System.out.println("Not present");
        }
        tree.delete(3);
        tree.display();

    }
}
