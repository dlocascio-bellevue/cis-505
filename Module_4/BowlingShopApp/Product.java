/*
    Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/

public class Product {
    private String code;   //specifies the product code
    private String description;    //specifies the product description
    private double price;   //specifies product price

    //no-arg default constructor
    public Product() {
        this.code = "";
        this.description = "";
        this.price = 0;
    }

    //Accessor method to get the product code
    public String getCode() {
        return code;
    }

    //Accessor method to get the product description
    public String getDescription() {
        return description;
    }

    //Accessor method to get the product price
    public double getPrice() {
        return price;
    }

    //Mutator method to set a new product code
    public void setCode(String code) {
        this.code = code;
    }

    //Mutator method to set a new product description
    public void setDescription(String description) {
        this.description = description;
    }

    //Mutator method to set a new product price
    public void setPrice(double price) {
        this.price = price;
    }

    //Override toString() method to return all three product characteristics
    @Override
    public String toString() {
        return  "\n  Product code: " + code +
                "\n  Description: " + description + 
                "\n  Price: $" + price;
    }
}