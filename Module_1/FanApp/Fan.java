/*
    Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/

public class Fan {
    //Constants representing fan speeds
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    //private data fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    //No-Argument Constructor that creates a default fan.
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    //Argument Constructor that creates a fan using the four fields as arguments.
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    //No-arg method used to get the default speed of a fan.
    public int getSpeed() {
        return speed;
    }

    //No-arg method used to access the default on/off status of a fan.
    public boolean isOn() {
        return on;
    }

    //No-arg method used to get the default radius of a fan.
    public double getRadius() {
        return radius;
    }

    //No-arg method used to get the default color of a fan.
    public String getColor() {
        return color;
    }

    /**
     * Method with one argument, used to customize the speed of a fan.
     * @param speed int
     * @return A new speed of a fan.
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Method with one argument, used to update if the fan is on/off.
     * @param on boolean
     * @return A new boolean value.
     */
    public void setOn(boolean on) {
        this.on = on;
    }

    /**
     * Method with one argument, used to set a new radius value.
     * @param radius double
     * @return A new radius for a fan.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Method with one argument, used to set a new color.
     * @param color String
     * @return A new color for a fan. 
     */
    public void setColor(String color) {
        this.color = color;
    }

    //Override the toString method based on the condition if the fan is ON or OFF.
    @Override
    public String toString() {
        if(on) {
            return "The fan speed is set to " + speed + " with a color of " + color + " and a radius of " + radius;
        } else {
            return "The fan is " + color + " with a radius of " + radius + " and the fan is off";
        }
    }
}