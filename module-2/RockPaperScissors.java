//Crystal Long
//Module 2 Programming Assignment - Rock, Paper, Scissors Game
// This program implements a simple Rock, Paper, Scissors game where the user plays against the computer.
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generate computer choice (1 to 3)
        int computerChoice = (int)(Math.random() * 3) + 1;

        // Prompt user input
        System.out.print("Enter your choice (1 = Rock, 2 = Paper, 3 = Scissors): ");
        int userChoice = input.nextInt();

        // Convert numbers to names
        String computerMove = getMoveName(computerChoice);
        String userMove = getMoveName(userChoice);

        // Validate user input
        if (userMove.equals("Invalid")) {
            System.out.println("Invalid input. Please enter 1, 2, or 3.");
        } else {
            System.out.println("Computer chose: " + computerMove);
            System.out.println("You chose: " + userMove);

            // Decide winner
            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 1 && computerChoice == 3) ||
                       (userChoice == 2 && computerChoice == 1) ||
                       (userChoice == 3 && computerChoice == 2)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        input.close();
    }

    // Method to convert number to move name
    public static String getMoveName(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid";
        }
    }
}
