package arrays;

import java.util.Scanner;

public class MaximumSumSubarray {

    static int maxSubArray(int[] nums) {
        
        long maxi = Long.MIN_VALUE; 
        
        long sum = 0; 
        
        int start = 0; 
        
        int ansStart = -1, ansEnd = -1; 
        
        for (int i = 0; i < nums.length; i++) {
            
            if (sum == 0) {
                start = i;
            }
            
            sum += nums[i]; 
            
            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }
            
            if (sum < 0) {
                sum = 0;
            }
        }
        
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");

        return (int) maxi;
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

        int maxSum = sol.maxSubArray(arr);

        System.out.println("The maximum subarray sum is: " + maxSum);
        
        scanner.close();
    }
}
