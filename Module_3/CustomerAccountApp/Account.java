/*
    Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/
import java.text.SimpleDateFormat;
import java.util.Date;


//Class to represent a bank account.
public class Account {
    //private data field
    private double balance = 200.00;

    //Accessor method used to get the balance.
    public double getBalance() {
        return balance;
    }

    //Deposit method to add funds to the account. 
    public void deposit(double amt) {
        balance += amt; //Add deposit amount to the balance amount
    }

    //Withdraw method to remove funds from the account.
    public void withdraw(double amt) {
        if (balance >= amt) {   //The withdraw amount can't be more than the balance amount.
            balance -= amt;     //Deduct withdraw amount from the balance.
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    //Method to display a account menu.
    public void displayMenu() {
        System.out.println(" Account Menu");
        System.out.println(" Enter <D/d> for deposit");    
        System.out.println(" Enter <W/w> for withdraw");
        System.out.println(" Enter <B/b> for balance");
        System.out.print("   Enter option>: ");
    }

    //Method to get a transaction date.
    public String getTransactionDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy"); //Create desired data format.
        Date date = new Date(); //Get the current date.
        return formatter.format(date);  //Format and return the date.
    }
}