package task1.solution;

import java.util.Scanner;

public class SolutionExtensionFunctions {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        int digit1 = getDigitWithPrompt("first", scanner);
        int digit2 = getDigitWithPrompt("second", scanner);
        int digit3 = getDigitWithPrompt("third", scanner);

        System.out.println("\nNumber: " + createNumberFromDigits(digit1, digit2, digit3));
    }

    private static int getDigitWithPrompt(String digitWord, Scanner scanner) {
        System.out.print("Enter " + digitWord + " digit [0-9]: ");
        return getDigit(scanner);
    }

    private static int getDigit(Scanner scanner) {
        hasScannerNumber(scanner);
        int digit = scanner.nextInt();
        isDigit(digit);

        return digit;
    }

    private static void hasScannerNumber(Scanner scanner) {
        if (!scanner.hasNextInt()) {
            System.err.println("Invalid input. Please enter only valid number.");
            System.exit(1);
        }
    }

    private static void isDigit(int numberToCheck) {
        if (numberToCheck < 0 || numberToCheck > 9) {
            System.err.println("Invalid input. Please enter only digits in range 0-9.");
            System.exit(1);
        }
    }

    private static int createNumberFromDigits(int digit1, int digit2, int digit3) {
        return digit1 * 100 + digit2 * 10 + digit3;
    }
}
