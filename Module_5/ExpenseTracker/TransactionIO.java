/*
    Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TransactionIO {
    private static final String FILE_NAME = "expenses.txt"; //Name of file where transactions are stored
    private static File file = new File(FILE_NAME);         //File object   

    /**
     * Adds transaction data to the expenses file
     * 
     * @param transactions List of Transaction object to be saved
     * @throws IOException if file operations fails
     */
    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
        PrintWriter output = null;

        if (file.exists()) {
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
        } else {
            output = new PrintWriter(FILE_NAME);
        }
        
        //Write each transaction to the file
        for (Transaction tran : transactions) {
            output.print(tran.getDate() + " ");
            output.print(tran.getDescription() + " ");
            output.println(tran.getAmount());
        }
        output.close();
    }

    /**
     * Reads transactions from expenses.txt file and returns them as a list
     * 
     * @return List of Transaction objects read from file
     * @throws IOException if file operation fails
     */
    public static ArrayList<Transaction> findAll() throws IOException {
        ArrayList<Transaction> transactions = new ArrayList<>();

        Scanner input = new Scanner(file);

        while(input.hasNext()) {
            String date = input.next();
            String description = input.next();
            double amount = input.nextDouble();

            Transaction transaction = new Transaction(date, description, amount);
            transactions.add(transaction);
        }
        input.close();
        return transactions;
    }
}