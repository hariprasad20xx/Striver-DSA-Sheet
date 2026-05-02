package arrays;

import java.util.Scanner;

public class ConsecutiveOnes {

    static int findMaxConsecutiveOnes(int[] nums) {
        
        int cnt = 0;
        int maxi = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }

            maxi = Math.max(maxi, cnt);
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

        int ans = obj.findMaxConsecutiveOnes(nums);

        System.out.println("The maximum consecutive 1's are " + ans);

        scanner.close();
    }
}
