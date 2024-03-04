
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int digitCount = countDigits(number);

        System.out.println("Number of digits in " + number + " is: " + digitCount);

        scanner.close();
    }

    private static int countDigits(int num) {
        if (num < 0) {
            num = Math.abs(num); // Handle negative numbers by taking their absolute value
        }

        if (num == 0) {
            return 1; // Special case for the number 0
        }

        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }

        return count;
    }
}
