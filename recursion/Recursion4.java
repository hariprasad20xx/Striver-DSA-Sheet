package recursion;

import java.util.Scanner;

public class Recursion4 {
    // Program to calculate the sum of first N natural numbers using recursion

    public static int sumOfNaturalNumbers(int n) {
        return (n == 1) ? 1 : n + sumOfNaturalNumbers(n - 1);
    } 

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        System.out.println("Sum of first " + n + " natural numbers = " + sumOfNaturalNumbers(n));

        scanner.close();
    }
}
