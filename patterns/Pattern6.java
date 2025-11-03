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


        scanner.close();
    }
}
