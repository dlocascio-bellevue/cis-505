/*
    Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/
import java.util.Scanner;

public class TestCustomerAccountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //Create new scanner object.

        System.out.println("\n Welcome to the Customer Account App");
        System.out.print("\n Enter a customer ID: \n  ex: 1007, 1008, 1009>: ");
        int customerId = scanner.nextInt();

        System.out.println();

        Customer customer = CustomerDB.getCustomer(customerId); //Create new customer according to customer ID 
        Account account = new Account();    //Create new account object.

        String choice;  //Variable to control loop continuation.
        //do...while loop for user start menu
        do {
            account.displayMenu(); //Display account menu options

            String option = scanner.next().toUpperCase();

            //switch handler for user's menu selection.
            switch (option) {
                case "D":   //Deposit option
                    System.out.print("\n Enter deposit amount: ");
                    double depositAmt = scanner.nextDouble();
                    account.deposit(depositAmt);
                    break;
                case "W":   //Withdraw option
                    System.out.print("\n Enter withdraw amount: ");
                    double withdrawAmt = scanner.nextDouble();
                    account.withdraw(withdrawAmt);
                    break;
                case "B":   //Balance amount option
                    System.out.printf("\n Account balance: $%,6.2f", account.getBalance());
                    break;
                default:    //Invalid menu selection
                    System.out.println("\n Error: Invalid Option.");
            }

            System.out.print("\n Continue? (y/n): ");
            choice = scanner.next().toLowerCase(); 
            System.out.println();
        }                
        while (!choice.equals("n"));    //Continue loop until user inputs "n".

        System.out.println(" --Customer Details--");
        System.out.println(customer.toString());
        System.out.printf("\n Balance as of " + account.getTransactionDate() + " is $%,6.2f\n", account.getBalance());

        System.out.print("\n End of Line...");
        scanner.close();
    }

}