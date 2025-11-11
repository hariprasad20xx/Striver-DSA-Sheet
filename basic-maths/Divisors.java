import java.util.ArrayList;
import java.util.Scanner;

public class Divisors {
    // Program to print all the divisors of an integer

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int n = scanner.nextInt();

        ArrayList<Integer> divisors = new ArrayList<>();
        divisors.add(1);

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        divisors.add(n);
        

        scanner.close();
    }
}
