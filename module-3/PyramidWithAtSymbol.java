//Crystal Long June 7, 2025
//Module 3 Programming Assignment
// This program prints a pyramid pattern with numbers and an '@' symbol at the end of each line.
public class PyramidWithAtSymbol {
    public static void main(String[] args) {
        final int TOTAL_ROWS = 8;

        for (int row = 1; row <= TOTAL_ROWS; row++) {
            // Print leading spaces
            for (int space = 1; space <= TOTAL_ROWS - row; space++) {
                System.out.print("     "); // 5 spaces for alignment
            }

            // Print left side numbers (increasing)
            int value = 1;
            for (int i = 1; i <= row; i++) {
                System.out.printf("%5d", value);
                value *= 2;
            }

            // Print right side numbers (decreasing)
            value /= 4;
            for (int i = 1; i < row; i++) {
                System.out.printf("%5d", value);
                value /= 2;
            }

            // Add spaced @ symbol at the end of each line
            System.out.print("               @"); // spaces then @

            // Go to next line
            System.out.println();
        }
    }
}
