package arrays;

import java.util.Scanner;

public class RemoveDuplicates {
    // Program to remove duplicates in a sorted array (in-place)

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
               
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter sorted array of size" + n + " with duplicates: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();
    }
}
