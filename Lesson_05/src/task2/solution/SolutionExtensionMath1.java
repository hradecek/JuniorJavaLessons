package task2.solution;

import java.util.Scanner;

public class SolutionExtensionMath1 {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        final var num1 = scanner.nextInt();
        final var num2 = scanner.nextInt();

        final var min = Math.min(num1, num2);
        final var max = Math.max(num1, num2);

        for (int numberToPrint = min; numberToPrint <= max; ++numberToPrint) {
            System.out.print(numberToPrint);
            if (numberToPrint != max) {
                System.out.print(" ");
            }
        }
    }
}
