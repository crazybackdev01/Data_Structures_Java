package Array_ArrayList;

import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int pi = partition(array, start, end);
        quickSort(array, start, pi - 1);
        quickSort(array, pi + 1, end);
    }

    static int partition(int[] array, int start, int end) {
        int pivot = array[start];
        // int pivot = array[randomIndex] => To Avoid worst Case
        int eltsLessPivot = 0;
        for (int i = start + 1; i <= end; i++) {
            if (array[i] <= pivot) {
                eltsLessPivot++;
            }
        }
        int pivotIndex = start + eltsLessPivot;
        swapIntegers(array, start, pivotIndex);

        int i = start;
        int j = end;
        while (i < pivotIndex && j > pivotIndex) {
            while (array[i] <= pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i < pivotIndex && j > pivotIndex) {
                swapIntegers(array, i, j);
                i++;
                j--;
            }
        }

        return pivotIndex;
    }

    static void swapIntegers(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = { 4, 8, 10, 3, 7, 18 };
        int n = array.length;
        quickSort(array, 0, n - 1);
        System.out.println(Arrays.toString(array));
    }
}
