package Strings;

public class PalindromicSubstring {
    public static boolean isPalindromic(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "abcba";
        int count = 0;

        for (int i = 0; i <= str.length() - 1; i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                if (isPalindromic(str.substring(i, j))) {
                    System.out.print(str.substring(i, j) + " ");
                    count++;
                }
            }
        }

        System.out.println("\nPalindromic Substrings: " + count);
    }
}
