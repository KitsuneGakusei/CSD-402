import java.util.ArrayList;
import java.util.Scanner;
/**
 * Crystal Long
 * 7/3/2025
 * Module 9 Programming Assignment ArrayListException
 * This assignment demonstrates handling exceptions with ArrayLists.
 */


public class CrystalArrayListException {

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();

        // Fill with at least 10 strings
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Date");
        items.add("Elderberry");
        items.add("Fig");
        items.add("Grape");
        items.add("Honeydew");
        items.add("Kiwi");
        items.add("Lemon");

        // Print using for-each loop
        System.out.println("List of items:");
        for (String item : items) {
            System.out.println(item);
        }

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the index (0–9) of the item you want to see again: ");

        try {
            String userInput = input.nextLine(); // user input is string
            int index = Integer.parseInt(userInput); // auto-unboxing (String to int)

            // Try to access item
            System.out.println("You selected: " + items.get(index));

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception Thrown: Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }

        input.close();
    }
}
