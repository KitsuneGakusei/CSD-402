import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crystal Long
 * 7/2/2025
 * Module 8 Programming Assignment ArrayListTest
 */
public class CrystalArrayListTest {

    // Method to find the maximum value in an ArrayList
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        Integer maxValue = list.get(0);
        for (Integer num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to finish):");

        int value;
        do {
            System.out.print("Enter a number: ");
            value = input.nextInt();
            numbers.add(value); // Add to list even if value is 0
        } while (value != 0);

        // Send list to max method and get result
        Integer largest = max(numbers);

        // Display result
        System.out.println("The largest value entered is: " + largest);

        input.close();
    }
}
