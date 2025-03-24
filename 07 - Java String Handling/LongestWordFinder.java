import java.util.Scanner;
public class LongestWordFinder {
    static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longestWord = "";      
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();
        String longest = findLongestWord(sentence);
        System.out.println("The longest word is: " + longest);
    }
}
