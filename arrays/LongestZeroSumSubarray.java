package arrays;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class LongestZeroSumSubarray {

    static int maxLen(int[] arr, int n) {

        Map<Integer, Integer> mpp = new HashMap<>();

        int maxi = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += A[i];

            if (sum == 0) {
                maxi = i + 1;
            } else {
            
                if (mpp.containsKey(sum)) {   
                    maxi = Math.max(maxi, i - mpp.get(sum));
                } else {
                    mpp.put(sum, i);
                }
            }
        }

        return maxi;
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
