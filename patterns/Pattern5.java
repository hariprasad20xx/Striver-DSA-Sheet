package patterns;

import java.util.Scanner;

public class Pattern5 {
    // Program to print Inverted Star Pyramid

    public static void printSpaces(int n) {
        for (int i = 1; i <= n; i++) {
                System.out.print(" ");
            }
    }

    public static void printStars(int n) {
        for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        // print inverted star pyramid
        for (int i = n; i >= 1; i--) {

            printSpaces(n - i);
            printStars(2 * i - 1);

            System.out.println();
        }

        scanner.close();
    }
}