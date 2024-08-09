package Strings;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        String st2 = sc.next();
        System.out.println("Next Line: " + st1);
        System.out.println("Next() : " + st2);

        sc.close();
    }
}
