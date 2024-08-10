package Strings;

import java.util.Scanner;

public class ToggleBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());

        for (int i = 0; i < str.length(); i++) {
            boolean flag = true; // Let all character in the string be Capital
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;
            int ascii = (int) ch;

            if (ascii >= 97)
                flag = false;

            if (flag) {
                ascii += 32;
                char r_ch = (char) ascii;
                str.setCharAt(i, r_ch);
            } else {
                ascii -= 32;
                char r_ch = (char) ascii;
                str.setCharAt(i, r_ch);
            }
        }

        System.out.println(str);
        sc.close();
    }
}
