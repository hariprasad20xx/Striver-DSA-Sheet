package patterns;

import java.util.Scanner;

public class Pattern11 {
    // Program to print Increasing Letter Triangle Pattern

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            char ch = 65;
            
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }

            System.out.println();
        }
        scanner.close();
    }
}
