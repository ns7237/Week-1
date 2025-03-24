import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        int randomIndex = new Random().nextInt(3);
        return choices[randomIndex];
    }
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            return "Draw";
        } else if (
            (userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
            (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
            (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))
        ) {
            return "User";
        } else {
            return "Computer";
        }
    }
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[3][2];
        stats[0][0] = "Player Wins";
        stats[0][1] = String.valueOf(userWins);
        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(computerWins);
        stats[2][0] = "Win Percentage";
        double userWinPercent = ((double) userWins / totalGames) * 100;
        double computerWinPercent = ((double) computerWins / totalGames) * 100;
        stats[2][1] = "Player: " + (int) userWinPercent + "% | Computer: " + (int) computerWinPercent + "%";
        return stats;
    }
    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game No | Player Choice | Computer Choice | Winner");
        System.out.println("---------------------------------------------------");
        for (String[] result : results) {
            System.out.println(result[0] + "       | " + result[1] + "         | " + result[2] + "         | " + result[3]);
        }
        System.out.println("\nStatistics:");
        System.out.println(stats[0][0] + " : " + stats[0][1]);
        System.out.println(stats[1][0] + " : " + stats[1][1]);
        System.out.println(stats[2][0] + " : " + stats[2][1]);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userWins = 0, computerWins = 0;
        System.out.print("Enter the number of games you want to play: ");
        int numGames = scanner.nextInt();
        scanner.nextLine(); 
        String[][] results = new String[numGames][4];
        for (int i = 0; i < numGames; i++) {
            System.out.print("\nEnter your choice (Rock, Paper, Scissors): ");
            String userChoice = scanner.nextLine();
            if (!userChoice.equalsIgnoreCase("Rock") && !userChoice.equalsIgnoreCase("Paper") && !userChoice.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid choice! Please enter Rock, Paper, or Scissors.");
                i--;
                continue;
            }
            String computerChoice = getComputerChoice();
            String winner = determineWinner(userChoice, computerChoice);
            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
            results[i][0] = String.valueOf(i + 1);
            results[i][1] = userChoice;
            results[i][2] = computerChoice;
            results[i][3] = winner;
        }
        String[][] stats = calculateStats(userWins, computerWins, numGames);
        displayResults(results, stats);
        scanner.close();
    }
}
