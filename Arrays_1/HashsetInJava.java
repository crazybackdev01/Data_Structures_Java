package Arrays_1;

import java.util.HashSet;
import java.util.Set;

public class HashsetInJava {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(2);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println(set);
    }
}
