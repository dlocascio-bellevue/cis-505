/*
    Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/

public class Team {
    //Private instances representing team characteristics
    private String teamName = "";
    private String[] players = new String[20];
    private int playerCount = 0;

    //Constructor that creates a team using teamName as an argument
    public Team(String teamName) {
        this.teamName = teamName;
    }

    //Method that adds a player to the players data field
    public void addPlayer(String player) {
        players[playerCount] = player;
        playerCount++;
    }

    //Getter method to return an array of players
    public String[] getPlayers() {
        return players;
    }

    //Getter method to return the number of players
    public int getPlayerCount() {
        return playerCount;
    }

    //Getter method to return the team name
    public String getTeamName() {
        return teamName;
    }
}