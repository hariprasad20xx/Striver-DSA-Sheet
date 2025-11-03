package patterns;

import java.util.Scanner;

public class Pattern6 {
    // Program to print Diamond Star Pattern

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

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        // print diamond star pattern
        for (int i = 1; i <= n; i++) {
            
            printSpaces(n - i);
            printStars(2 * i - 1);
            
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {

            printSpaces(n - i);
            printStars(2 * i - 1);

            System.out.println();
        }

        scanner.close();
    }
}
