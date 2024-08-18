package Backtracking;

public class PrintNumbers {
    static void displayNumbers(int n) {
        if (n == 0) {
            return;
        }

        displayNumbers(n - 1);
        System.out.print(n + " ");
    }

    static void displayInReverseNumbers(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        displayInReverseNumbers(n - 1);
    }

    public static void main(String[] args) {
        displayNumbers(10);
        System.out.println();
        displayInReverseNumbers(10);
    }
}
