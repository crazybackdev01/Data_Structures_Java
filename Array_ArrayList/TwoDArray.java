package Array_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {

    static int getSum(int[] array) {
        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int N = sc.nextInt();
        System.out.println("Enter columns: ");
        int M = sc.nextInt();

        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.println("Enter element " + i + "," + j);
                arr[i][j] = sc.nextInt();
            }
        }

        // System.out.println(Arrays.deepToString(arr));
        Arrays.sort(arr, (int[] o1, int[] o2) -> (getSum(o1) - getSum(o2)));
        System.out.println(Arrays.deepToString(arr));
        sc.close();
    }
}
