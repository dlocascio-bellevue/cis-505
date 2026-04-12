/*
    Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/

public class Bag extends Product {
    private String type;   //specifies the number of bowling balls the bag can hold

    //no-arg constructor to create a default bag
    public Bag() {
        super();    //Calls the Product constructor
        this.type = "";
    }

    //Accessor method to get type
    public String getType() {
        return type;
    }

    //Mutator method to set a new type
    public void setType(String type) {
        this.type = type;
    }

    //Override toString() method to return an append string of superclass with bag type
    @Override
    public String toString() {
        return super.toString() + "\n  Type: " + type;
    }
}