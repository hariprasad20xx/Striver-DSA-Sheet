package patterns;

import java.util.Scanner;

public class Pattern7 {
    // Program to print Half Diamond Star Pattern

    public static void printStars(int n) {
        for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
    }
    
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value on N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {
            
            int numberOfStars = i;

            if (i > n) numberOfStars = 2 * n - i;

            printStars(numberOfStars);

            System.out.println();
        }

        scanner.close();
    }
}
