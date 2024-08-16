package Strings;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        String st2 = sc.next();
        // System.out.println("Next Line: " + st1);
        // System.out.println("Next() : " + st2);

        // System.out.println(st1.charAt(0));
        // System.out.println(st2.length());

        // char ch = st1.charAt(0);
        // int n = st2.length();

        /*
         * 
         * st1.concat(st2); This will not modify the String st1 because Strings are
         * immutable in Java
         */
        st1 = st1.concat(st2); // This will modify the String st1 because in this we are referencing the st1 to
                               // some other String object in the String pool of the Heap memory which is made
                               // by concating the st1 and st2 together.

        // System.out.println(ch + " " + n);
        System.out.println(st1 + st2);
        System.out.println(st1);
        String s1 = st1.substring(0, 5);
        char ch2 = st1.charAt(5);
        System.out.println("substring: " + s1);
        System.out.println(ch2);
        sc.close();
    }
}
