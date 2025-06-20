// Crystal Long
// 6/20/2025
// Mod 6-Fan Class Assignment

public class Fan {
    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fields
    private int speed = STOPPED;
    private boolean on = false;
    private double radius = 6;
    private String color = "white";

    // No-argument constructor
    public Fan() {
        // Default values already set above
    }

    // Parameterized constructor
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Setters
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    public String toString() {
        if (on) {
            return "Fan is ON: Speed = " + speed + ", Radius = " + radius + ", Color = " + color;
        } else {
            return "Fan is OFF: Radius = " + radius + ", Color = " + color;
        }
    }

    // Test program
    public static void main(String[] args) {
        // Default constructor
        Fan fan1 = new Fan();

        // Parameterized constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10.5, "black");

        // Display both fans
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());

        // Change values in fan1
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8);
        fan1.setColor("orange");

        System.out.println("Fan 1 (updated): " + fan1.toString());
    }
}
