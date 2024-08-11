package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashmapMethods {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Rakshita", 21);
        map.put("Udit", 21);
        map.put("Isha", 21);

        System.out.println(map.get("Rakshita"));
        System.out.println(map.get("Rishu"));

        map.put("Isha", 20);
        map.put("Isha Rathore", 20);
        System.out.println(map.get("Isha"));
        System.out.println(map.get("Isha Rathore"));
    }
}
