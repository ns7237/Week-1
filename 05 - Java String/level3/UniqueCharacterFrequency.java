import java.util.Scanner;
public class UniqueCharacterFrequency {
    public static char[] findUniqueCharacters(String text) {
        char[] uniqueChars = new char[text.length()];
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }
        char[] finalUniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            finalUniqueChars[i] = uniqueChars[i];
        }
        return finalUniqueChars;
    }
    public static String[][] findCharacterFrequency(String text) {
        char[] uniqueChars = findUniqueCharacters(text);
        int[] frequency = new int[uniqueChars.length];
        for (int i = 0; i < uniqueChars.length; i++) {
            char currentChar = uniqueChars[i];
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    frequency[i]++;
                }
            }
        }
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[i]);
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
