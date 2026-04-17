/*
    Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
    private String date;        //specifies the date of transaction.
    private String description; //specifies the description of a transaction.
    private double amount;      //specifies the amount of a transaction;

    //no-arg default constructor
    public Transaction() {
        this.date = new SimpleDateFormat("MM-dd-yyyy").format(new Date());  //Create and format date
        this.description = "";
        this.amount = 0;
    }

    //Argument constructor to create a transaction with current date, description, and amount.
    public Transaction(String description, double amount) {
        this.date = new SimpleDateFormat("MM-dd-yyyy").format(new Date());  //Create and format date
        this.description = description;
        this.amount = amount;
    }

    //Argument constructor to create a transaction with provided date, description, and amount.
    public Transaction(String date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    //Accessor method to get the date.
    public String getDate() {
        return date;
    }

    //Accessor method to get the description.
    public String getDescription() {
        return description;
    }

    //Accessor method to get the amount.
    public double getAmount() {
        return amount;
    }

    //Mutator method to set the date.
    public void setDate(String date) {
        this.date = date;
    }

    //Mutator method to set the description.
    public void setDescription(String description) {
        this.description = description;
    }

    //Mutator method to set the amount.
    public void setAmount(double amount) {
        this.amount = amount;
    }

    //Override toString() to return a string description of a transaction with all three data fields.
    @Override
    public String toString() {
        return  "\n  Date: " + date + 
                "\n  Description: " + description + 
                "\n  Amount: $" + amount;
    }
}