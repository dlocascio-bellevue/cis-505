/*
    Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/

import java.util.Scanner;

public class TestBowlingShopApp {

    //Display menu options to the user
    public static void displayMenu() {
        System.out.println("\n  MENU OPTIONS");
        System.out.println("    1. <b> Bowling Balls");
        System.out.println("    2. <a> Bowling Bags");
        System.out.println("    3. <s> Bowling Shoes");
        System.out.println("    4. <x> To exit");
        System.out.print("\n  Please choose an option: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n  Welcome to the Bowling Shop");
        String userInput;
        
        //loop until user enters "x" to exit
        do {
            displayMenu();  //Show menu options
            userInput = scanner.nextLine().trim();   //Read and trim user input so there are no unexpected errors.
            GenericQueue<Product> products = ProductDB.getProducts(userInput);  //Retrieve products based on user selection.
            
            //Display each product by dequeuing from the queue.
            while (products.size() > 0) {
                Product item = products.dequeue();
                System.out.println(item.toString());
            }

        } while (!userInput.equalsIgnoreCase("x"));

        System.out.println("\n  End of line...\n");
        scanner.close();
    }
}