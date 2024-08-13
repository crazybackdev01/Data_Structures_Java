package Hashing;

import java.util.HashSet;

public class HashSetBasics {
    public static void main(String[] args) {
        HashSet<String> hashset = new HashSet<>();
        hashset.add("Udit");
        hashset.add("Isha");
        hashset.add("Isha Rathore");
        hashset.add("Udit Nagar");
        hashset.add("Isha");

        System.out.println(hashset);

        // hashset.remove(String.valueOf("Udit"));
        hashset.remove("Udit");
        System.out.println(hashset);

        for (String st : hashset) {
            System.out.print(st + " ");
            // if (st == "Isha") {
            // System.out.println("Founded her");
            // return;
            // }
        }
        System.out.println();
        if (hashset.contains("Isha")) {
            System.out.print("She came from Heaven");
        }
    }
}
