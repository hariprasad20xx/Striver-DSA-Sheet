import java.util.ArrayList;
import java.util.Scanner;

public class Divisors {
    // Program to print all the divisors of an integer

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        ArrayList<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);

                if (n / i != i) {
                    divisors.add(n / i);
                }
            }            
        }
        
        System.out.println("Divisors of " + n + ": " + divisors);

        scanner.close();
    }
}
