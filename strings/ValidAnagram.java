package strings;

import java.util.Scanner;

public class ValidAnagram {
    // Program to check whether given two strings are anagrams of each other

    public static boolean isAnagram(String s, String t) {

        // if lengths are different, return false
        if (s.length() != t.length()) return false;

        // create array to store frequency of each lowercase letter
        int[] count = new int[26];

        // store the frequency of letters in s in the array
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            // if there is difference in the frequency, return false
            if (count[c - 'a']-- == 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user input
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // method call
        boolean result = isAnagram(str1, str2);
        // output result

        scanner.close();
    }
}
