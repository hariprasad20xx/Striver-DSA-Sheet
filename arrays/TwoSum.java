package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    // Program to find the indices of elements resulting in the target sum

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> visitedMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (visitedMap.containsKey(diff)) {
                return new int[]{visitedMap.get(diff), i};
            }

            visitedMap.put(nums[i], i);
        }
        
        return new int[]{};
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

        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        int[] indices = twoSum(arr, target);

        scanner.close();
    }
}
