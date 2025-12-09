package recursion;

import java.util.Scanner;

public class Recursion6 {
    // Program to reverse an array

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements for the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        
        scanner.close();
    }
}
