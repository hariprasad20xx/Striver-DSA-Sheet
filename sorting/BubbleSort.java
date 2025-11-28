package sorting;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements for the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = n - 1; i > 0; i--) {
            boolean isSorted = true;

            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    isSorted = false;
                }
            }

            if (isSorted) {
                break;
            }
        }

        System.out.print("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        scanner.close();
    }
}
