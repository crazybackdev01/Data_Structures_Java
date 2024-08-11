package Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyQuestion {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 4, 1, 4, 4, 4, 4, 4 };
        Map<Integer, Integer> map = new HashMap<>();

        for (int val : arr) {
            if (map.containsKey(val)) {
                // increase the value by one
                map.put(val, map.get(val) + 1);
            } else {
                map.put(val, 1);
            }
        }
        // let max frequency be of arr[0]
        int maxFrequency = map.get(arr[0]);
        int element = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (maxFrequency < map.get(arr[i])) {
                maxFrequency = map.get(arr[i]);
                element = arr[i];
            }
        }
        System.out.println("Maximum frequency is " + maxFrequency + " and Element with Most frequency is " + element);
    }
}
