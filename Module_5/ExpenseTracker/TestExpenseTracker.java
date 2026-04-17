/*
    Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestExpenseTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continueLoop = "y";  //Controls menu loop

        System.out.println("\n  Welcome to the Expense Tracker");

        //Main loop to keep user in the menu
        while (continueLoop.equalsIgnoreCase("y")) {
            int input = ValidatorIO.getInt(sc, menu());
            //Menu selection to View Transactions
            if (input == 1) {   
                try {
                    ArrayList<Transaction> transactions = TransactionIO.findAll();
                    System.out.println("\n  MONTHLY EXPENSES\n");
                    for (Transaction transaction : transactions) {
                        System.out.printf("  Date: %s\n  Description: %s\n  Amount: $%,6.2f\n", transaction.getDate(), transaction.getDescription(), transaction.getAmount());
                        System.out.println();
                    }
                } 
                catch (IOException e) {
                    System.out.println("\n  Error reading transactions: " + e.getMessage());
                }
            //Menu selection to Add Transactions
            } else if (input == 2) {    
                String c = "y";
                ArrayList<Transaction> transactions = new ArrayList<>();
                //Loop to control multiple transactions from the user
                while (c.equalsIgnoreCase("y")) {
                    String description = ValidatorIO.getString(sc, "\n  Enter the description: ");
                    double amount = ValidatorIO.getDouble(sc, "  Enter the amount: ");

                    Transaction transaction = new Transaction(description, amount);
                    transactions.add(transaction);

                    c = ValidatorIO.getString(sc, "\n  Add another transaction? (y/n): ");
                }

                try {
                    TransactionIO.bulkInsert(transactions);
                } 
                catch (IOException e) {
                    System.out.println("\n  Exception: " + e.getMessage());
                }
            //Menu selection to View Expense
            } else if (input == 3) {    
                try {
                    ArrayList<Transaction> transactions = TransactionIO.findAll();
                    double monthlyExpense = 0.0;

                    for (Transaction transaction : transactions) {
                        monthlyExpense += transaction.getAmount();
                    }
                    System.out.printf("\n  Total Monthly Expense: $%,6.2f\n", monthlyExpense);
                    System.out.println();
                } catch (IOException e) {
                    System.out.println("\n  Error calculating expense: " + e.getMessage());
                }
            } else {
                System.out.println("\n  Invalid option. Please choose 1, 2, or 3.");
            }
            continueLoop = ValidatorIO.getString(sc, "  Continue? (y/n): ");    //Prompt to continue
        }
        System.out.println("\n  Program terminated by the user...\n");
        sc.close();
    }
    //Menu display method
    public static String menu() {
        return "\n  MENU OPTIONS\n" +
               "    1. View Transactions\n" +
               "    2. Add Transactions\n" +
               "    3. View Expense\n\n" +
               "  Please choose an option: ";
    }
}