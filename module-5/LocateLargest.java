// Crystal Long
// 6/19/2025
// Mod 5-Programming Assignment Locate Largest and Smallest 
public class LocateLargest {

    // Locate largest in double[][]
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate largest in int[][]
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate smallest in double[][]
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate smallest in int[][]
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Main method to test
    public static void main(String[] args) {
        int[][] intArray = {
            {4, 2, 9},
            {1, 5, 6},
            {7, 3, 0}
        };

        double[][] doubleArray = {
            {2.5, 4.1, 8.6},
            {3.2, 9.9, 1.0},
            {7.3, 0.2, 5.5}
        };

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);
        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        System.out.println("Largest in int[][] at: [" + largestInt[0] + ", " + largestInt[1] + "]");
        System.out.println("Smallest in int[][] at: [" + smallestInt[0] + ", " + smallestInt[1] + "]");
        System.out.println("Largest in double[][] at: [" + largestDouble[0] + ", " + largestDouble[1] + "]");
        System.out.println("Smallest in double[][] at: [" + smallestDouble[0] + ", " + smallestDouble[1] + "]");
    }
}
