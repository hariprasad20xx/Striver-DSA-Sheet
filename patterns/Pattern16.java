package patterns;

import java.util.Scanner;

public class Pattern16 {
    // Program to print Symmetric-Void Pattern

    public static void printStars(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

    public static void printSpaces(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int stars = 0;
        int spaces = 0;

        for (int i = 1; i <= 2 * n; i++) {
            stars = n - i + 1;
            spaces = 2 * i - 2;

            if (i > n) {
                stars = i - n;
                spaces = (2 * n) - 2 * (i - n);
            }

            printStars(stars);
            printSpaces(spaces);
            printStars(stars);

            System.out.println();
        }
        scanner.close();
    }
}
