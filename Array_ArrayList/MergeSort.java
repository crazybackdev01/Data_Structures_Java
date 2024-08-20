package Array_ArrayList;

import java.util.Arrays;

public class MergeSort {

    static void mergeSort(int[] array, int start, int end) {
        // Base case
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(array, start, mid);
        mergeSort(array, mid + 1, end);
        merge(array, start, end, mid);
    }

    private static void merge(int[] array, int start, int end, int mid) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int i, j, k;

        int[] leftArray = new int[n1];

        int[] rightArray = new int[n2];
        // left array => array[0 -> mid]
        for (i = 0; i < n1; i++) {
            leftArray[i] = array[start + i];
        }
        // right array => array[ mid + 1 -> r]
        for (j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        i = 0;
        j = 0;
        k = start;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            array[k++] = leftArray[i++];
        }
        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }

    public static void main(String[] args) throws Exception {

        int[] array = { 4, 8, 10, 3, 7, 18 };
        int n = array.length;
        mergeSort(array, 0, n - 1);
        System.out.println(Arrays.toString(array));

    }
}
