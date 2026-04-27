/**
 *  Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/

import java.util.List;
import java.util.Scanner;

/**
 * TestComposerApp 
 * 
 * The application provides a menu-driven interface for users to view, find, and add composers using the MemComposerDao implementation of the ComposerDao interface.
 */
public class TestComposerApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            MemComposerDao ComposerDao = new MemComposerDao();  //Instantiate Dao from memory with default composers
            boolean running = true; //variable for controlling while loop
            
            System.out.println("\n  Welcome to the Composer App");
            
            while (running) {
                //Display menu options
                System.out.println("\n  MENU OPTIONS");
                System.out.println("    1. View Composers");
                System.out.println("    2. Find Composer");
                System.out.println("    3. Add Composer");
                System.out.println("    4. Exit");
                System.out.print("\n  Please choose an option: ");
                
                String choice = scanner.nextLine();
                
                //Menu option selections
                switch (choice) {
                    //View Composers
                    case "1" -> {
                        //Display all composers
                        List<Composer> composers = ComposerDao.findAll();
                        System.out.println("\n\n  --DISPLAYING COMPOSERS--");
                        for (Composer composer : composers) {
                            System.out.println(composer);
                        }
                    }
                    //Find Composer
                    case "2" -> {
                        //Find a composer by Id
                        System.out.print("\n  Enter an id: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        Composer findComposer = ComposerDao.findBy(id);
                        //Validation and Error checking for valid id
                        if (findComposer != null) {
                            System.out.println("\n\n  --DISPLAYING COMPOSERS--");
                            System.out.print(findComposer);
                        } else {
                            System.out.println("\n  Invalid id. Please try again.");
                        }
                    }
                    //Add Composer
                    case "3" -> {
                        //Add a new composer
                        System.out.print("\n  Enter an id: ");
                        int newId = Integer.parseInt(scanner.nextLine());
                        System.out.print("  Enter a name: ");
                        String name = scanner.nextLine();
                        System.out.print("  Enter a genre: ");
                        String genre = scanner.nextLine();
                        Composer addComposer = new Composer(newId, name, genre);
                        ComposerDao.insert(addComposer);
                    }
                    //Exit
                    case "4" -> {
                        //Exit the application
                        System.out.println("\n  End of line...");
                        running = false;
                    }
                    
                    default -> //Handle invalid option input
                        System.out.println("\n  Invalid option. Please try again.");
                }
            }
        } 
    }        
}
