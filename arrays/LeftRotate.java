package arrays;

import java.util.Scanner;

public class LeftRotate {

    public static void leftRotateByOne(int[] arr) {
        int temp = arr[0];
        
        // Shift elements to the left
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        // Place the first element at the end
        arr[arr.length - 1] = temp;
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
