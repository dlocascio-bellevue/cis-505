/*
    Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/

import java.util.Scanner;

public class ValidatorIO {
    /**
     * Prompts the user to enter a integer and validates the input.
     * Loops until a valid integer is entered.
     * 
     * @param sc Scanner object for reading user input
     * @param prompt Message displayed to the user
     * @return User's valid integer input
     */
    public static int getInt(Scanner sc, String prompt) {
        int input = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);

            if (sc.hasNextInt()) {
                input = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("\n  Error! Invalid integer value.\n");
            }
            sc.nextLine();
        }
        return input;
    }

    /**
     * Prompts the user to enter a double and validates the input.
     * Loops until a valid double is entered.
     * 
     * @param sc Scanner object for reading user input
     * @param prompt Message displayed to the user
     * @return User's valid double input
     */
    public static double getDouble(Scanner sc, String prompt) {
        double input = 0.0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);

            if (sc.hasNextDouble()) {
                input = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("\n  Error! Invalid double value.\n");
            }
            sc.nextLine();
        }
        return input;
    }

    /**
     * Prompts the user to enter a String and returns it.
     * 
     * @param sc Scanner object for reading user input
     * @param prompt Message displayed to the user
     * @return User's String input 
     */
    public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }
}