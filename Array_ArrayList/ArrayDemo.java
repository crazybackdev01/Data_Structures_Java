package Array_ArrayList;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr1 = { 1, 22, 3, 4, 312, 223 };
        int[] arr2 = new int[5];
        Arrays.sort(arr1);
        Arrays.fill(arr2, 12);
        arr2[0] = 4;

        // For loop
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println('\n');
        // For Each Loop
        for (int x : arr1) {
            System.out.print(x + " ");
        }
        System.out.println('\n');
        System.out.println("Array 2: " + Arrays.toString(arr2));

    }
}
