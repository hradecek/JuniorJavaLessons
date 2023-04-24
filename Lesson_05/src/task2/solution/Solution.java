package task2.solution;

import java.util.Scanner;

public class Solution {

    /*
     * Uživatel zadá z klávesnice dvě čísla.
     * Vytiskněte všechna čísla v rozsahu v rozsahu těchto dvou čísel.
     *
     * Enter two numbers: 15 20
     *
     * 15 16 17 18 19 20
     */
    /*
     * Rozšíření: Nezáleží na pořadí zadaných čísel.
     *
     * Enter two numbers: 20 15
     *
     * 15 16 17 18 19 20
     */
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        final var num1 = scanner.nextInt();
        final var num2 = scanner.nextInt();

        for (int numberToPrint = num1; numberToPrint <= num2; ++numberToPrint) {
            System.out.print(numberToPrint);
            if (numberToPrint != num2) {
                System.out.print(" ");
            }
        }
    }
}
