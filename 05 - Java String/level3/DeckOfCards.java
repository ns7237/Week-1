import java.util.Random;
import java.util.Scanner;
public class DeckOfCards {
    static String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
    static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
    static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    static void shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }
    static String[][] distributeCards(String[] deck, int n, int x) {
        if (n * x > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }
        String[][] players = new String[x][n];
        int index = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n; j++) {
                players[i][j] = deck[index++];
            }
        }
        return players;
    }
    static void printPlayersCards(String[][] players) {
        if (players == null) return;     
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println(card);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        System.out.print("Enter number of players: ");
        int x = scanner.nextInt();
        System.out.print("Enter number of cards per player: ");
        int n = scanner.nextInt();
        scanner.close();
        String[][] players = distributeCards(deck, n, x);
        printPlayersCards(players);
    }
}
