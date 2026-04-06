/*
    Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/

//Class to represent a customer.
public class Customer {
    //private data fields
    private String name;
    private String address;
    private String city;
    private String zip;

    //No-arg constructor that creates a default Customer.
    public Customer() {
        this.name = "";
        this.address = "";
        this.city = "";
        this.zip = "";
    }

    //Argument Constructor that creates a Customer using the four fields as arguments.
    public Customer(String name, String address, String city, String zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }

    //Accessor method used to get the name.
    public String getName() {
        return name;
    }

    //Accessor method used to get the address.
    public String getAddress() {
        return address;
    }

    //Accessor method used to get the city.
    public String getCity() {
        return city;
    }

    //Accessory method used to get the zip.
    public String getZip() {
        return zip;
    }

    //Override toString() to return a string description for a customer with all four fields.
    @Override
    public String toString() {
        return " Name: " + name + "\n" +
               " Address: " + address + "\n" +
               " City: " + city + "\n" +
               " Zip: " + zip;
    }
}