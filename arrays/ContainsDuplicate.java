package arrays;

import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {
    // Program to check whether the given array contains duplicate element

    public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();

        for (int num : nums) {
            if (numbers.contains(num)) {
                return true;
            } else {
                numbers.add(num);
            }
        }

        return false;
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

        if (hasDuplicate(arr)) {
            System.out.println("The given array contains duplicates.");
        } else {
            System.out.println("The elements in the given array are unique.");
        }

        scanner.close();
    }
}
