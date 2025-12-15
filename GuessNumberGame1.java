import java.util.*;

public class GuessNumberGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int totalScore = 0;        // Score for all rounds
        int rounds = 3;            // Total rounds you want

        System.out.println("🎮 Welcome to Guess The Number Game!");
        System.out.println("You have " + rounds + " rounds.\n");

        for (int r = 1; r <= rounds; r++) {
            System.out.println("----- Round " + r + " -----");

            int number = rand.nextInt(100) + 1;   // random number 1–100
            int attempts = 7;                     // max attempts per round
            int guess;
            int attemptsUsed = 0;

            while (attempts > 0) {
                System.out.print("Enter your guess (1-100): ");
                guess = sc.nextInt();
                attempts--;
                attemptsUsed++;

                if (guess == number) {
                    System.out.println("🎉 Correct! You guessed the number!");
                    
                    // Scoring: more attempts left = more points
                    int roundScore = (attempts + 1) * 10;
                    totalScore += roundScore;

                    System.out.println("Round Score: " + roundScore);
                    break;
                } else if (guess > number) {
                    System.out.println("Too High! Try again.");
                } else {
                    System.out.println("Too Low! Try again.");
                }

                if (attempts == 0) {
                    System.out.println("❌ Out of attempts! The number was: " + number);
                }
            }
            System.out.println();
        }

        System.out.println("🏁 Game Over!");
        System.out.println("Your Total Score: " + totalScore);
        System.out.println("Thanks for playing!");
    }
}
