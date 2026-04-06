/*
    Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/

public class CustomerDB {
    //Static method to return a Customer object based on the customer's id.
    public static Customer getCustomer(Integer id) {
        if (id == 1007) {
            return new Customer("Jonathan Toews", "19 Acorn Street", "Whitewater", "53190");
        } else if (id == 1008) {
            return new Customer("Patrick Kane", "88 Goose Ln", "Barrington", "60010");
        } else if (id == 1009) {
            return new Customer("Patrick Shaw", "65 Goon Dr", "Plant City", "33565");
        } else {
            return new Customer();  //If there are no id matches, return a default Customer object.
        }
    }
}