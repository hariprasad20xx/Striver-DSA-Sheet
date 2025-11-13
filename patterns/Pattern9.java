package patterns;

import java.util.Scanner;

public class Pattern9 {
    // Program to print Number Crown Pattern

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            // print numbers in ascending order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // print spaces
            for (int j = 1; j <= 2 * n - 2 * i; j++) {
                System.out.print(" ");
            }

            // print numbers in descending order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            
            System.out.println();
        }

        scanner.close();
    }
}
