package Array_ArrayList;

import java.util.Arrays;

public class InsertionSort {
    // static void insertionSortWhile(int[] array) {
    // for (int i = 0; i < array.length - 1; i++) {
    // int j = i + 1;
    // int element = array[i];

    // while (j > 0 && element > array[j]) {
    // swapIntegers(j, element);
    // j--;
    // }

    // }
    // }

    static int[] insertionSortForloop(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swapIntegers(array, j, j - 1);
                } else {
                    break;
                }
            }
        }
        return array;
    }

    // This will call the array values by Value (Call by value) and thus will not
    // actually swap the values by swapping their actual Reference.......
    static void swapIntegers(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    // Below function will call the array values by Reference (Call by reference)
    // and thus will actually swap the values by swapping their actual Reference
    static void swapIntegers(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = { 14, 3, 5, 7, 9 };
        System.out.println(Arrays.toString(insertionSortForloop(array)));
        System.out.println(Arrays.toString(array));
    }
}
