package patterns;

import java.util.Scanner;

public class Pattern15 {
    // Program to print Alpha-Triangle Pattern

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        char ch = (char) (64 + n);
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print((char) (ch + j - i) + " ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
