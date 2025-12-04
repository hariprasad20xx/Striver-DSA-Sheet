package recursion;

import java.util.Scanner;

public class Recursion2 {
    // Program to print 1 to N using recursion

    public static void printNumber(int n) {
        if (n > 1) printNumber(n - 1);

        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        printNumber(n);

        System.out.println();

        scanner.close();
    }
}
