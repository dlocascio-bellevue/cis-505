/**
 *  Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/

/// The Composer class represents a composer with an id, name, and genre. 
public class Composer {
    private int id;         //specifies composer id
    private String name;    //specifies composer name
    private String genre;   //specifies composer genre

    //no-arg default constructor
    public Composer() {
        this.id = 0;
        this.name = "";
        this.genre = "";
    } 

    //argument constructor to create composer object with all three data fields
    public Composer(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre; 
    }

    //Accessor method to get id
    public int getId() {
        return id;
    }

    //Accessor method to get name
    public String getName() {
        return name;
    }

    //Accessor method to get genre
    public String getGenre() {
        return genre;
    }

    //Mutator method to set data
    public void setId(int id) {
        this.id = id;
    }

    //Mutator method to set name
    public void setName(String name) {
        this.name = name;
    }

    //Mutator method to set genre
    public void setGenre(String genre) {
        this.genre = genre;
    }

    //Override toString to return a string description of a composer with all three data fields
    @Override
    public String toString() {
        return  "  Id: " + id +
                "\n  Name: " + name +
                "\n  Genre: " + genre + "\n";
    }
}