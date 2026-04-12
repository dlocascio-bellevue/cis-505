/*
    Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/

public class Shoe extends Product {
    private double size;  //specifies the shoe size

    public Shoe() {
        super();    //Calls the Product constructor
        this.size = 0;
    }

    //Accessor method to get the shoe size
    public double getSize() {
        return size;
    }

    //Mutator method to set a new shoe size
    public void setSize(double size) {
        this.size = size;
    }

    //Override toString() method to return an append string with the bags type
    @Override
    public String toString() {
        return super.toString() + "\n  Shoe: " + size;
    }
}