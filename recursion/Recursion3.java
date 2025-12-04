package recursion;

import java.util.Scanner;

public class Recursion3 {
    // Program to print 1 to N using recursion

    public static void printNumbers(int n) {
        System.out.print(n + " ");

        if (n == 1) return;

        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        printNumbers(n);

        System.out.println();

        scanner.close();
    }
}
