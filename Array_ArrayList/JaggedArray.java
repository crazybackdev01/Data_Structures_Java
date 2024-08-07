package Array_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        // Jagged Array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows: ");
        int R = sc.nextInt();

        int[][] array = new int[R][];

        for (int i = 0; i < R; i++) {
            System.out.println("Enter column in the " + i + "th" + " row: ");
            int columnOfRow = sc.nextInt();
            array[i] = new int[columnOfRow];
            for (int j = 0; j < columnOfRow; j++) {
                System.out.println("Enter element in the " + i + "," + j);
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(array));
        sc.close();
    }
}
