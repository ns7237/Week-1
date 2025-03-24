import java.util.Scanner;
public class CharacterFrequency {
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; 
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] > 0) {
                result[index][0] = String.valueOf(currentChar);
                result[index][1] = String.valueOf(frequency[currentChar]);
                frequency[currentChar] = 0; // Reset to avoid duplicates
                index++;
            }
        }
        return result;
    }
    public static void displayCharacterFrequency(String[][] charFrequency) {
        System.out.println("Character | Frequency");
        System.out.println("----------------------");
        for (String[] row : charFrequency) {
            System.out.println("    " + row[0] + "      |     " + row[1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[][] frequencyTable = findCharacterFrequency(input);
        displayCharacterFrequency(frequencyTable);
        scanner.close();
    }
}
