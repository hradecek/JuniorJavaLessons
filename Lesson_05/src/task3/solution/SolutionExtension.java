package task3.solution;

import java.util.Scanner;

public class SolutionExtension {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.print("Enter square size: ");
        final var squareSize = scanner.nextInt();

        step1(squareSize);
//        step2(squareSize);
//        step3(squareSize);
//        step4(squareSize);
//        step5(squareSize);
//        step6(squareSize);
    }

    /*
     * Add left spaces.
     *
     * 0 -               *****
     * 1 -          **** ***** ****
     * 2 -      *** **** ***** **** ***
     * 3 -   ** *** **** ***** **** *** **
     * 4 - * ** *** **** ***** **** *** ** *
     *
     * How many spaces? (You can use math!)
     *  - For every preceding column it's number of printed stars + one space
     *
     * Row index -> number of spaces:
     * 0 -> 14 ... (4 + 1) + (3 + 1) + (2 + 1) + (1 + 1) = (5 + 4 + 3 + 2) = 14
     * 1 -> 9  ...           (3 + 1) + (2 + 1) + (1 + 1) =     (4 + 3 + 2) = 9
     * 2 -> 5  ...                     (2 + 1) + (1 + 1) =         (3 + 2) = 5
     * 3 -> 2  ...                               (1 + 1) =              2  = 2
     * 4 -> 0  ...                                    0  =              0  = 0
     */
    private static void step6(int squareSize) {
        for (int row = 0; row < squareSize; ++row) {
            int startingNumber = squareSize - row;
            for (int leftSpaces = squareSize - row; leftSpaces >= 2; --leftSpaces) {
                System.out.print(" ".repeat(leftSpaces));
            }
            for (int leftSquare = startingNumber; leftSquare <= squareSize; ++leftSquare) {
                System.out.print("*".repeat(leftSquare));
                System.out.print(" ");
            }
            for (int rigthSquare = squareSize - 1; rigthSquare >= startingNumber; --rigthSquare) {
                System.out.print("*".repeat(rigthSquare));
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
     * Replace number by '*'.
     *
     * Number represents how many '*' will be printed
     * 0 - *****
     * 1 - **** ***** ****
     * 2 - *** **** ***** **** ***
     * 3 - ** *** **** ***** **** *** **
     * 4 - * ** *** **** ***** **** *** ** *
     */
    private static void step5(int squareSize) {
        for (int row = 0; row < squareSize; ++row) {
            int startingNumber = squareSize - row;
            for (int leftSquare = startingNumber; leftSquare <= squareSize; ++leftSquare) {
                System.out.print("*".repeat(leftSquare));
                System.out.print(" ");
            }
            for (int rigthSquare = squareSize - 1; rigthSquare >= startingNumber; --rigthSquare) {
                System.out.print("*".repeat(rigthSquare));
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
     * All rows with correct starting number.
     *
     * Print number instead of consequent '*'.
     * Number will represent how many stars will be printed.
     * 0 - 5
     * 1 - 4 5 4
     * 2 - 3 4 5 4 3
     * 3 - 2 3 4 5 4 3 2
     * 4 - 1 2 3 4 5 4 3 2 1
     *
     * Row index -> starting number
     * 0 -> 5
     * 1 -> 4
     * 2 -> 3
     * 3 -> 2
     * 4 -> 1
     */
    private static void step4(int squareSize) {
        for (int row = 0; row < squareSize; ++row) {
            int startingNumber = squareSize - row;
            for (int leftSquare = startingNumber; leftSquare <= squareSize; ++leftSquare) {
                System.out.print(leftSquare);
                System.out.print(" ");
            }
            for (int rigthSquare = squareSize - 1; rigthSquare >= startingNumber; --rigthSquare) {
                System.out.print(rigthSquare);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
     * All rows (adds the second dimension - 2D).
     *
     * 0 - 1 2 3 4 5 4 3 2 1
     * 1 - 1 2 3 4 5 4 3 2 1
     * 2 - 1 2 3 4 5 4 3 2 1
     * 3 - 1 2 3 4 5 4 3 2 1
     * 4 - 1 2 3 4 5 4 3 2 1
     */
    private static void step3(int squareSize) {
        for (int row = 0; row < squareSize; ++row) {
            for (int leftSquare = 1; leftSquare <= squareSize; ++leftSquare) {
                System.out.print(leftSquare);
                System.out.print(" ");
            }
            for (int rigthSquare = squareSize - 1; rigthSquare >= 1; --rigthSquare) {
                System.out.print(rigthSquare);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
     * Complete last row (adds right side - 4 3 2 1):
     * 1 2   3    4    5     4   3  2  1
     * * ** *** **** ***** **** *** ** *
     *
     * Print number instead of consequent '*'.
     * Number will represent how many stars will be printed.
     * 1 2 3 4 5 4 3 2 1
     */
    private static void step2(int squareSize) {
        for (int leftSquare = 1; leftSquare <= squareSize; ++leftSquare) {
            System.out.print(leftSquare);
            System.out.print(" ");
        }
        for (int rigthSquare = squareSize - 1; rigthSquare >= 1; --rigthSquare) {
            System.out.print(rigthSquare);
            System.out.print(" ");
        }
        System.out.println();
    }

    /*
     * Last row (left size and center square):
     * 1 2  3   4    5
     * * ** *** **** *****
     *
     * Print number instead of consequent '*'.
     * Number will represent how many stars will be printed.
     * 1 2 3 4 5
     */
    private static void step1(int squareSize) {
        for (int leftSquareSize = 1; leftSquareSize <= squareSize; ++leftSquareSize) {
            System.out.print(leftSquareSize);
            System.out.print(" ");
        }
        System.out.println();
    }
}
