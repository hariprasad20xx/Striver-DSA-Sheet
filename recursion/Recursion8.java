package recursion;

import java.util.Scanner;

public class Recursion8 {
    // Program to print Nth Fibonacci number using Recursion

    public static int fibonacci(int n) {
        return (n <= 1) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N to get the Nth fibonacci number: ");
        int n = scanner.nextInt();

        System.out.println(fibonacci(n));

        scanner.close();
    }
}
