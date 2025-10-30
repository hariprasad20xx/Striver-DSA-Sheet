package patterns;

import java.util.Scanner;

public class Pattern2 {
    // Program to print Right-Angled Triangle Pattern
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
