// Crystal Long Module 4 Programming Assignment 6/11/2025
// Calculate Average with different methods
public class AverageCalculator {

    // Method to calculate average short array
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short)(sum / array.length);
    }

    // Method to calculate average int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate average long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate average double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Help method to print arrays
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Overloaded help method primitive arrays
    public static void printArray(short[] array) {
        for (short element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printArray(long[] array) {
        for (long element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] array) {
        for (double element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Main test method
    public static void main(String[] args) {

        short[] shortArray = {10, 20, 30};
        int[] intArray = {5, 10, 15, 20};
        long[] longArray = {1000L, 2000L, 3000L, 4000L, 5000L};
        double[] doubleArray = {2.5, 3.5, 4.5, 5.5, 6.5, 7.5};

        System.out.print("Short array: ");
        printArray(shortArray);
        System.out.println("Average: " + average(shortArray));
        System.out.println();

        System.out.print("Int array: ");
        printArray(intArray);
        System.out.println("Average: " + average(intArray));
        System.out.println();

        System.out.print("Long array: ");
        printArray(longArray);
        System.out.println("Average: " + average(longArray));
        System.out.println();

        System.out.print("Double array: ");
        printArray(doubleArray);
        System.out.println("Average: " + average(doubleArray));
    }
}
