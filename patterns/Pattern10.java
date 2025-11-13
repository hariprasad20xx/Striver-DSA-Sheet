package patterns;

import java.util.Scanner;

public class Pattern10 {
    // Program to print Increasing Number Triangle Pattern

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(++count + " ");
            }

            System.out.println();
        }


        scanner.close();
    }
}
