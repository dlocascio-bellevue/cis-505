/*
    Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/

public class TestFanApp {
    //Main method to test the Fan class
    public static void main(String[] args) {
        //Two instances of Fan classes created by using default and custom argument constructors. 
        Fan defaultFan = new Fan();
        Fan customFan = new Fan(Fan.MEDIUM, true, 8.0, "Blue");

        //Display both Fan objects by invoking the classes toString() method.
        System.out.println("Default Fan: " + defaultFan.toString());
        System.out.println("Custom Fan: " + customFan.toString());
    }
}