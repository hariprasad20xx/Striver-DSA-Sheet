package patterns;

import java.util.Scanner;

public class Pattern18 {
    // Program to print Hollow Rectangle Pattern

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

        for (int i = 1; i <= n; i++) {

            if (i == 1 || i == n) {
                printStars(n);
            } else {
                printStars(1);
                printSpaces(n - 2);
                printStars(1);
            }

            System.out.println();  
        }

        scanner.close();
    }
}
