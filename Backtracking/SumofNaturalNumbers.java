package Backtracking;

public class SumofNaturalNumbers {

    static int sumOfNaturalNumbers(int n) {
        // Base Case
        if (n == 1) {
            return 1;
        }
        // Recursive Case
        return n + sumOfNaturalNumbers(n - 1);
    }

    public static void main(String[] args) {
        int sum = sumOfNaturalNumbers(5);
        System.out.println(sum);
    }
}
