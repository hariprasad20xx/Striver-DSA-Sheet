package sorting;

import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter n elements for the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int minIndex = i;
            int temp = 0;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;
        }

        System.out.print("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        scanner.close();
    }
}
