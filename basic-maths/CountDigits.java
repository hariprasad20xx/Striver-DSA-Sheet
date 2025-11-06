import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int n = scanner.nextInt();

        int i = n;
        int count = 0;
        while (i != 0) {
            count++;
            i /= 10;
        }

        scanner.close();
    }
}
