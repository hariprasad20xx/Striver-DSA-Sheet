package patterns;

import java.util.Scanner;

public class Pattern14 {
    // Program to print Alpha-Hill Pattern
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            char ch = 65;
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print alphabets in ascending order
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++);
            }

            // print alphabets in descending order
            for (int j = 2; j <= i; j++) {   
                System.out.print((char) (ch - j));
            }

            System.out.println();
        }

        scanner.close();
    }
}
