package task2.solution;

import java.util.Scanner;

public class SolutionExtension1 {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        var num1 = scanner.nextInt();
        var num2 = scanner.nextInt();

        // Swap the variables
        if (num1 > num2) {
            int temp = num2;
            num2 = num1;
            num1 = temp;
        }
        // Another way how to swap the variables (without need of extra variable)
        // ... using XOR hack
        if (num1 > num2) {
            num2 ^= num1;
            num1 = num2 ^ num1;
            num2 ^= num1;
        }

        for (int numberToPrint = num1; numberToPrint <= num2; ++numberToPrint) {
            System.out.print(numberToPrint);
            if (numberToPrint != num2) {
                System.out.print(" ");
            }
        }
    }
}
