import java.util.Scanner;

public class ReverseNumber {
    // Program to reverse a number    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }

        System.out.println("Reverse: " + rev);
        
        scanner.close();
    }
}
