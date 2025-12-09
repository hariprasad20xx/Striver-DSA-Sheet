package recursion;

import java.util.Scanner;

public class Recursion7 {
    // Program to check if a string is a palindrome

    public static boolean checkPalindrome(String s, int p1, int p2) {

        if (s.charAt(p1) != s.charAt(p2)) return false;
        
        return (p1 >= p2) ? true : checkPalindrome(s, p1 + 1, p2 - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        boolean isPalindrome = checkPalindrome(inputString, 0, inputString.length() - 1);

        if (isPalindrome) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome");
        }

        scanner.close();
    }
}
