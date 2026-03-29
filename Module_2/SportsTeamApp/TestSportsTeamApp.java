/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by D. Locascio 2026
*/
import java.util.Scanner;

public class TestSportsTeamApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //Create Scanner object to read input from console.
        boolean continueScanner = true;     //boolean instance used to control while loop.

        System.out.println("\nWelcome to the Sports Team App\n");

        while (continueScanner) {   //Loop to continue Scanner and user prompts until user chooses to exit.
            System.out.print("Enter a team name: ");
            String teamName = scanner.nextLine();

            Team team = new Team(teamName);     //Create a new Team object with specified name.

            System.out.print("\nEnter the player names (hint: use commas for multiple players; no spaces): ");
            String playerInput = scanner.nextLine();
            String[] playerNames = playerInput.split(",");  //Split the users input into an array based on the presence of a comma.
            for (String player : playerNames) {     //Loop through each player name to add it to the team
                team.addPlayer(player);
            }

            System.out.println();
            System.out.println("--Team Summary--");
            System.out.println("Number of players on the " + team.getTeamName() + ": " + team.getPlayerCount());
            System.out.print("Players on the team: ");

            for (int i = 0; i < team.getPlayerCount(); i++) {   //Display the players on the team
                System.out.print(team.getPlayers()[i]);
                if (i < team.getPlayerCount() - 1) {    //Add a comma between each name, except for the last.
                    System.out.print(", ");
                }
            }

            System.out.println("\n"); //Double space
            System.out.print("Continue? (y/n): ");
            String continueResponse = scanner.nextLine().toLowerCase(); //Captures user input and converts all characters to lowercase.
            System.out.println();
            continueScanner = continueResponse.equals("y"); //Update loop condition based on user's response.
        }
        
        scanner.close();
        System.out.println("Bye bye...");
    }
}