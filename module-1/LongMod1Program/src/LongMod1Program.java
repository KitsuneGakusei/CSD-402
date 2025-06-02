/*
 * Name: Crystal Long
 * Date: June 2, 2025
 * Assignment: Module 1.1 – Basic Java Program
 */
// Description: This program calculates the energy required to heat a given mass of water
// from an initial temperature to a final temperature using the formula:
 // Energy (Joules) = mass (kg) * specific heat capacity of water (4184 J/kg°C) * change in temperature (°C)
import java.util.Scanner;

public class LongMod1Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for water mass
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        // Prompt for initial temperature
        System.out.print("Enter the initial temperature (Celsius): ");
        double initialTemp = input.nextDouble();

        // Prompt for final temperature
        System.out.print("Enter the final temperature (Celsius): ");
        double finalTemp = input.nextDouble();

        // Calculate energy in Joules
        double energy = waterMass * (finalTemp - initialTemp) * 4184;

        // Display the result
        System.out.println("The energy needed to heat the water is " + energy + " Joules.");
    }
}
