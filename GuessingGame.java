import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxAttempts = 5; // Maximum number of attempts
        int randomNumber = random.nextInt(100) + 1; // Generates random number between 1 and 100
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100. Try to guess it within " + maxAttempts + " attempts.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                break; // Move this inside the else block
            }
        }

        if (hasGuessedCorrectly) {
            System.out.println("Congratulations! You've guessed the number " + randomNumber + " correctly in " + attempts + " attempts.");
        } else {
            System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
        }

        scanner.close();
    }
}
