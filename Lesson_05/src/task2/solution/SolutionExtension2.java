package task2.solution;

import java.util.Scanner;

public class SolutionExtension2 {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        var num1 = scanner.nextInt();
        var num2 = scanner.nextInt();

        var min = Math.min(num1, num2);
        var max = Math.max(num1, num2);

        boolean isIncreasing = num1 < num2;
        var start = isIncreasing ? min : max;
        var end = isIncreasing ? max + 1: min - 1;

        for (int numberToPrint = start;
             numberToPrint != end;
             numberToPrint = isIncreasing ? numberToPrint + 1 : numberToPrint - 1) {
            System.out.print(numberToPrint + " ");
        }
    }
}
