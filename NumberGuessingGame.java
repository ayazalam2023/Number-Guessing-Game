import java.util.Random;  // Import the Random class to generate random numbers
import java.util.Scanner; // Import the Scanner class to read input from the user

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user (keyboard)
        Scanner scanner = new Scanner(System.in);

        // Create a random object to generate a random number
        Random random = new Random();

        // Generate a random number between 1 and 100 (inclusive)
        int secretNumber = random.nextInt(100) + 1;
        
        // To track the number of attempts the user has made
        int attempts = 0;

        // Variable to store the user's guess
        int userGuess = 0;

        // This variable will tell us if the user has guessed the right number
        boolean hasGuessedCorrectly = false;

        // Welcome message for the player
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've picked a number between 1 and 100. Can you guess it?");
        System.out.println("You have 10 attempts. Good luck!");

        // Allow the user a maximum of 10 tries to guess the number
        while (attempts < 10 && !hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            
            // Read the user's guess as an integer
            userGuess = scanner.nextInt();
            
            // Increment the number of attempts
            attempts++;

            // Check if the user's guess is correct
            if (userGuess == secretNumber) {
                hasGuessedCorrectly = true;  // Mark that the user has guessed correctly
            } 
            // If the guess is too low, give feedback to the user
            else if (userGuess < secretNumber) {
                System.out.println("Too low! Try guessing a higher number.");
            } 
            // If the guess is too high, give feedback to the user
            else {
                System.out.println("Too high! Try guessing a lower number.");
            }
        }

        // If the user guessed the number, congratulate them
        if (hasGuessedCorrectly) {
            System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
        } 
        // If the user didn't guess the number in 10 tries, reveal the secret number
        else {
            System.out.println("Sorry, you've used all your attempts. The number was: " + secretNumber);
        }

        // Close the scanner object to prevent resource leaks
        scanner.close();
    }
}