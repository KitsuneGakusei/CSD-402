import java.io.*;
import java.util.Random;
import java.util.Scanner;

/**
 * Crystal Long
 * 7/3/2025
 * Module 9 Programming Assignment FileIO
 * This assignment demonstrates file input/output operations in Java.
 */
public class CrystalFileIO {

    public static void main(String[] args) {
        File file = new File("data.file");
        Random rand = new Random();

        try {
            // Create file if it doesn't exist
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created: " + file.getName());
            }

            // Append 10 random numbers
            FileWriter writer = new FileWriter(file, true); // append = true
            for (int i = 0; i < 10; i++) {
                int num = rand.nextInt(100); // random 0–99
                writer.write(num + " ");
            }
            writer.write("\n");
            writer.close();

            // Read and display contents
            Scanner reader = new Scanner(file);
            System.out.println("Contents of the file:");
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
