package arrays;

import java.util.Scanner;

public class ContainsDuplicate {
    // Program to check whether the given array contains duplicate element

    public static boolean hasDuplicate(int[] nums) {
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements for the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();
    }
}
