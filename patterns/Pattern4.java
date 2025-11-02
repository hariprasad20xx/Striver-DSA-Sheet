package patterns;

import java.util.Scanner;

public class Pattern4 {
    // Program to print Star Pyramid pattern
    
    public static void printSpaces(int n) {
        for (int i = 1; i <= n; i++) {
                System.out.print(" ");
            }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        // print star pyramid
        for (int i = 1; i <= n; i++) {
            
            printSpaces(n - i);
            

            // print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        scanner.close();
    }
}
