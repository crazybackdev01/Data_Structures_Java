package Strings;

import java.util.Scanner;

public class Palindromic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // StringBuilder sb = new StringBuilder(sc.nextLine());
        String str = sc.nextLine();

        int i = 0;
        int j = str.length() - 1;
        boolean flag = true;

        // Two pointer approach
        // O(n) Time complexity
        // O(1) Space complexity
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
            }
            i++;
            j--;
        }

        if (flag)
            System.out.println("Palindromic");
        else
            System.out.println("Not a Palindromic");
        sc.close();
    }
}
