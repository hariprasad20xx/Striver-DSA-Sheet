import java.util.Scanner;

public class GCD {
    // Program to find GCD (or HCF) of the given two integers 

    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("GCD of the two numbers " + a + " and " + b + " is: " + gcd(a, b));

        scanner.close();
    }
}
