package Strings;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // StringBuilder strBuilder = new StringBuilder(str);

        for (int i = 0; i < str.length(); i++) {
            boolean flag = true; // Let all character in the string be Capital
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;
            int ascii = (int) ch;

            if (ascii >= 97)
                flag = false;

            if (flag) {
                // capital
                ascii += 32;
                char r_ch = (char) ascii;
                str = str.substring(0, i) + r_ch + str.substring(i + 1);
            } else {
                // small
                ascii -= 32;
                char r_ch = (char) ascii;
                str = str.substring(0, i) + r_ch + str.substring(i + 1);
            }
        }

        System.out.println(str);
        sc.close();
    }
}
