/*
 * Crystal Long
 * July 22, 2025
 * CSD-402
 * Module 12 – Yearly Auto Service Overload Methods
 * 
 * This program demonstrates method overloading by calculating 
 * yearly auto service costs using different combinations of service charges.
 */

public class YearlyAutoService {

    // Base service charge constant
    static final double BASE_SERVICE = 120.00;

    // 1. No parameters
    public static double yearlyService() {
        return BASE_SERVICE;
    }

    // 2. One parameter: oil change
    public static double yearlyService(double oilChange) {
        return BASE_SERVICE + oilChange;
    }

    // 3. Two parameters: oil change and tire rotation
    public static double yearlyService(double oilChange, double tireRotation) {
        return BASE_SERVICE + oilChange + tireRotation;
    }

    // 4. Three parameters: oil change, tire rotation, coupon
    public static double yearlyService(double oilChange, double tireRotation, double coupon) {
        return BASE_SERVICE + oilChange + tireRotation - coupon;
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Testing Yearly Service Methods:");

        // Test 1: No parameter
        System.out.println("Test 1 (No params): $" + yearlyService());
        System.out.println("Test 2 (No params): $" + yearlyService());

        // Test 2: One parameter
        System.out.println("Test 3 (Oil Change $40): $" + yearlyService(40.00));
        System.out.println("Test 4 (Oil Change $35): $" + yearlyService(35.00));

        // Test 3: Two parameters
        System.out.println("Test 5 (Oil $40, Tire $30): $" + yearlyService(40.00, 30.00));
        System.out.println("Test 6 (Oil $35, Tire $25): $" + yearlyService(35.00, 25.00));

        // Test 4: Three parameters
        System.out.println("Test 7 (Oil $40, Tire $30, Coupon $15): $" + yearlyService(40.00, 30.00, 15.00));
        System.out.println("Test 8 (Oil $35, Tire $25, Coupon $10): $" + yearlyService(35.00, 25.00, 10.00));
    }
}
