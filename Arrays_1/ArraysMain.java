package Arrays_1;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class ArraysMain {
    public static void f2() {
        String[] fruits = { "apple", "orange", "green", "mango" };
        Arrays.sort(fruits, Collections.reverseOrder());
        System.out.println(Arrays.toString(fruits));
    }

    public static void f1() {
        int[] numbers = { 10, 2, 220, 292, 832, 1024 };
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        f1();
        f2();

        String s1 = "abc";
        String s2 = "abe";

        List<Integer> a = new ArrayList<Integer>(40);
        List<Integer> b = new ArrayList<Integer>(50);
        a.add(1);
        a.get(0);
        a.add(2);
        a.add(3);
        b.add(3000);
        b.add(30);
        a.add(34);
        a.add(14);
        a.add(3, 10);
        a.remove(0);
        a.remove(Integer.valueOf(1));
        b.addAll(a);

        if (a.contains(10)) {
            System.out.println("A contains 10");
        }

        a.set(2, 19);

        System.out.println("First List: " + a);
        System.out.println("Second List: " + b);

        System.out.println(s1.compareTo(s2));

        // For loop
        for (int i = 0; i < a.size(); i++) {
            System.out.print("A list: " + a.get(i) + " ");
        }
        System.out.print('\n');
        // For each loop
        for (Integer i : a) {
            System.out.print("A list for each loop" + " " + i);
        }
        System.out.print('\n');
        // Iterator
        Iterator<Integer> it = a.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
    }
}
