package patterns;

import java.util.Scanner;

public class Pattern19 {
    // Program to print Number Pattern
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        for (int i = 0; i < 2 * n - 1; i++) {

            for (int j = 0; j < 2 * n - 1; j++) {
                
                int top = i;
                int left = 2 * n - 2 - i;
                int bottom = j;
                int right = 2 * n - 2 - j;

                int minDistance = Math.min(Math.min(top, left), Math.min(bottom, right));

                System.out.print(n - minDistance + " ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
