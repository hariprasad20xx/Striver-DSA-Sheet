import java.util.Scanner;

public class Palindrome {
    // Program to check if a given integer is Palindrome or not

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        int copyOfN = n;
        int rev = 0;
        while (copyOfN != 0) {
            rev = rev * 10 + (copyOfN % 10);
            copyOfN /= 10;
        } 

        if (rev == n) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }

        scanner.close();
    }
}
