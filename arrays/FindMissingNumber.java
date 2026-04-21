package arrays;

import java.util.Scanner;

public class FindMissingNumber {

    public static int missingNumber(int[] arr) {
        long n = arr.length + 1;

        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        long expSum = n * (n + 1) / 2;
        
        return (int) (expSum - sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter sorted array of size " + n + " with duplicates: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();
    }
}
