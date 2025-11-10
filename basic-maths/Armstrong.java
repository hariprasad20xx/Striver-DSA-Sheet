import java.util.Scanner;

public class Armstrong {
    // Program to check for Armstrong Number
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        int numberOfDigits = Integer.toString(n).length();

        int temp = n;
        int armstrong = 0;

        while (temp != 0) {
            armstrong += Math.pow(temp % 10, numberOfDigits);
            temp /= 10;
        }

        if (armstrong == n) {
            System.out.println(n + " is an armstrong number.");
        } else {
            System.out.println(n + " is not an armstrong number.");
        }

        scanner.close();
    }
}
