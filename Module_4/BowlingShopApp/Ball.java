/*
    Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/

public class Ball extends Product {
    private String color;  //specifies color of bowling ball

    //no-arg constructor method to create a default ball object
    public Ball() {
        super();    //Calls the Product constructor
        this.color = "";
    }

    //Accessor method to get the color
    public String getColor() {
        return color;
    }

    //Mutator method to set the color
    public void setColor(String color) {
        this.color = color;
    }

    //Override toString() method to return an appended superclass with an additional ball color field
    @Override
    public String toString() {
        return super.toString() + "\n  Color: " + color;
    }
}