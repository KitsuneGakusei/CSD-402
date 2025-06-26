// Crystal Long
// 6/26/2025
// Mod 7 - UseFans Class Assignment

import java.util.ArrayList;

public class UseFans {

    // Method to display all Fan instances from a collection
    public static void displayFans(ArrayList<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);
            System.out.println(); // Add spacing between fans
        }
    }

    // Method to display a single Fan instance without using toString()
    public static void displayFan(Fan fan) {
        System.out.println("Fan Speed: " + fan.getSpeed());
        System.out.println("Fan On: " + fan.isOn());
        System.out.println("Fan Radius: " + fan.getRadius());
        System.out.println("Fan Color: " + fan.getColor());
    }

    public static void main(String[] args) {
        ArrayList<Fan> fanCollection = new ArrayList<>();

        // Create Fan instances
        Fan defaultFan = new Fan(); // Uses no-argument constructor
        Fan customFan = new Fan(Fan.FAST, true, 10.0, "blue");
        Fan anotherFan = new Fan(Fan.SLOW, false, 8.0, "black");

        // Add fans to the collection
        fanCollection.add(defaultFan);
        fanCollection.add(customFan);
        fanCollection.add(anotherFan);

        // Display all fan instances
        System.out.println("Displaying Fan Collection:");
        displayFans(fanCollection);
    }
}