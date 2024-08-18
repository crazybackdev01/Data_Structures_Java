package Backtracking;

public class Fibonacci {
    static int fibonacciTerm(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacciTerm(n - 1) + fibonacciTerm(n - 2);
    }

    static void displayFibonacciSequence(int n) {
        for (int i = 0; i <= n; i++) {
            int ithTerm = fibonacciTerm(i);
            System.out.print(ithTerm + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        displayFibonacciSequence(10);
    }
}
