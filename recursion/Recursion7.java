package recursion;

import java.util.Scanner;

public class Recursion7 {
    // Program to check if a string is a palindrome

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
