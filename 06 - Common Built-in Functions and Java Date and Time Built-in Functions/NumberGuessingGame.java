import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int low = 1, high = 100;
        boolean guessedCorrectly = false;
        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");       
        while (!guessedCorrectly) {
            int guess = generateGuess(low, high, random);
            System.out.println("Is your number " + guess + "?");
            System.out.println("Enter 'H' if my guess is too high, 'L' if it's too low, or 'C' if it's correct: ");           
            char feedback = scanner.next().charAt(0);
            if (feedback == 'C' || feedback == 'c') {
                System.out.println("Yay! I guessed your number correctly!");
                guessedCorrectly = true;
            } else if (feedback == 'H' || feedback == 'h') {
                high = guess - 1;
            } else if (feedback == 'L' || feedback == 'l') {
                low = guess + 1;
            } else {
                System.out.println("Invalid input. Please enter 'H', 'L', or 'C'.");
            }
        }
        scanner.close();
    }
    public static int generateGuess(int low, int high, Random random) {
        return low + random.nextInt(high - low + 1);
    }
}
