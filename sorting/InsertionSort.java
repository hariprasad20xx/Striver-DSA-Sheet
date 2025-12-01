package sorting;

import java.util.Scanner;

public class InsertionSort {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements for the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int current = i;

            for (int j =  i - 1; j >= 0; j--) {
                
                if (arr[j] > arr[current]) {

                    int temp = arr[j];
                    arr[j] = arr[current];
                    arr[current] = temp;

                    current = j;  
                } else {
                    break;
                }
                
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
