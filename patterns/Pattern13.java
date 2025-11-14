package patterns;

import java.util.Scanner;

public class Pattern13 {
    // Program to print Alpha-Ramp Pattern

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        char ch = 65;
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }

            ch++;
            System.out.println();
        }
        
        scanner.close();
    }
}
