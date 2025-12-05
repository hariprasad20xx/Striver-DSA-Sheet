package recursion;

import java.util.Scanner;

public class Recursion5 {
    // Program to find Factorial of a given number

    public static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.close();
    }
}
