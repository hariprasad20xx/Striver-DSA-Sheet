package recursion;

import java.util.Scanner;

public class Recursion1 {
    // Program to print my name N times

    public static void printName(String name, int n) {
        if (n > 1) printName(name, n - 1);

        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        printName("Hariprasad", n);

        scanner.close();
    }
}
