package Hashing;

import java.util.HashSet;

//Given an array of unsorted integers, return the length of the longest consecutive elements sequence in the Number system
public class Q1_Hashset {
    static int longestSequenceLength(int[] arr) {
        int length = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : arr) {
            set.add(num);
        }

        for (int num : set) {
            if (!set.contains(num - 1)) {
                // if num is a starting point
                int currentNumber = num;
                int currentStreak = 1;

                while (set.contains(currentNumber + 1)) {
                    currentStreak++;
                    currentNumber = currentNumber + 1;
                }
                length = Math.max(currentStreak, length);
            }
        }

        return length;
    }

    public static void main(String[] args) {
        int[] arr = { 100, 4, 200, 1, 2, 3 };
        System.out.println(longestSequenceLength(arr));
    }
}
