package task1.solution;

import java.util.Scanner;

public class Solution {

    // 3 * 100 + 2 * 10 + 2 * 1
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        // Get first digit
        System.out.print("Enter first digit [0-9]: ");
        int digit1 = scanner.nextInt();

        // Get second digit
        System.out.print("Enter second digit [0-9]: ");
        int digit2 = scanner.nextInt();

        // Get third digit
        System.out.print("Enter third digit [0-9]: ");
        int digit3 = scanner.nextInt();

        // Construct a number
        int number = digit1 * 100 + digit2 * 10 + digit3;
        System.out.println("\nNumber: " + number);
    }
}
