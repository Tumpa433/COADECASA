import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
            Random rand = new Random();
            int numberToGuess = rand.nextInt(50) + 1;
            Scanner scanner = new Scanner(System.in);
            int guess;

            System.out.println("Welcome to the number guessing game!");
            System.out.println("Guess a number between 1 and 50:");

            while (true) {
                guess = scanner.nextInt();

                if (guess == numberToGuess) {
                    System.out.println("Congratulations, you guessed the number!");
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("The number is too low. Try again:");
                } else {
                    System.out.println("The number is too high. Try again:");
                }
            }

        scanner.close();
    }
}
