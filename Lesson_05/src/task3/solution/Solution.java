package task3.solution;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.print("Enter square size: ");
        final var squareSize = scanner.nextInt();
        final var star = "*";

        for (int row = 0; row < squareSize; ++row) {
            for (int col = 0; col < squareSize; ++col) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
