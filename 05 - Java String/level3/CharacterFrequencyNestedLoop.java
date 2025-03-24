import java.util.Scanner;
public class CharacterFrequencyNestedLoop {
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray(); 
        int[] frequency = new int[characters.length];
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '0') 
                continue;
            frequency[i] = 1; 
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++; 
                    characters[j] = '0'; 
                }
            }
        }
        int uniqueCount = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0')
                uniqueCount++;
        }
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index] = characters[i] + " - " + frequency[i];
                index++;
            }
        }
        return result;
    }
    public static void displayCharacterFrequency(String[] charFrequency) {
        System.out.println("Character | Frequency");
        System.out.println("----------------------");
        for (String row : charFrequency) {
            String[] parts = row.split(" - ");
            System.out.println("    " + parts[0] + "      |     " + parts[1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[] frequencyTable = findCharacterFrequency(input);
        displayCharacterFrequency(frequencyTable);
        scanner.close();
    }
}
