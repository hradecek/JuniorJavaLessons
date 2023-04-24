package task1.solution;

import java.util.Scanner;

public class SolutionExtension {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        // Get first digit
        System.out.print("Enter first digit [0-9]: ");
        // Validates whether user enterred number
        if (!scanner.hasNextInt()) {
            System.err.println("Invalid input. Please enter only valid number.");
            System.exit(1);
        }
        // Validates whether user enterred digit
        int digit1 = scanner.nextInt();
        if (digit1 < 0 || digit1 > 9) {
            System.err.println("Invalid input. Please enter only digits in range 0-9.");
            System.exit(1);
        }

        // Get second digit
        System.out.print("Enter second digit [0-9]: ");
        if (!scanner.hasNextInt()) {
            System.err.println("Invalid input. Please enter only valid number.");
            System.exit(1);
        }
        int digit2 = scanner.nextInt();
        if (digit2 < 0 || digit2 > 9) {
            System.err.println("Invalid input. Please enter only digits in range 0-9.");
            System.exit(1);
        }

        // Get third digit
        System.out.print("Enter third digit [0-9]: ");
        if (!scanner.hasNextInt()) {
            System.err.println("Invalid input. Please enter only valid number.");
            System.exit(1);
        }

        int digit3 = scanner.nextInt();
        if (digit3 < 0 || digit3 > 9) {
            System.err.println("Invalid input. Please enter only digits in range 0-9.");
            System.exit(1);
        }

        // Construct a number
        int number = digit1 * 100 + digit2 * 10 + digit3;
        System.out.println("\nNumber: " + number);
    }
}
