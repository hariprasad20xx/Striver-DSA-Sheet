package hashing;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    // Program to count frequency of each element in the given array
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.print("Enter " + n + " elements for the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        scanner.close();
    }
}
